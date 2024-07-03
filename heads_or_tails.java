import java.util.Random;
import java.util.Scanner;
class cointoss{
  public static void main(String[] args){
    int heads=0,tails=0;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("Who are you?");
    String name = sc.next();
    System.out.println("Hello, "+name+"!");
    System.out.println("Tossing a coin...");
    for(int i=1;i<4;i++){
      int a = rand.nextInt(2);
      if(a==0){
        System.out.println("Round "+i+": Heads");
        heads++;
      }
      else{
        System.out.println("Round "+i+": Tails");
        tails++;
      }
    } 
    System.out.println("Heads: "+heads+", Tails: "+tails);
  }
}

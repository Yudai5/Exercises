import java.util.Random;
class cointoss{
  public static void main(String[] args){
    int heads=0,tails=0;
    Random rand = new Random();
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

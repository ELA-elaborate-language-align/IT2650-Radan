import java.text.DecimalFormat;
import java.util.Random;

public class Ex2 {
    
    
    public static void main(String[] args) {
         DecimalFormat g=new DecimalFormat("#.00%");
        int dice1 = 0;
           int dice2 = 0;
           int sum = 0;
           int point = 0;
           double win=0;
           double lose=0;
           Random ra = new Random();
      int r = ra.nextInt(6)+1;
      int y = ra.nextInt(6)+1;
      dice1=r;
      dice2=y;
      for(int i=1;i<=10000;i++){
          dice1=ra.nextInt(6)+1;
          dice2=ra.nextInt(6)+1;
          sum=dice1+dice2;
          if(sum==7 || sum==11 ){
              win++;
          }
          else if(sum==2||sum==3||sum==12){
              lose++;

          }
          else{
              point=sum;
              dice1=ra.nextInt(6)+1;
              dice2=ra.nextInt(6)+1;
              sum=dice1+dice2;
              while(sum!=7 && sum!=point){
                  dice1=ra.nextInt(6)+1;
                  dice2=ra.nextInt(6)+1;
                  sum=dice1+dice2;

              }

                  if(sum==7){
                      lose++;
                      
                  }
                  else if(sum==point){
                      win++;
                  }
                  dice1=ra.nextInt(6)+1;
                  dice2=ra.nextInt(6)+1;

              }

          }
      double prob=(win/(lose+win));
      System.out.println("Won: "+win+" Lost:"+lose);
      System.out.println("Wining Percentage: "+g.format(prob));
      if(win>lose){
          System.out.println("You Win!");
      }
          else{
              System.out.println("House Wins! and he will win more than you...");
          }
      
      
}
}
 
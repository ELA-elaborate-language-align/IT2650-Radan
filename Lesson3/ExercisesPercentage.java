import java.util.Scanner;
import java.text.DecimalFormat;
public class ExercisesPercentage {

    public static void main(String[] args) {
        
 Scanner input=new Scanner(System.in);
 DecimalFormat percent=new DecimalFormat("00.00%");
 int num_exercise,score,points,total_score=0,total_points=0;
 
 System.out.println("How many exercises to input?");
 num_exercise=input.nextInt();
 
 for(int i=1;i<=num_exercise;i++)
 {
     System.out.println("Score received for exercise "+i+" :");
     score=input.nextInt();
     System.out.println("Total points possible for exercise "+i+" :");
     points=input.nextInt();
     
      total_score+=score;
      total_points+=points;
 }
 System.out.println("Your total "+total_score+" out of "+total_points+", or "+percent.format((double)total_score/total_points )+".");
    }

}
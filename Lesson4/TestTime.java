
/**
 * Write a description of class TestTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTime
{
    public static void main(String[] args)
    {
        // put your code here
        Time one = new Time( );
        //one.hour = 2;
        //one.minute = 16;
        one.set(2, 37);
        
        System.out.println("time is " + one);
        System.out.println("time is " + one.getHour( ) + " : " +one.getMinute());
        Time two = new Time( -2 , 75);
        System.out.println("time is " + two);
        
        if(one.equals(two))
          System.out.println("times are equal!");
        else
          System.out.println("times are not equal!");
        
    }
}

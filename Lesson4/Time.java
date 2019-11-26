
/**
 * Write a description of class Time here.
 * 
 * @author Java Programming Fall 2019 
 * @version September 17, 2019
 */
public class Time
{
    // instance variables - replace the example below with your own
    private int hour;
    private int minute;
    
    public int getHour( )
    {
        return hour;
    }
    
    public int getMinute( )
    {
        return minute;
    }
    
     
    @Override
    public String toString( )
    {
      String out = ""+ hour + ":";
      if (minute < 10)
        out = out + "0";
        
      return out + minute;
    } 
    
    public void set(int h, int m)
    {
       h = Math.abs(h);
       m = Math.abs(m);
       
       while(m > 59)
       {
           h++;
           m-= 60;
       }
       h = h % 24;
        
       hour = h;
       minute = m;
    }
    
    public boolean equals(Time other)
    {
      return (this.hour == other.hour) && (this.minute == other.minute);   
    }

    /**
     * Constructor for objects of class Time
     */
    public Time(int hour, int minute)
    {
       // initialise instance variables
     set(hour,minute);
     }
    
    /**
     * Default constructor for objects of class Time
     */
    public Time( )
    {
       // initialise instance variables
       hour = 0;
       minute = 0;
    }
    
     /**
     * Default constructor for objects of class Time
     */
    public Time(int h )
    {
       // initialise instance variables
      this(h,0);
    }
    

}

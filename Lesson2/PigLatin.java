import java.util.*;
public class PigLatin {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 Scanner input=new Scanner(System.in);
 String firstname,lastname,lower_first,lower_last,latin_first,latin_last;
 System.out.println("Enter the First Name:");
 firstname=input.next();
 System.out.println("Enter the Last Name:");
 lastname=input.next();
 System.out.println("Full Name before PigLatin:"+ firstname+" "+ lastname);
 
 lower_first=firstname.toLowerCase();
 lower_last=lastname.toLowerCase();
 
 latin_first=lower_first.substring(1,2).toUpperCase()+lower_first.substring(2)+lower_first.substring(0,1)+"ay";
 latin_last=lower_last.substring(1,2).toUpperCase()+lower_last.substring(2)+lower_last.substring(0,1)+"ay";
 
 System.out.println("Full Name after modifying PigLatin:"+ latin_first +" "+ latin_last);
    }

}
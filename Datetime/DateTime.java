package Datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateTime 
{
    public static void main(String [] args)
    {
        Date d1=new Date();//current date in normal format.
        System.out.println(d1);
        System.out.println(d1.getTime());
       
        Date d2=new Date(1996,10,5);
        Date d3=new Date(1970,1,20);
        
        boolean a=d2.before(d3);
        boolean b=d2.after(d3);
        System.out.println("Is date before d2 ; "+a);
        System.out.println("Is date after d2 ; "+b);
        
        LocalDate d=LocalDate.now();//only latest date 
        LocalDateTime t=LocalDateTime.now();//only time
        DateTimeFormatter dt1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");// E for week sun mon displaying
        String format=t.format(dt1);
        System.out.println(d);
        System.out.println(format);
        
        
    }
}

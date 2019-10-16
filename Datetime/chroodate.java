package Datetime;

import java.time.LocalDate;
import java.time.chrono.*;

public class chroodate
{
    public static void main(String [] args)
    {
               ChronoLocalDate d=LocalDate.parse("2019-10-05");
               System.out.println(d.toEpochDay());

           
        
    }
   
}

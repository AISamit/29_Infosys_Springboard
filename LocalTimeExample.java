package day5;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;  
public class LocalTimeExample { 
	public static void main(String[] args) {  
		LocalTime startTime = LocalTime.now();   
		LocalTime endTime = startTime.plusSeconds(1);
		while(true) {
		    LocalTime current = LocalTime.now();
		    int second = current.getSecond();           // Getting the seconds components
		    if(second == endTime.getSecond()) {
		        System.out.println("Over");
		        break;
		    }
		    else {
		    	System.out.println("Loop is running");
		    }
		}
		
		System.out.println(ZonedDateTime.now());                              // Output: 2016-11-21T12:13:28.960+05:30[Asia/Calcutta]
		System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Athens")));    // Output: 2016-11-21T08:43:28.960+02:00[Europe/Athens]

	}
}  
// The while loop will run for 1 second

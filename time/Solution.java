import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Next Hour\t2.Next Minute\t3.Next Second");
		System.out.println("4.Previous Hour\t5.Previous Minute\t6.Previous Second");
		int choice = Integer.parseInt(bf.readLine());
		System.out.print("Enter the hour");
		int hour = Integer.parseInt(bf.readLine());
		System.out.print("Enter the minute");
		int minute = Integer.parseInt(bf.readLine());
		System.out.print("Enter the second");
		int second = Integer.parseInt(bf.readLine());
		Time time = new Time(hour,minute,second);
		switch(choice) {
			case 1:
			time.nextHour();
			break;
			case 2:
			time.nextMinute();
			break;
			case 3:
			time.nextSecond();
			break;
			case 4:
			time.previousHour();
			break;
			case 5:
			time.previousMinute();
			break;
			case 6:
			time.previousSecond();
			break;
		}	
	}
}

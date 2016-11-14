public class Time {
	int hour;
	int minute;
	int second;
	Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void nextHour() {
		hour = hour+1;
		if(hour == 24)
			hour = 0;
		print();
	}
	void nextMinute() {
		minute = minute+1;
		if(minute == 60) {
			minute = 0;
			hour = hour+1;
			if(hour == 24)
				hour = 0;
		}
		print();
	}
	void nextSecond() {
		second = second+1;
		if(second == 60){
			second = 0;
			minute = minute+1;
			if(minute == 60) {
				minute = 0;
				hour = hour+1;
				if(hour == 24)
					hour = 0;
			}
		}
		print();
	}
	void previousHour() {
		if(hour == 0)
			hour = 23;
		else
			hour = hour-1;
		print();
	}
	void previousMinute() {
		if(minute == 0) {
			minute = 59;
			if(hour == 0)
				hour = 23;
			else
				hour = hour-1;
		}
		else
			minute = minute-1;
		print();
	}
	void previousSecond() {
		if(second == 0){
			second = 59;
			if(minute == 0) {
				minute = 59;
				if(hour == 0)
					hour = 23;
				else
					hour = hour-1;
			}
			else 
				minute = minute-1;
		}
		else 
			second = second-1;
		print();
	}
	void print() {
			System.out.print(String.format("%02d",hour)+":");
			System.out.print(String.format("%02d",minute)+":");
			System.out.print(String.format("%02d",second));
	}
}

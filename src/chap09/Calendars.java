package chap09;

import java.util.Calendar;

public class Calendars {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("현재 시각은: " + hour+" 시 "+minute+" 분 입니다.");
		
		if(hour>4 && hour<12) {
			System.out.println("Good Moring");
		}else if(hour<18 && hour<=12) {
			System.out.println("Good Afternoon");
		}else if(hour<22 && hour<=18) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}

	}

}

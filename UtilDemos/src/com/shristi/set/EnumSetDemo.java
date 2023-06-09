package com.shristi.set;

import java.util.EnumSet;
import java.util.Set;

enum Weekdays{ 
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
}
public class EnumSetDemo {

	public static void main(String[] args) {
		Set<Weekdays> enumSet = EnumSet.allOf(Weekdays.class);
		for (Weekdays weekday : enumSet) {
			System.out.println(weekday.name().toLowerCase());
		}
		System.out.println();
		Set<Weekdays> enumSet1 = EnumSet.of(Weekdays.FRIDAY,Weekdays.TUESDAY);
		for (Weekdays weekday : enumSet1) {
			System.out.println(weekday);
			switch(weekday) {
				case TUESDAY:
					System.out.println("Heavy traffic");
					break;
				case FRIDAY:
					System.out.println("empty roads");
			}
		}
	}

}

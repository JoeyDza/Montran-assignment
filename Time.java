package com.montran.pojo;

public class Time {
private int hours;
private int minutes;

public void settime(int hours,int minutes) {
	this.hours= hours;
	this.minutes= minutes;
}

public void showtime() {
	System.out.println("Hours: "+ hours +", Minutes"+ minutes);	
}

public Time sum(Time time) {
	
	Time t =new Time();

	t.minutes = this.minutes + time.minutes;
	t.hours = this.hours + time.hours;
	return t;
}

}

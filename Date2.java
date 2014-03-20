
public class Date2 {
	private int year,day,month;
public Date2()
{
	
}
public Date2(int day,int mounth,int year)
{
this.day=day;
this.year=year;
this.month=mounth;
}
public boolean isBigger(Date2 mydate)
{
if(this.year<=mydate.year)	{
	if(this.month<=mydate.month)
	{
		if(this.day<=mydate.day)
		{
			return true;
		}
		else
			return false;
	}
	else
		return false;
}
else
	return false;
}

public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public String getMonth() {
switch(month)
{
	case 1:
		return "January";
	case 2:
		return "February";
	case 3:
		return "March";
	case 4:
		return "April";
	case 5:
		return "May";//saidaltıntop
	case 6:
		return "June";
	case 7:
		return "July";
	case 8:
		return "August";
	case 9:
		return "September";
	case 10:
		return "October";
	case 11:
		return "November";
	case 12:
		return "December";
	default:
		return"";
}
}
public void setMonth(int month) {
	this.month = month;
}
public String getDate() {
	return day+" "+getMonth()+" "+year;

}
}

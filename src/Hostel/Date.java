package Hostel;

public class Date {
	int day;
	int month;
	int year;
			Date(int day,int month,int year){
				this.day=day;
				this.month=month;
				this.year=year;
			}
		public void setDay(int day){
			this.day=day;
		}
		public void setMonth(int month){
			this.month=month;
		}
		public void setYear(int year){
			this.year=year;
		}
		public int qetDay(){
			return day;
		}
		public int qetMonth(){
			return month;
		}
		public int qetYear(){
			return year;
		}
		public static Date addDate(int a,int b,int c){
			Date dd = new Date(a,b,c);
			return dd;
		}
		
}

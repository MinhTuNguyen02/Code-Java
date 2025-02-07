
package gdb;

class MyDate{
    private int year;
    private int month;
    private int day;
    private String[] strMonths={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private String[] strDays={"Sunday","Monday","TuesDay","Wednesday","ThursDay","Friday","Saturday"};
    private int[] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    public boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    
    public boolean isValidDate(int year, int month, int day){
        if (year >= 1800 && year <= 9999 && month >= 1 && month <= 12) {
            int lastDay = daysInMonths[month-1];
            if (month == 2 && isLeapYear(year)) {
                lastDay = 29;
            }
            return (day >= 1 && day <= lastDay);
        } 
        return false;
    }
    
    public int getDayOfWeek(int year, int month, int day){
        int centuryTable[] = {4, 2, 0, 6, 4, 2, 0, 6};
        int MonthTable[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int MonthLeapYearTable[] = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        int century = year / 100;
        int twoDigitYear = year % 100;
        int centuryTableIndex = (century - 17) % 8;
        if (centuryTableIndex < 0) {
           centuryTableIndex += 8;
        }
        int sum = centuryTable[centuryTableIndex] + twoDigitYear + twoDigitYear / 4;
        if (isLeapYear(year)) {
           sum += MonthLeapYearTable[month-1];
        } else {
           sum += MonthTable[month-1];
        }
        sum += day;
        return sum % 7;
    }
    
    public MyDate nextDay(){
        int lastDay=daysInMonths[month-1];
        if(month==2 && isLeapYear(year)){
            lastDay=29;
        }
        if(day==lastDay){
            if(month==12){
                year++;
                month=1;
                day=1;
            }else{
                month++;
                day=1;
            }
        }else{
            day++;
        }
        return this;
    }
    
    public MyDate nextMonth(){
        if(month==12){
            year++;
            month=1;
        }else{
            month++;
        }
        
        int lastDay=daysInMonths[month-1];
        if(month==2 && isLeapYear(year)){
            lastDay=29;
        }
        if(day>lastDay){
            day=lastDay;
        }
        return this;
    }
    
    public MyDate nextYear(){
        year++;
        if(month==2 && day==29 && !isLeapYear(year)){
            day=28;
        }
        return this;
    }
    
    public MyDate previousDay(){
        int lastDay=daysInMonths[month-1];
        if(month==2 && isLeapYear(year)){
            lastDay=29;
        }
        if(day==1){
            if(month==1){
                year--;
                month=12;
                day=lastDay;
            }else{
                month--;
                day=lastDay;
            }
        }else{
            day--;
        }
        return this;
    }
    
    public MyDate previousMonth(){
        if(month==1){
            year--;
            month=12;
        }else{
            month--;
        }
        
        int lastDay=daysInMonths[month-1];
        if(month==2 && isLeapYear(year)){
            lastDay=29;
        }
        if(day>lastDay){
            day=lastDay;
        }
        return this;
    }
    
    public MyDate previousYear(){
        year--;
        if(month==2 && day==29 && !isLeapYear(year)){
            day=28;
        }
        return this;
    }

    @Override
    public String toString() {
        return getClass().getName()+"["+year+"/"+month+"/"+day+"]";
    }        
}
public class MainDay {
    public static void main(String[] args) {
        MyDate md=new MyDate(2024, 12, 31);
        System.out.println(md.isLeapYear(md.getYear()));
        System.out.println(md.isValidDate(2022, 12, 23));
        
        System.out.println(md.nextYear());
        System.out.println(md.nextDay());
        System.out.println(md.previousDay());
        System.out.println(md.previousMonth());
    }
}

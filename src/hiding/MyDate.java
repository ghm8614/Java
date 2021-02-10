package hiding;

public class MyDate {

    //  정보은닉(Info hiding) : 정보보호, 오류방지
    //  private한 후, 필요한 부분만 getter and setter 메소드 통해 오픈하는 것.
    private int day;
    private int month;
    private int year;

    //  public 메소드로 값을 넣을 때 : set, 값을 가져갈 때 : get
    //  멤버변수와 매개변수 구분을 위해 this 키워드를 사용

    public int getDay() { return day; }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void showDate() {
        System.out.println(year + "년" + month + "월" + day + "일 입니다.");
    }
}

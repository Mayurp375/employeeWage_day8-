public class emplyeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage");
        attendance attendance = new attendance();
        attendance.Check();

        dailyWage dailyWage = new dailyWage();
        dailyWage.dailyWage();

        months months = new months();
        months.wageMonth();
    }
}

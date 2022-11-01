import java.util.Random;

public class dayOrMonth {
    public  void month() {
        int dailyHour;
        String type = "";
        int perHour = 20;
        int waage;

        int totalHour = 0;
        int i = 0;
        while ( i <= 20 && totalHour <= 100) {
            i++;
            Random random = new Random();
            int num = random.nextInt(3);
            switch (num) {
                case 1:
                    dailyHour = 8;
                    type = "fulltime";
                    break;
                case 2:
                    dailyHour = 4;
                    type = "parttime";
                    break;
                default:
                    dailyHour = 0;
                    type = "absent";
                    break;
            }
            totalHour = totalHour + dailyHour;
            System.out.println(i);
            System.out.println("total hours works" + totalHour + "jobype" + type);
        }

        waage = totalHour * perHour;
        System.out.println("months wage is" + " " + waage);
    }
}

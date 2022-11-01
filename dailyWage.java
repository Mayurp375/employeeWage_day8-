import java.util.Random;

public class dailyWage {
    public  void dailyWage() {
        int dailyHour;
        int perHour = 20;

        Random random = new Random();
        int num = random.nextInt(3);
        System.out.println(num);

        if (num == 1){
            System.out.println("employee is fullTime");
            dailyHour = 8;

        }else if (num == 2) {
            System.out.println("employee is parttime");
            dailyHour = 4;
        }else {
            System.out.println("employee is absent");
            dailyHour = 0;
        }

        //calculat daily wage
        int waage = dailyHour * perHour;
        System.out.println(waage);
    }
}

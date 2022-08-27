public class Main {
    public static void main(String[] args) {

        //Task 1

        int count = 1;
        while (count < 11) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println(" ");
        for (int i = 10; i > 0; --i) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //Task 2

        for (int dayNumber = 2; dayNumber <= 31; dayNumber++) {
            if ((dayNumber - 2) % 7 == 0) {
                System.out.println("Сегодня пятница, " + dayNumber + " число. Необходимо подготовить отчет.");
            }
        }

        //Task 3

        int currentYear = 2022;
        int firstBorder= currentYear - 200;
        int secondBorder= currentYear + 100;
        int startYear = firstBorder - firstBorder % (firstBorder/79)  ;

        for (int i = startYear + 79 ; i < secondBorder; i = i + 79) {

            System.out.println(i);

        }


    }
}


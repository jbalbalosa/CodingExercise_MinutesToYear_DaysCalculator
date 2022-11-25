public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Exercise: Minutes To Years and Days Calculator");
        System.out.println("");

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(1440);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else if (minutes == 0) {
            System.out.println(minutes + " min = 0 y and 0 d" );
        } else {
            long year = 0; long day = 0;
            year =((minutes / 60) / 24) / 365;
            if (year >= 1) {
                day = ((minutes / 60) / 24) % (year * 365);
            } else {
                day = ((minutes / 60) / 24);
            }
            System.out.println(minutes + " min = " + year + " y and " + day + " d" );
        }
    }
}

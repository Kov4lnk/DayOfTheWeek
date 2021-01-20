package Ray.Andy;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        DayOfTheWeek.printDayOfTheWeek(-1);
        DayOfTheWeek.printDayOfTheWeek(0);
        DayOfTheWeek.printDayOfTheWeek(1);
        DayOfTheWeek.printDayOfTheWeek(2);
        DayOfTheWeek.printDayOfTheWeek(3);
        DayOfTheWeek.printDayOfTheWeek(4);
        DayOfTheWeek.printDayOfTheWeek(5);
        DayOfTheWeek.printDayOfTheWeek(6);
        DayOfTheWeek.printDayOfTheWeek(7);
    }

    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}

import java.util.Scanner;

public class overtime {
    private static final double REGULAR_HOURS_PER_DAY = 8;
    private static final double OVERTIME_RATE = 1.5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          
            
            double totalRegularHoursWeek1 = 0;
            double totalOvertimeHoursWeek1 = 0;

            
            
            double totalRegularHoursWeek2 = 0;
            double totalOvertimeHoursWeek2 = 0;

            
            System.out.println("Week 1:");
            for (int day = 1; day <= 5; day++) { // Assuming workdays are Monday to Friday
                System.out.print("Enter hours worked for Day " + day + ": ");
                double hoursWorked = scanner.nextDouble();

                if (hoursWorked > REGULAR_HOURS_PER_DAY) {
                    totalRegularHoursWeek1 += REGULAR_HOURS_PER_DAY;
                    totalOvertimeHoursWeek1 += hoursWorked - REGULAR_HOURS_PER_DAY;
                } else {
                    totalRegularHoursWeek1 += hoursWorked;
                }
            }

            
            System.out.println("Week 2:");
            for (int day = 1; day <= 5; day++) {
                System.out.print("Enter hours worked for Day " + day + ": ");
                double hoursWorked = scanner.nextDouble();

                if (hoursWorked > REGULAR_HOURS_PER_DAY) {
                    totalRegularHoursWeek2 += REGULAR_HOURS_PER_DAY;
                    totalOvertimeHoursWeek2 += hoursWorked - REGULAR_HOURS_PER_DAY;
                } else {
                    totalRegularHoursWeek2 += hoursWorked;
                }
            }

           
            double regularPayWeek1 = totalRegularHoursWeek1 * REGULAR_HOURS_PER_DAY;
            double overtimePayWeek1 = totalOvertimeHoursWeek1 * OVERTIME_RATE * REGULAR_HOURS_PER_DAY;

            double regularPayWeek2 = totalRegularHoursWeek2 * REGULAR_HOURS_PER_DAY;
            double overtimePayWeek2 = totalOvertimeHoursWeek2 * OVERTIME_RATE * REGULAR_HOURS_PER_DAY;

            double totalNetPay = regularPayWeek1 + overtimePayWeek1 + regularPayWeek2 + overtimePayWeek2;

          
            System.out.println("\nPayroll Summary:");
            System.out.printf("Regular Hours Week 1: %.2f%n", totalRegularHoursWeek1);
            System.out.printf("Overtime Hours Week 1: %.2f%n", totalOvertimeHoursWeek1);
            System.out.printf("Regular Pay Week 1: $%.2f%n", regularPayWeek1);
            System.out.printf("Overtime Pay Week 1: $%.2f%n", overtimePayWeek1);
            System.out.println("------------------------------");
            System.out.printf("Regular Hours Week 2: %.2f%n", totalRegularHoursWeek2);
            System.out.printf("Overtime Hours Week 2: %.2f%n", totalOvertimeHoursWeek2);
            System.out.printf("Regular Pay Week 2: $%.2f%n", regularPayWeek2);
            System.out.printf("Overtime Pay Week 2: $%.2f%n", overtimePayWeek2);
            System.out.println("------------------------------");
            System.out.printf("Total Net Pay: $%.2f%n", totalNetPay);
        }
    }
}

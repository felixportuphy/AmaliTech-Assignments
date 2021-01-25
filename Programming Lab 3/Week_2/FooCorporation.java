public class FooCorporation {

    public static void main(String[] args) {
         FooCorporation employee_1 =new FooCorporation();
        FooCorporation employee_2;
        FooCorporation employee_3;

        employee_1.printEmployeePay(7.50,35);
        employee_1.printEmployeePay(8.20,47);
        employee_1.printEmployeePay(10.00,73);
    }



      public static final  double MINIMUM_WAGE_PER_HOUR = 8.00;
      public static final  double OVERTIME_RATE = 1.5;
      public static  double employee_Pay =0.00;
      public static   double employee_Overtime_Pay = 0.00;
      public static  double overtime;
      public static  double totalPay;

    public static void printEmployeePay(double basePay, int hoursWorked){

        if(basePay<MINIMUM_WAGE_PER_HOUR){
            System.out.println("Error your base pay is less than minimum hour wage");
            return;
        }else{

            if(hoursWorked == 40){
                employee_Pay+= basePay * hoursWorked;
                System.out.println("Your TotalEmployee pay =" + " $ " +employee_Pay);
            }else if( (hoursWorked > 40) && (hoursWorked <=60)){
                overtime = hoursWorked % 40;
                employee_Pay=basePay*40;
                employee_Overtime_Pay = basePay * OVERTIME_RATE * overtime;
                employee_Pay+=employee_Overtime_Pay;
                totalPay= employee_Pay +employee_Overtime_Pay;
                System.out.println("You earned "+employee_Pay+" as Regular pay and " +employee_Overtime_Pay+
                        " as Overtime pay. Your TotalEmployee pay =" + " $ "+totalPay);
            }else if(hoursWorked>60){
                System.out.println("Error  work hours must not exceed 60 hrs");
                double remainingTime =hoursWorked%60;
                hoursWorked-= remainingTime;
                employee_Pay+=basePay*hoursWorked;
                employee_Overtime_Pay+=basePay*OVERTIME_RATE*(hoursWorked-40);
                employee_Pay+=employee_Pay+employee_Overtime_Pay;
                totalPay= employee_Pay +employee_Overtime_Pay;
                totalPay= employee_Pay +employee_Overtime_Pay;
                System.out.println("You earned "+employee_Pay+" as Regular pay and " +employee_Overtime_Pay+
                        " as Overtime pay. Your TotalEmployee pay =" + " $ " +totalPay);
            } else{
                System.out.println("Error Detected");
            }

        }

    }



}

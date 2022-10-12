import java.util.Random;

public class EmployeeSalary {
    public static Random random = new Random();
    public static int x = random.nextInt(2);
     public static void EmployeePresent(){
         System.out.println(x);
         if(x>0.5) {
             System.out.println("Employee is Present");
         }else {
             System.out.println("Employee is absent");
         }
     }
}

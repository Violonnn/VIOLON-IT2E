
package violon.it2e;
import java.util.Scanner;
public class OHA {
    
    public static void enter(){
          Scanner in = new Scanner (System.in);
        VIOLONIT2E[] ad = new VIOLONIT2E[100];
            
        System.out.print("Enter number of applications: ");
        int num = in.nextInt();
        
        for (int i = 0; i < num ; i++){
            System.out.println("Enter details of Applications: "+(i+1));
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Age: ");
            int age = in.nextInt();
            System.out.printf("BMI: ");
            double bmi = in.nextDouble();
            System.out.print("Fitness Goal: ");  
            String fg = in.nextLine();
  
           ad[i].getClass();
           ad[i].add(id, name, age, bmi, fg);   
        }
         for (int i = 0; i < num; i++){
            ad[i].view();
        }
       
        
}
    
   

}

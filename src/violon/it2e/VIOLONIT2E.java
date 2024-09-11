
package violon.it2e;

public class VIOLONIT2E {
   int id;
   String name;
   int age;
   double bmi;
   String fg;
   
      public void add(int id, String name, int age, double bmi, String fg){
    this.id = id;
    this.name = name;
    this.age = age;
    this.bmi = bmi;
    this.fg = fg;
}
      
   public void view(){
       System.out.println("%-10s %-10s %-10s %-10s %-10s %-10s"+"ID"+"NAME"+"AGE"+"BMI"+"FITNESS GOALS"+"ELIGIBILITY STATUS");
       System.out.printf("%-10d %-10s %-10d %-10f %-10s %-10s",this.id,this.name,this.age,this.bmi);
   }   
      
      
      
  public static void main(String[] args) {
        OHA.enter();           
 
    }
     
    

    
}

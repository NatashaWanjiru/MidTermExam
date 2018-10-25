/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

/**
 *
 * @author ADMIN
 */
public class ExamTest {
    public static void main(String[]args ){
        String name = "natasha";
        double height= 1.0;
        double weight =60.5;
        boolean healthy =true;
       double bmi =20;
       if (bmi==20)
    
       
    System.out.println(healthy);
    
    double underfed =20;
    if (bmi<18)
        
        System.out.println(underfed);
     
      System.out.println (getBMI());
    }
    
    public static double getBMI(){
      double m= 1.56f;
      double kgs=50;
       double  bmi= (kgs/m*m);
       
       return 20.0;
    }
   
    
            
     
}


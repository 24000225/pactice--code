
package quadratic.fomula;

//my first practicing code**
// 3x^2 + 6x + 8 = aX + bX +c

public class QuadraticFomula {
      
   
    public static void main(String[] args) {
        
        double a = 3;
        double b = 6;
        double c = 8;
        
        double answer1;
               answer1 = Math.sqrt(b*b)- 4*a*c;
              double answer2 = - b + answer1;
               
               answer2= answer1/(2*a);
               
               
               System.out.println("X=" + answer2);
                        
                        
                      
                        
    }
    
}

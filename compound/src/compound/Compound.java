
package compound;


public class Compound {
    
    public static void main(String[] args) {
      // A = P(1 +I)^n      A:Amount P:principal amount
     //                     I:rate or interest N:years
      
        double amount;
        double principal= 1700;
        double rate= 0.5;
        
        for (int year=3;year<=3;year++){
            
            amount=principal*Math.pow(1 + rate, year);
            
            System.out.println(year +" years amount = " +amount);
        }
    }
    
}

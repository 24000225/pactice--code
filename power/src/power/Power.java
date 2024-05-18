
package power;
public class Power {

    public static void main(String[] args) {
        
        
        int c = 3;        int b=4;
        int d = c + b;       
        System.out.println("d =" +d);
        
        int e=(int) Math.pow(d, b);        
        System.out.println("e=" +e);
        
        int qq = (int) Math.pow(d, c);       
        System.out.println("qq ="+qq ); 
        
        int F = e - qq;        
        System.out.println("F=" +F);
        
        boolean z = F < e;        
        System.out.println("z is "+z );
        
        boolean r = F == e;        
        System.out.println("r is "+r);
        
        boolean T = F > e;       
        System.out.println("T is "+T);
        
        boolean h = F == qq;
        System.out.println("h is "+h);
        
       
    }
   
    
    
}

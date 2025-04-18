
package bakha2;

import java.util.ArrayList;
public class Bakha2 {

    
    public static void main(String[] args) {
      // TODO code application logic here
      
      ArrayList<String>modules = new ArrayList<>();
      
      modules.add("tshivenda");
      modules.add("..english");
      modules.add("..maths");
      modules.add("..life science");
      modules.add("geography");
      modules.add("history");
      modules.add("agriculture");
      modules.add("technology");
      modules.add("EMS");
      modules.add(" L.O");
      
        System.out.println("AVALIABLE MODULES= "+modules);
      
      String select = modules.get(0);
      String a = modules.get(1);
      String b = modules.get(2);
      String c = modules.get(3);
        System.out.println("SELECTED modules = "+select +a +b+c);
        
    }
    
}

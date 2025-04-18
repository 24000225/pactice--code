



package banomsa;


import java.util.Scanner;
public class Banomsa {

    
    public static void main(String[] args) {
        Scanner hakundwi = new Scanner(System.in);
        String name;
        System.out.println("PLEASE ENTER YOUR NAME");
        name = hakundwi.nextLine();
        
        String surname;
        System.out.println("NOW ENTER YOUR tshifani");
        surname = hakundwi.nextLine();
        
        String fullnames = name + surname;
        
        
        System.out.println("WELCOME "+ fullnames);
        
        
        
    }
    
}

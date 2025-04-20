

package com.mycompany.electionsstatistics;

import java.util.Scanner;
public class ElectionsStatistics {

    public static void main(String[] args) {
        //NAMES & NUMBER OF VOTES
        String politicalpartyA;
        Scanner hakundwi = new Scanner(System.in);
        System.out.println("enter the name of the politicalP.A");
        politicalpartyA =hakundwi.nextLine();
        String politicalpartyB;
        System.out.println("enter the name of the politicalP.B");
         politicalpartyB=hakundwi.nextLine();
          String politicalpartyC; 
         System.out.println("enter the name of the politicalP.C");
        politicalpartyC =hakundwi.nextLine();
         
        int numberofvotesA;
        System.out.println("enter the number of votes of A");
        numberofvotesA =hakundwi.nextInt();
         int numberofvotesB;
        System.out.println("enter the number of votes of B");
        numberofvotesB=hakundwi.nextInt();
        int numberofvotesC;
        System.out.println("enter the number of votes of C");
        numberofvotesC =hakundwi.nextInt();
        
      // CALCULATING THE PERCENTAGE OF VOTES  
        
        int totalvotes= numberofvotesA+numberofvotesB+numberofvotesC;
        double percentMultiplier = 100.0;
        double APercent;
               APercent = ((double)numberofvotesA/totalvotes)*percentMultiplier;
        double BPercnt;
        BPercnt =((double)numberofvotesB/totalvotes)*percentMultiplier;
        double CPercnt;
        CPercnt= ((double)numberofvotesC/totalvotes)*percentMultiplier;
        
        
        System.out.println("PEOPLE WHO VOTED ARE "+totalvotes);
        System.out.println("THE "+politicalpartyA+" HAS "+numberofvotesA+"VOTES AND "+APercent+"% VOTES");
        System.out.println("THE "+politicalpartyB+" HAS "+numberofvotesB+"VOTES AND "+BPercnt+"% VOTES");
        System.out.println("THE "+politicalpartyC+" HAS "+numberofvotesC+"VOTES AND "+CPercnt+"% VOTES");
    }
}

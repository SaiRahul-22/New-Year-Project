package epam.com.maven;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 .out.println("calling of SweetPackage class\n");
        Sweet_analysis.main(args);
        
        System.out.println("calling of CandiesPackage class\n");
        Candies_analysis.main(args);
        
        System.out.println("calling of ChoclatesPackage class\n");*/
        public class App
        {
            @SuppressWarnings("resource")
            public static void main( String[] args )
            {
                Scanner s=new Scanner(System.in);
                System.out.println("Enter maximum price:");
                int mp=s.nextInt();
                ArrayList<String> Candy=new ArrayList<String>();
                ArrayList<String> Chocos=new ArrayList<String>();
                Candy.add("gems");
                Candy.add("Lollipops");
                Chocos.add("BarOne");
                Chocos.add("Perk");

        Chocos_anals.main(args);
        
        int total_weight=0;
        total_weight=Sweet_anals.Sweet_Weight+Candy_anals.Candy_Weight+Chocos_anals.TW_Chocos;
        System.out.println("Total weight of the New Year Gift is"+total_weight+"Gms");
        
        int total_price=0;
        total_price=Sweet_anals.Sweet_Price+Candy_anals.Candy_Price+Chocos_anals.TP_Chocos;
        if(mp<total_price) {
        	System.out.println("Gift price more than expected. Please get within range");
    }
        else {
        	System.out.println("Total price of the gift is"+total_price+"Rs.");
        }
        
        
        
        
        
        
    }
}

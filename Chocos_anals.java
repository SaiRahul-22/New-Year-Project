package epam.com.maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chocos_anals {
	public static int TW_Chocos = 0;
	public static int TP_Chocos = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
    	BarOne B = new BarOne();
    	Perk P = new Perk();
    	
    	System.out.println("Enter size of BarOne(1 to 10): ");
    	B.getsize(scan.nextInt());
    	
    	System.out.println("Enter size of Perk (1 to 10): ");
    	P.getsize(scan.nextInt());
    	
    	System.out.println("Enter quantity of BarOne: ");
    	int dq = scan.nextInt();
    	
    	System.out.println("Enter quantity of Perk: ");
    	int sq = scan.nextInt();
    	
    	System.out.println("Enter price of BarOne: ");
    	B.price = scan.nextInt();
    	
    	System.out.println("Enter price of Perk: ");
    	P.price = scan.nextInt();
    	
    	
    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = B.display();
    	int ss = P.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("BarOne");
        		ch.add("Perk");
        	}
        	else{
        		ch.add("Perk");
        		ch.add("BarOne");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("Perk");
    		ch.add("BarOne");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input");
    		return;
    	}
    	
    	TW_Chocos = B.total_w(dq) + P.total_w(sq);
    	System.out.println(TW_Chocos +" Grms");
    	
    	TP_Chocos = B.total_p(dq) + P.total_p(sq);
    	System.out.println(TP_Chocos +" Rs.");
	}
	
}



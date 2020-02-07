package epam.com.maven;

import java.util.Scanner;

public class Candy_anals {

	public static int Candy_Weight=2;
	public static int Candy_Price=2;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximum number of candies: " + Candies.range);
    	Lollipops lp = new Lollipops();
    	Gems gm = new Gems();
    	System.out.println("Enter Quantities of Lollipops and Gems:");
    	lp.quantity(scan.nextInt());
    	gm.quantity(scan.nextInt());
    	if(lp.quantity+gm.quantity<=Candies.range) {
    	System.out.println("Options:\n1.Quantity\n2.Total Candies");
    	int op = scan.nextInt();
    	if(op==1) {
    		System.out.println("Enter quantity of range within:");
    		int qun = scan.nextInt();
    		if(lp.display()<=qun) {
    			System.out.println("Lollipops are in range of "+qun);
    			System.out.println("No of Lollipopss are : "+lp.display());
    		}
    		else {
    			System.out.println("Gems are in range of "+qun);
    			System.out.println("No of Gems are : "+gm.display());
    		}
    	}
    	else if(op==2) {
        	int total_range = lp.display()+gm.display();
        	if(total_range<Candies.range) {
        		System.out.println("Candies are with in range");
            	System.out.println("Total number of candies in the present are : " + total_range);
        	}
        	else {
        		System.out.println("Candies are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	Candy_Weight = gm.cal_w(gm.quantity)+lp.cal_w(lp.quantity);
    	System.out.println("Total weight of candies: "+Candy_Weight+" grms\n");
    	
    	Candy_Price = gm.cal_p(gm.quantity) + lp.cal_p(lp.quantity);
    	System.out.println("Total price of candies: "+Candy_Price+" Rs.\n");
    	}
    	else {
    		System.out.println("Candies out of range");
    		return;
    	}
	}
}


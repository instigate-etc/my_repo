package online.store;

import java.util.Scanner;

public class Store {
	int h = 0;
	int h1 = 0;
	public String input;
	String s1;
	String p1;
	int k1;
	int k;
	Bag bag = new Bag();
	Shoes shoes = new Shoes();
	Product product = new Product();
	Scanner input1 = new Scanner(System.in);
	double total_value = 0;

	public void shopper() {
		k = 0;
		k1 = 0;
		int yes = 0;
		int yes1 = 0;
		System.out.print("Brand Bag ");
		String s = input1.next();
		System.out.print("Count Bag ");
		String s1 = input1.next();
		for (String t : bag.getBrands()) {
			if (s.equals(t)) {
				bag.setCounts(new int[] { bag.getCounts()[0],
						bag.getCounts()[1],
						bag.getCounts()[k] - Integer.parseInt(s1),
						bag.getCounts()[3] });
				if (bag.getCounts()[k]<0){
					System.out.println("This brands off....");
				}else{
					System.out.println(bag.getCounts()[k]);
					
				}
				yes = 1;
				total_value=total_value+Integer.parseInt(s1)*bag.getValues()[k];
			}
			k = k + 1;
		}
		ifbe(yes);
		System.out.print("Brand Shoes ");
		String p = input1.next();
		System.out.print("Count Shoes ");
		String p1 = input1.next();
		for (String t1 : shoes.getBrands()) {
			if (p.equals(t1)) {

				shoes.setCounts(new int[] { shoes.getCounts()[0],
						shoes.getCounts()[1],
						shoes.getCounts()[k1] - Integer.parseInt(p1),
						shoes.getCounts()[3] });
			if (shoes.getCounts()[k1]<0){
				System.out.println("This brands off....");
			}else{
				System.out.println(shoes.getCounts()[k1]);
				
			}yes1 = 1;
				total_value=total_value+Integer.parseInt(p1)*shoes.getValues()[k1];
			}
			k1 = k1 + 1;

		}
		ifbe(yes1);
		
	}

	private void ifbe(int yes) {
		if (yes == 0) {
			System.out.println("Please we havn't this Brand");
		}

	}

	public void store() {
		int y = 0;
		int y1 = 0;
		System.out
				.println("-------------------------Online_shop_product------------------------");
		System.out
				.println("-------------------------Online_shop_product_Shoes------------------------");
		while (y < shoes.getCounts().length) {
			System.out.println(shoes.getBrands()[y] + " "
					+ shoes.getCounts()[y] + " " + shoes.getValues()[y]);
			y++;
		}
		System.out
				.println("-------------------------Online_shop_product_Bags------------------------");
		while (y1 < bag.getCounts().length) {
			System.out.println(bag.getBrands()[y1] + " " + bag.getCounts()[y1]
					+ " " + bag.getValues()[y1]);
			y1++;
		}
		 System.out.println(total_value);
	}

}

package sort;

public class HajordakanMin {
static int k=0;
	public static void main(String[] args) {
		for (int i = 0; i < args.length ; i++) {
				for (int j = i+1; j < args.length; j++) {
				if (Integer.parseInt(args[i]) >Integer.parseInt(args[j])) {
				
					int c = Integer.parseInt(args[i ]);
					args[i] = args[j];
					args[j] = Integer.toString(c);
				}
				k=k+1;
				}
				for (int f = 0; f < args.length; f++) {
					System.out.print(args[f] + " ");
				}

			System.out.print("\n");
			
		}
		System.out.print(k);
	}

}

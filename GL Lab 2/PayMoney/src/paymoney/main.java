package paymoney;

import java.util.Scanner;

public class main {
	
	void targetachieve (int[] transactions) {
		
		int total;
		int valueTarget;
		int values = 0;	
		int sum = 0;	

		
		System.out.print("Enter the total no of targets that needs to be achieved\n ");
		Scanner in=new Scanner(System.in);
		total=in.nextInt();
		
		while(total--!=0) {	
			
			System.out.println("Enter the value of target\n ");
			valueTarget=in.nextInt();
			
			
			for(int i=0; i<transactions.length; i++) {
				sum+=transactions[i];
			
			if(sum >= valueTarget) {
				System.out.println("Target achieved after "+ (i+1)+" Transactions\n");
				System.out.println();
				values=1;	
				break;
			}
		}
			if(values==0) {
					System.out.println("Given Target Not Achieved");
				}
			}
		in.close();
	}
	

		static int[]transactions; 

		public static void main (String[] args) {
			int trans;
			main p=new main();
			
			System.out.println("Enter the size of transaction array: ");
			Scanner input=new Scanner(System.in);
			trans=input.nextInt();
			transactions=new int[trans];
		
			System.out.println(" Enter the values of array ");
			for( int i=0; i<trans; i++) {
			
			transactions[i]=input.nextInt();
			}
			p.targetachieve(transactions);
			
		
	input.close();
		}
	}


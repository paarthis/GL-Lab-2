package payment;

import java.util.Scanner;

public class main {


			public static void main(String[] args) {
				
				int cash1=0;
				CurrencyDenomination cd=new CurrencyDenomination();
				
				System.out.print("Enter the size of currency Denominations\n" );
				Scanner in=new Scanner(System.in);
				
				int size=in.nextInt();
				int[] denomination=new int[size];
				
				System.out.println("Enter the currency denominations value\r\n");
				for(int i=0;i<size;i++) {
					
					denomination[i]=in.nextInt();
				}
				
				System.out.print("Enter the amount you want to pay\r\n");
				cash1=in.nextInt();
				
				cd.modeofpay(denomination, cash1);
				
				in.close();
				
				}
				
			}
		



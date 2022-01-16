package payment;

public class CurrencyDenomination {
	
	public void modeofpay(int[] cash, int value){
		
		CurrencyDenomination c=new CurrencyDenomination();
		
		int size=cash.length;
		int[] count=new int[size];
				
		c.sort(cash, 0, cash.length-1);
		
		for(int i=0; i<cash.length;i++) {
		if(value>= cash[i]) {
			count[i]= value/cash[i];
			value = value - count[i]*cash[i];
		}
	}
		
	if(value > 0) 
	{	
		System.out.print("Exact amount not possible in these denominations");
	}
	else {
		System.out.println("Your payment approach in order to give min no of notes will be ");
			
		for(int i=0; i<cash.length;i++) {
			if(count[i]!=0) {
				System.out.println(cash[i] + ":"+ count[i]);
				}
			}
		}
}
	

	public void sort(int[] array,int left, int right) {
		if(left<right) {
			
			int mid= left+(right-left)/2;
			
			sort(array,left,mid);
			sort(array,mid+1,right);
			merge(array,left,mid,right);
		}
	}

	void merge(int[] array, int left, int mid, int right) {
		
		int l1=mid-left+1;
		int l2=right-mid;
		
		int[] leftarray=new int[l1];
		int[] rightarray =new int[l2];
		
		for(int i=0;i<l1;i++) {
			
			leftarray[i]=array[left+i];
		}
		for(int j=0;j<l2;j++) {
			
			rightarray[j]=array[mid+1+j];
		}
			
		
		int i=0;int j=0;
		int k=left;
	
		while(i<l1 && j<l2) {
			
			if(leftarray[i]>=rightarray[j]) {
				array[k]=leftarray[i];
				i++;
			}
			else {
				
				array[k]=rightarray[j];
				j++;
			}
			k++;
		}

		
		while(i<l1) {
			
		array[k]=leftarray[i];
		i++;
		k++;
		}

		while(j<l2) {
			
			array[k]=rightarray[j];
			j++;
			k++;
			}

	}	
	
}



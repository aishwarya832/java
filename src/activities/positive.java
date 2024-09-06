package activities;

public class positive {

	public static void main(String[] args) {	
	 int positive,negative,zero;
	 positive=negative=zero=0;
	 int ar[]= {5,9,0,-3,-8,0,-4};
	 System.out.println("array elements"+ar);
	 for(int i=0;i<ar.length;i++) {
		 if (ar[i]>0)
			 positive++;
		 else if(ar[i]<0)
			 negative++;
		 else
			 zero++;
		 System.out.println("positive numbers:"+positive);
		 System.out.println("negative number:"+negative);
		 System.out.println("zero:"+zero);
		 
		 
	 }

	}

}

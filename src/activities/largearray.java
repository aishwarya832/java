package activities;

public class largearray {

	public static void main(String[] args) {
	int [] ar= {20,32,66,78,88};
	int max=ar[0];
	for(int i=1;i<ar.length;i++) {
		if(ar[i]>max) {
			max=ar[i];
		}
	}
	System.out.println(" large element in array"+ar);
	

	
	}
}

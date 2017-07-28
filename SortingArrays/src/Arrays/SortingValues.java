/**
 * 
 */
package Arrays;

/**
 * @author student
 *
 */
public class SortingValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

			// Display the original (unsorted values)
			System.out.print("before: ");
			for ( int i=0; i<arr.length; i++ )
				System.out.print( arr[i] + " " );
			System.out.println();

			// Swap the values around to put them ascending order.
			
			
			  int a[] = new int[4];
		        a[0]=45;
		        a[1]=87;
		        a[2]=39;
		        a[3]=32;
		        a[0]=45;
		        a[1]=87;
		        a[2]=39;
		        a[3]=32;
		        a[2]=39;
		        a[3]=32;
		        
		        int temp;
		        for(int i=0;i<4;i++){
		            for(int j=0;j<3;j++){
		                if (a[j]>a[j+1]){
		                    temp = a[j+1];
		                    a[j+1] = a[j];
		                    a[j]=temp;
			

			// Display the values again, now (hopefully) sorted.
			System.out.print("after : ");
			for ( int i=0; i<arr.length; i++ )
				System.out.print( arr[i] + " " );
			System.out.println();
	

	}

	}



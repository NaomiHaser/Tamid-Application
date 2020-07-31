import java.util.Arrays; //imports

public class challenge1 {
	
	public static void main(String [] args){
		int [] arr1= {1, 3, 5, 8};
		int [] arr2= {};
		int k = 10;
		int [] merged= sortArrays(arr1,arr2,k);
		System.out.println(Arrays.toString(merged));

}
	
	
	static int[] sortArrays(int[] arr1,int[] arr2, int k) {
		if (k> arr1.length ||  k> arr2.length) { //conditional to check whether the limit is larger than both array sizes 
			k= arr1.length + arr2.length;//changes the array size to the max of both
		}
	
		int [] mergedarr = new int [k]; //create new array according to size sent
		int l=0; //initialize variables
		int m=0;
		int n= 0;
		
		while (l<k && (m<arr1.length && n<arr2.length)) { 
			//these if statements will compare the numbers in each array
			if (arr1[m]<arr2[n]) {
				mergedarr[l++]= arr1[m++];
			}
			else {
				mergedarr[l++]=arr2[n++];
			}
		}
		//these while statements will take the rest of the longer array if the given size permits 
			while (m<arr1.length & l<k) { 
			     mergedarr[l++] = arr1[m++];
			}
			while (n<arr2.length  &l<k) {
			     mergedarr[l++] = arr2[n++];
				}
			
		
		return mergedarr; 
	}
}


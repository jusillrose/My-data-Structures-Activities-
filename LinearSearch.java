public class LinearSearch{
	public static int linearSearch(int[]arr, int target){
		for(int i = 0; i < arr.length;i++){
			if(arr[i]== target){
				return i; //target found at index i
				}
			}
			return - 1; //  target not found
		}
	public static void main(String[] args){
		int[] numbers = {3, 6 , 9, 12, 18, 21};
		int target = 12;

		int index = linearSearch(numbers,target);

		if(index != -1){
			System.out.println(" Target " + target + " found at index " + index);
			}else{
				System.out.println(" Target " + target + " not found in the array ");
				}
		}
}
;/**
 * 	0 	1 	2 	3 	4 <---- Index 
 * 10 	5 	3 	7 	2 <---- Elements of Array 
 * 					  <---- Newly Sorted Array 
 * 		i			  <---- Inner loop i 
 * 	j				  <---- Inner loop j
 * 
 * 
 * Key: 5, A[j] = 10,---> A[j+1]= 5; j = -1; A[0]
 * 
 * 
 * 
 * @author srikanth
 * 
 */
public class InsertionSort {

	public static int[] numbers = { 10, 5, 3, 7, 2 };

	public static int[] insertionSort(int[] A) {

		for (int i = 1; i < A.length; i++) {

			int key = A[i];
			int j = i - 1;

			while (j >= 0 && A[j] > key) {

				A[j + 1] = A[j];
				j--;
			}

									//when J become -1 it will come out the loop so A[1] position will sit minimum value
			A[j + 1] = key;

		}
		return A;
	}

	public static void main(String[] args) {

		System.out.println("Elements before sorting");
		printArray(numbers);
		System.out.println("=======================");
		insertionSort(numbers);
		System.out.println("Sorted List");
		printArray(numbers);

	}

	private static void printArray(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}
	}

}

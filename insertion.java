import java.util.Arrays;

class Main {
        static void insertionSort(int[] arr) {
                int n = arr.length;
                int insertIndex;
                int currentElement;     

                for (int i = 1; i < n; i++) {
                        insertIndex = i;
                        currentElement = arr[i];
                        for (int j = i - 1; j >= 0; j--) {
                                if (arr[j] > currentElement) {
                                        arr[j+1] = arr[j];
                                        insertIndex = j;
                                } else {
                                        break;
                                }
                        }
                        arr[insertIndex] = currentElement;
                }
        }

        public static void main(String[] args) {
                int[] someArray = {90, 70, 50, 30, 10};

                System.out.println("Original array: " + Arrays.toString(someArray));
        		
		insertionSort(someArray);

		System.out.println("Sorted array: " + Arrays.toString(someArray));	
	}
}

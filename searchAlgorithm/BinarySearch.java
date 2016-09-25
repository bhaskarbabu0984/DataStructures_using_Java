package searchAlgorithm;

public class BinarySearch {
	public static void main(String[] args) {
		/*
		 * By default we have the element sorted for simplicity. Else write any
		 * sorting algorithm if needed for sorting
		 */
		int[] searchArray = { 0, 1, 2, 12, 34, 45, 100, 104, 126, 138 };

		BinarySearch binarySearch = new BinarySearch();

		// Start Binary search - SearchElement not in array - returns -1
		int searchElement = 111;
		int result = binarySearch.doBinarySearch(searchArray, searchElement);
		System.out.println(" search element = " + searchElement + " is present at index - " + result);

		// Search another element
		searchElement = 126;
		result = binarySearch.doBinarySearch(searchArray, searchElement);
		System.out.println(" search element = " + searchElement + " is present at index - " + result);

		// Search one more element
		searchElement = 12;
		result = binarySearch.doBinarySearch(searchArray, searchElement);
		System.out.println(" search element = " + searchElement + " is present at index - " + result);
	}

	public int doBinarySearch(int[] array, int searchElement) {
		int startIndex = 0;
		int endIndex = array.length - 1;
		
		while(startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if(searchElement == array[midIndex]){
				//Search Element found in mid index position
				return midIndex;
			} else if(searchElement > array[midIndex]){
				//SearchElement is after the midIndex
				startIndex = midIndex + 1; 
			} else {
				//SearchElement is before the midIndex
				endIndex = midIndex - 1;
			}
		}
		//If no search element found in array, return -1
		return -1;
	}

}

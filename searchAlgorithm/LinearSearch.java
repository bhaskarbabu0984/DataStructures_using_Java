package searchAlgorithm;

public class LinearSearch {

	public static void main(String[] args) {
		int [] arrayToSearch = {12, 34, 45, 2, 1, 0};
		int searchElement = 45;
		
		//start searching
		LinearSearch linearSearch = new LinearSearch();
		
		//Element found scenario - returns position of the element in array
		int result = linearSearch.doLinearSearch(arrayToSearch, searchElement);
		System.out.println("Search result = " + result);
		
		
		//Element NOT found scenario - returns -1
		searchElement = 29;
		result = linearSearch.doLinearSearch(arrayToSearch, searchElement);
		System.out.println("New Search result = " + result);
		
	}
	
	public int doLinearSearch(int [] array, int searchElement) {
		for(int i = 0; i < array.length; i++){
			if(searchElement == array[i]){
				return i;
			}
		}
		return -1;
	}

}

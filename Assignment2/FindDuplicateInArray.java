public class FindDuplicateInArray {
	
	static boolean isDuplicatePresent(int[] arr) {
		if(arr==null || arr.length==0) {
			return false;
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {10,20,30,10,50};
		boolean duplicatePresent = isDuplicatePresent(arr);
		System.out.println("Is Duplicate Present: "+duplicatePresent);
	}

}
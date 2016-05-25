public class SortArray {
	private static void selectionSort(int start, int stop, int[] anArray) {
		for (int index = start; index <= stop; index++) {
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
			}
		}	
	private static void selectionSort(int[] anArray) {
		for (int index = 0; index < anArray.length - 1; index++) {
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
			}
		}
	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++) {
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				}
			}
		return indexOfMin;	
		}	
	private static void interchange(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
		
	private static void selectionSort(char[] array) {
		for (int index = 0; index < array.length - 1; index++) {
			int indexOfNextSmallest = getIndexOfSmallest(index, array);
			interchange(index, indexOfNextSmallest, array);
			}
		}
	
	private static int getIndexOfSmallest(int startIndex, char[] array) {
		char min = array[startIndex];
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < array.length; index++) {
			if (array[index] < min) {
				min = array[index];
				indexOfMin = index;
				}
			}
		return indexOfMin;	
		}
		
	private static void interchange(int i, int j, char[] a) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}	
	
	public static void display(char[] array) {
		System.out.println("Array values");
		for (int x = 0; x < array.length; x++) {
			System.out.print(array[x] + " ");
			}
		System.out.println();	
		}
	public static boolean sequentialSearch(int[] x, int y) {
		boolean found = false;
		for (int t = 0; t < x.length; t++) {
			if (x[t] == y) {
				found = true;
				break;
				}
			else {
				found = false;
				}		
			}
		return found;	
		}		
	
	public static void main(String[] args) {
		char[] xx = {'z', 'y', 'x'};
		display(xx);
		selectionSort(xx);
		display(xx);
		
		int[] A = {8, 10, 11, 5, 12};
		System.out.println(sequentialSearch(A, 5));
		System.out.println(sequentialSearch(A, 6000));
		
		selectionSort(1,3, A);
		System.out.println(A[1]);
		System.out.println(A[0]);
		System.out.println(A[3]);
		}
		
	}

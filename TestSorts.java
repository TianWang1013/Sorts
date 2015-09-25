import java.util.Arrays;

public class TestSorts { //test sorts by calling Sorts.sortnameSort static
	public static void main (String [] args) {
	int [] a = {5,4,3,8,1};
	System.out.println(Arrays.toString(a));	
  //Sorts.insertionSort(a,a.length); works, test next one
  //Sorts.insertionSort2(a,a.length); works
    Sorts.bubbleSort(a,a.length); // works
	System.out.println(Arrays.toString(a));	
	} //end main
} //end class TestSorts
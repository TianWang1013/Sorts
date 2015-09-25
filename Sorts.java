public  class Sorts {
    public static void bubbleSort (int [] a, int n ) {
	for (int j = 0; j < n-1; j++) // outer loop, passes
	    for (int jj = 0; jj < n-1; jj++) // can be n-1-j, optimize
                                             // inner loop, compares
		if (a[jj] >= a[jj+1]) // out of order, swap
                {
                    int t = a[jj];
                    a[jj] = a[jj+1];
                    a[jj+1] = t;
                } //end of if, swap
    } //end bubbleSort
} //end class Sorts
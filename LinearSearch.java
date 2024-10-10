package RecursionHW;;

public class LinearSearch {
		 /** The method for finding a key in the list */
		 public static int linearSearch(int[] list, int key) {
		 for (int i = 0; i < list.length; i++) {
		 if (key == list[i])
		 return i;
		 }
		 return -1;
		 }
		public static void main(String[] args) {
		final int N = 10000000;
		//Generate random key from -100 to 100 
		final int KEY = (int) (Math.random() * 201) - 100;
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
		//generate random positive and negative numbers from -100 to 100
		list [i]= (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
		//assigning element in list as key to manipulate case scenario
		//list [0]= KEY;
		//print them
		//System.out.print(list[i] + "," );
		}
		long begin, end, time; // we will measure time it took to search
		 begin = System.nanoTime();//we measure in nanoseconds.
		 //Starting the watch
		 System.out.println(linearSearch(list, KEY));
		 end = System.nanoTime();
		 time = end-begin;
		 System.out.println("it took " + time + " nanoseconds to run linear search with the key " + KEY +
		" on the array of " + N + " elements.");
		 }
}

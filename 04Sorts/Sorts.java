public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
    public static String name(){
	return "10.Kurkin.Anthony"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
    public static void selectionSort(int[] data){
	int small;
	int loc;
	for(int index = 0; index < data.length; index++){
	    small = data[index];
	    for(int pos = index; pos < data.length; pos++){
		if(data[pos] < small){
		    small = data[pos];
		    loc = pos;
		}
	    }
	    swap(data, index, loc);
	}
    }
    public static void swap(int[] data, int a, int b){
	int c = data[a];
	data[a] = data[b];
	data[b] = c;
}

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
	int location = 0;
	for(int index = 0; index < data.length; index++){
	    small = data[index];
	    for(int pos = index; pos < data.length; pos++){
		if(data[pos] < small){
		    small = data[pos];
		    location = pos;
		    swap(data,index,location);
		}
	    }
	}
    }
    public static void swap(int[] data, int a, int b){
	int c = data[a];
	data[a] = data[b];
	data[b] = c;
    }


    public static void insertionSort(int[] data){
	for(int i = 1; i < data.length; i++){
	    int old = data[i];
	    int index = i;
	    while(index > 0 && old < data[index-1]){
		data[index] = data[index-1];
		index--;
	    }
	    data[index] = old;
    }
    }

    public static void bubbleSort(int[] data){
	boolean swapped = false;
	for(int pos = 0; pos < data.length; pos++){
	    if(pos<data.length-1){
	    if(data[pos] > data[pos + 1]){
		swap(data, pos, pos + 1);
		swapped = true;
	    }
	    }
	}
	if(swapped){
	    bubbleSort(data);
	}
    }
}

public class Driver{
    public static void main(String[]args){
	int[]cool = {1,9,6,3,4,5,2,8};
	Sorts.selectionSort(cool);
	/**for(int i = 0;i < cool.length;i++){
	    System.out.println(cool[i]);
	    }**/
	int[]testInsert = {3,2,5,3,4,6,7,1,9,2,0};
	Sorts.insertionSort(testInsert);
	for(int i = 0;i < testInsert.length;i++){
	    System.out.println(testInsert[i]);
	}
    }
}

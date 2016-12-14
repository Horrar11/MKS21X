public class Barcode implements Comparable<Barcode>{
    private String _code;
    private int _checkDigit;

    public void Barcode(java.lang.String code) throws IllegalArguementException{
	try {
	    Integer.parseInt(code);
	    
	}catch(IllegalArguementException e){
	    e.printStackTrace();}
	
    }
    public int checkSum(String code){}

    public 

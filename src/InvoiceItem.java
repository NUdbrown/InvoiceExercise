import java.text.DecimalFormat;
import java.util.Formatter;

public class InvoiceItem { 
	
	private Formatter f = new Formatter(System.out); 
	
	 static String[] items = {"Hard Drive Enclosure","SATA Cable","1 TB HD"}; 
	 static int qtySpace = 10; 
	 String longestString = getLongestString(items);
	 DecimalFormat form = new DecimalFormat("#.##");
	 
	 
	
	
 
	public void printTitle(){   
		int descriptSpace = longestString.length();
		int priceSpace = 10; 
		
		f.format("%"+-descriptSpace+"s"+" %"+-qtySpace+"s"+" %"+-priceSpace+"s"+"\n","Description","Quantity","Price"); 
		f.format("%"+-descriptSpace+"s"+" %"+qtySpace+"s"+" %"+priceSpace+"s"+"\n", "--------------------", "----------", "----------"); 
	}  
	
	public void print(){  
		int nameSpace = longestString.length(); 
		int priceSpace = 10;

		f.format("%"+-nameSpace+"s"+" %"+qtySpace+"d"+" %"+priceSpace+"s"+"\n", items[0], 3,  19.99); 
		f.format("%"+-nameSpace+"s"+" %"+qtySpace+"d"+" %"+priceSpace+"s"+"\n", items[1], 10, 11.50); 
		f.format("%"+-nameSpace+"s"+" %"+qtySpace+"d"+" %"+priceSpace+"s"+"\n", items[2], 1, 148.80);
		
	}   
	
	public static String getLongestString(String[] array){
		int maxLength = 0; 
		String longestString = null; 
		for(String s : array){
			if(s.length() > maxLength){
				maxLength = s.length(); 
				longestString = s; 
			}
		} 
		return longestString;
	}

	
}
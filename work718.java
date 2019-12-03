package ÀÊ“‚;

public class work718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

 int[] arr={1,25,4,7,0,56,887,2};   
 int[] sort = maopaoSort(arr);    
 for (int i = 0; i < sort.length; i++) {  
	 System.out.print(arr[i]+"\t");   
	 }}   
	private static int[] maopaoSort(int[] arr){    
		int length = arr.length;     
		while (true){        
			for (int i = 0; i < length; i++) {         
				if (i+1<length&&arr[i]>=arr[i+1]){      
					int temp=arr[i];        
					arr[i]=arr[i+1];            
					arr[i+1]=temp;       
					}     
				}           
			length--;     
			if (length<=1){       
				break;         
				}       
			}     
		return arr;  
		}
	}


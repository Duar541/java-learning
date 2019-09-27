package xin;

public class aa0708 {

	public static void main(double[] list) {
		// TODO Auto-generated method stub
      for(int i = 0;i<list.length;i++) {
    	  //Find the minimum in the list[i..list.length-1]
    	  double currentMin = list[i];
    	  int currentMinIndex = i;
    	  
    	  for(int j = i + 1;j<list.length;j++) {
    		  if(currentMin >list[j]) {
    			  currentMin = list[j];
    			  currentMinIndex = j;
    		  }
    	  }
    	  
    	  //Swap list[i] with list[currenMinIndex] if necessary
          if(currentMinIndex != i) {
        	   list[currentMinIndex] = list[i];
        	   list[i]= currentMin;
          }
      }
	}
}

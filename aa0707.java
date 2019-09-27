package xin;

public class aa0707 {

	public static int main(int[] list,int key) {
		// TODO Auto-generated method stub
		 int low = 0;
	     int high = list.length - 1;
	     
	     while(high >= low) {
	    	 int mid = (low + high ) / 2;
	    	 if(key <list[mid])
	    		 high = mid - 1;
	    	 else if(key == list[mid])
	    		 return mid;
	    	 else
	    		 low = mid +1;
	     }
	     return -low-1;//Now high  < low,key not found
	}

}

package xin;

public class aa0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //obtain the total seconds since midnight, Jan 1,1970
		long totalMilliseconds = System.currentTimeMillis();
		 
    //obtain the total seconds since midnignt,Jan1.1970
		long totalSeconds = totalMilliseconds / 1000;
	//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
	//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
	//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
	//Obtain the total hours
		long totalHours = totalMinutes / 60;
	//Compute the current hour
		long currentHours = totalMinutes %24;
	//Display results
		System.out.println("Current time is "+currentHours+":"+currentMinute +":"+ currentSecond+" GMT");
		
	}

}

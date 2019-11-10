package xin;
import java.util.Scanner; 

public class LinearEquationDemo {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 double x1,x2,x3,x4,y1,y2,y3,y4;
	      System.out.println("please input (x1,y1,)(x2,y2)(x3,y3)(x4,y4)");
	    
	      double a,b,c,d,e,f;
	     
	      Scanner in = new Scanner(System.in);
	       x1 = in.nextDouble();
	       y1 = in.nextDouble();
	       x2= in.nextDouble();
	       y2 = in.nextDouble();
	       x3 = in.nextDouble();
	       y3= in.nextDouble();
	       x4 = in.nextDouble();
	       y4 = in.nextDouble();
	       
	       a=y1-y2;
	       b=x1-x2;
	       c=y3-y4;
	       d=x3-x4;
	       e=(y1-y2)*x1-(x1-x2)*y1;
	       f=(y3-y4)*x3-(x3-x4)*y3;
	      LinearEquation p1 = new  LinearEquation(a,b,c,d,e,f);
	      if(p1.isSolvable(a, b, c, d)==false){
	    	  System.out.println("The equation has no solution");
	      }else{
	    	  System.out.println("x = " + p1.getX( a, b, c, d, e, f));
	    	  System.out.println("y = " + p1.getY(a, b, c, d, e, f));
	      }
		}

	}


package xin;

public class RegularPolygon {
	   private int n;
	   private double side;
	   private double x;
	   private double y;
	   
	   public RegularPolygon ()
	   {
		   n = 3;
		   side = 1;
		   x = 0;
		   y = 0;
		   
	   }
		
	   public RegularPolygon (int n,double side)
	   {
		   this.n = n;
		   this.side = side;
		   x = 0;
		   y = 0;
		   
	   }
		
	   public RegularPolygon (int n,double side,double x,double y)
	   {
		   this.n = n;
		   this.side = side;
		   this.x = x;
		   this.y = y;
	   }
	   
	   public int getN()
	   {   
		   return n;
	   }
	   public double getSide()
	   {   
		   return side;
	   }
	   public double getX()
	   {   
		   return x;
	   }
	   
	   public double getY()
	   {   
		   return y;
	   }
	   
	   public int changeN(int n)
	   {
		   this.n = n;
		   return this.n;
	   }
	   public double changeSide(double side)
	   {
		   this.side = side;
		   return this.side;
	   }
	   public double changeX(double x)
	   {
		   this.x = x;
		   return this.y;
	   }
	   public double changeY(double y)
	   {
		   this.y = y;
		   return this.y;
	   }
	   
	   public double getPerimeter()
	   {
	       return n*side;
	   }
	   public double getArea()
	   {
	       return (n*(side*side))/(4*Math.tan(3.1415926/n));
	   }
	   
	 
	}

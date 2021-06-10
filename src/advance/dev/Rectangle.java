package advance.dev;

public class Rectangle extends Shape{
	double a;
	double b;
	public Rectangle(double a, double b) {
	
		this.a = a;
		this.b = b;
	}
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 *(a + b);
	}
	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}

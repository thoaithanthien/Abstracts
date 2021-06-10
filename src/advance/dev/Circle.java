package advance.dev;

public class Circle extends Shape{
	double r;

	public Circle(double r) {
		
		this.r = r;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}
	
	
}

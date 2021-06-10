package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		final int number_Triangle = 4;
		final int number_Circle = 3;
		final int number_Rectangle = 3;
		System.out.println("Nhap gia tri Triangle:");
		for (int i = 0; i < number_Triangle; i++) {
			System.out.println("Gia tri thu :" + i);
			System.out.println("nhap a:");
			double a = sc.nextDouble();
			System.out.println("nhap b:");
			double b = sc.nextDouble();
			System.out.println("nhap c:");
			double c = sc.nextDouble();
			Triangle triangle = new Triangle(a, b, c);
		}
		System.out.println("Khai bao Circle:");
		for (int i = 0; i < number_Circle; i++) {
			System.out.println("Circle:" + i);
			System.out.println("nhap r:");
			double r = sc.nextDouble();
			Circle circle = new Circle(r);
		}
		System.out.println("Khai bao rectangle:");
		for (int i = 0; i < number_Rectangle; i++) {
			System.out.println("Rectangle:" + i);
			System.out.println("nhap a:");
			double a = sc.nextDouble();
			System.out.println("nhap b:");
			double b = sc.nextDouble();
			Rectangle rectangle = new Rectangle(a, b);
		}
	}
	static void print(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}
	static void maxDTich(Shape[] shapes) {
		Shape preMax = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if(preMax.dienTich() < shapes[i].dienTich()) {
				preMax = shapes[i];
			}
		}
		System.out.println("Dien tich lon nhat:" + preMax);
	}
	static void MaxAll(Shape[] shapes) {
		Shape preCir = shapes[0];
		Shape preTri = shapes[0];
		Shape preRec = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if(preCir.dienTich() < shapes[i].dienTich()) {
				preCir = shapes[i];
			}
		}
		System.out.println("Dien tich hinh tron lon nhat:" + preCir);
		for (int i = 0; i < shapes.length; i++) {
			if(preTri.dienTich() < shapes[i].dienTich()) {
				preTri = shapes[i];
			}
		}
		System.out.println("Dien tich hinh tam giac lon nhat:" + preTri);
		for (int i = 0; i < shapes.length; i++) {
			if(preRec.dienTich() < shapes[i].dienTich()) {
				preRec = shapes[i];
			}
		}
		System.out.println("Dien tich hinh chu nhat:" + preRec);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		maxDTich(shapes);
		MaxAll(shapes);
	}

}

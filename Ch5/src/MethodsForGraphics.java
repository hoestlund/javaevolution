import element.*;
//I downloaded the source and have added the location of the zip file for elements in my classpath but still import could not be resolved error
//This is solved within eclipse by adding the .jar file to the build path


public class MethodsForGraphics {
	
	public static void main(String[] args) {
		one();
		two();
		three();
	}

	private static void one() {
		DrawingWindow d = new DrawingWindow(500, 500);
		d.moveTo(100,100);
		d.lineTo(100, 150);
	}
	
	private static void two() {
		int x1=500, x2=100, x3=100, y1=500, y2=100, y3=150;
		DrawingWindow d = new DrawingWindow(x1, y1);
		d.moveTo(x2, y2);
		d.lineTo(x3, y3);
	}
	
	private static void three() {
		int x1=400, x2=0, x3=0, y1=400, y2=0, y3=50;
		DrawingWindow d = new DrawingWindow(x1+100, y1 +100);
		d.moveTo(x2+100, y2+100);
		d.lineTo(x3+100, y3 +100);
	}
	

}



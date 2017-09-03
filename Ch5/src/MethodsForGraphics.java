import element.*;
//I downloaded the source and have added the location of the zip file for elements in my classpath but still import could not be resolved error
//This is solved within eclipse by adding the .jar file to the build path


public class MethodsForGraphics {
	
	public static void main(String[] args) {
		//one();
		//two();
		//three();
		//weirdSquare();
		cube2();
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
	
//	//private static void weirdSquare() {
	//This didn't really work and pretty unreadable
//		DrawingWindow d = new DrawingWindow(600, 600);
//		//starting at the bottom corner of first layer
//		int xLeft=50, xRight=450, yBottom=450, yTop=50;
//		d.moveTo(xLeft,yTop);
//		d.lineTo(xRight,yTop);
//		d.lineTo(xRight,yBottom);
//		d.lineTo(xLeft,yBottom);
//		//completing first layer square
//		d.lineTo(xLeft,yTop);
//		
//		//shifting by 50 to start next square
//		d.lineTo(xLeft+50,yTop+50);
//		d.lineTo(xRight+50,yTop+50);
//		d.lineTo(xRight+50,yBottom-50);
//		d.lineTo(xLeft+50,yBottom-50);
//		
//		//three last lines to connect between the two squares
//		d.moveTo(xLeft,yBottom);
//		d.lineTo(xLeft+50,yBottom-50);
//		
//		d.moveTo(xRight,yBottom);
//		d.lineTo(xRight+50,yBottom-50);
//		
//		d.moveTo(xRight,yTop);
//		d.lineTo(xRight+50,yTop+50);
//	}
	
	private static void cube2() {
		DrawingWindow d = new DrawingWindow(500,500);
		//backsquare
		d.moveTo(200,100); //topLeft
		d.lineTo(400,100);//topRight
		d.lineTo(400,300);
		d.lineTo(200,300);
		d.lineTo(200,100);//completing first square
		
		//frontalSquare
		d.moveTo(100,200);
		d.lineTo(300,200);
		d.lineTo(300,400);
		d.lineTo(100,400);
		d.lineTo(100,200);//completing frontal square
		
		
		d.lineTo(200,100); //joining the top left
		
		//joining top right
		d.moveTo(300,200);
		d.lineTo(400,100);
		
		//joining bottom right
		d.moveTo(300,400);
		d.lineTo(400,300);
		
		//joining bottom left
		d.moveTo(100,400);
		d.lineTo(200,300);
		
		
		
	}
	
	
	

}



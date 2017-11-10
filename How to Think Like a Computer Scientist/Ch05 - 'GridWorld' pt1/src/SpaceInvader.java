//I searched google for coordinate drawings and found an eight line drwaing for a space invader on a 20x20 grid
//I can't manipulate object d in other methods so am writing it all in one
//manipulated the coordinates in visual code in order to get the formatting right

import element.*;


public class SpaceInvader {


    public static void main(String[] args) {
        DrawingWindow d = new DrawingWindow(200, 200);

        d.moveTo(00, 130);
        d.lineTo(00, 160);
        d.lineTo(10, 160);
        d.lineTo(10, 170);
        d.lineTo(20, 170);
        d.lineTo(20, 180);
        d.lineTo(30, 180);
        d.lineTo(30, 190);
        d.lineTo(40, 190);
        d.lineTo(40, 180);
        d.lineTo(70, 180);
        d.lineTo(70, 190);
        d.lineTo(80, 190);
        d.lineTo(80, 180);
        d.lineTo(90, 180);
        d.lineTo(90, 170);
        d.lineTo(100, 170);
        d.lineTo(100, 160);
        d.lineTo(110, 160);
        d.lineTo(110, 130);
        d.lineTo(100, 130);
        d.lineTo(100, 150);
        d.lineTo(90, 150);
        d.lineTo(90, 130);
        d.lineTo(80, 130);
        d.lineTo(80, 140);
        d.lineTo(30, 140);
        d.lineTo(30, 130);
        d.lineTo(20, 130);
        d.lineTo(20, 150);
        d.lineTo(10, 150);
        d.lineTo(10, 130);
        d.lineTo(00, 130);

        //line 2
        d.moveTo(30, 120);
        d.lineTo(30, 130);
        d.lineTo(50, 130);
        d.lineTo(50, 120);
        d.lineTo(30, 120);

        //line 3
        d.moveTo(20, 200);
        d.lineTo(30, 200);
        d.lineTo(30, 190);
        d.lineTo(20, 190);
        d.lineTo(20, 200);

        //line 4
        d.moveTo(40, 80);
        d.lineTo(40, 70);
        d.lineTo(60, 70);
        d.lineTo(60, 60);
        d.lineTo(40, 60);
        d.lineTo(40, 50);
        d.lineTo(50, 50);
        d.lineTo(50, 90);
        d.lineTo(60, 90);
        d.lineTo(60, 80);
        d.lineTo(40, 80);

        //line 5
        d.moveTo(130, 120);
        d.lineTo(140, 120);
        d.lineTo(140, 90);
        d.lineTo(130, 90);
        d.lineTo(130, 120);

        //line 6
        d.moveTo(80, 200);
        d.lineTo(80, 190);
        d.lineTo(90, 190);
        d.lineTo(90, 200);
        d.lineTo(80, 200);

        //line 7
        d.moveTo(190, 00);
        d.lineTo(80, 00);
        d.lineTo(80, 20);
        d.lineTo(90, 20);
        d.lineTo(90, 30);
        d.lineTo(120, 30);
        d.lineTo(120, 40);
        d.lineTo(130, 40);
        d.lineTo(130, 50);
        d.lineTo(140, 50);
        d.lineTo(140, 40);
        d.lineTo(150, 40);
        d.lineTo(150, 30);
        d.lineTo(180, 30);
        d.lineTo(180, 20);
        d.lineTo(190, 20);
        d.lineTo(190, 00);

        //line 8
        d.moveTo(60, 130);
        d.lineTo(80, 130);
        d.lineTo(80, 120);
        d.lineTo(60, 120);
        d.lineTo(60, 130);

        //line 9
        d.moveTo(70, 170);
        d.lineTo(70, 160);
        d.lineTo(80, 160);
        d.lineTo(80, 170);
        d.lineTo(70, 170);

        //line 10
        d.moveTo(30, 170);
        d.lineTo(30, 160);
        d.lineTo(40, 160);
        d.lineTo(40, 170);
        d.lineTo(30, 170);


    }//end of main
}//end of SpaceInvader


//raw coordinates
//Line 1: (0,13), (0,16), (1,16), (1,17), (2,17), (2,18), (3,18), (3,19),
//(4,19), (4,18), (7,18), (7,19), (8,19), (8,18), (9,18), (9,17),
//(10,17), (10,16), (11,16), (11,13), (10,13), (10,15), (9,15), (9,13),
//(8,13), (8,14), (3,14), (3,13), (2,13), (2,15), (1,15), (1,13), (0,13)
//Line 2: (3,12), (3,13), (5,13), (5,12), (3,12) 
//Line 3: (2,20), (3,20), (3,19), (2,19), (2,20) 
//Line 4: (4,8), (4,7), (6,7), (6,6), (4,6), (4,5),(5,5), (5,9), (6,9), (6,8), (4,8) 
//Line 5: (13,12), (14,12), (14,9), (13,9), (13,12) 
//Line 6: (8,20), (8,19), (9,19), (9,20), (8,20) 
//Line 7:(19,0), (8,0), (8,2), (9,2), (9,3), (12,3), (12,4), (13,4), (13,5),
//(14,5), (14,4), (15,4), (15,3), (18,3), (18,2), (19,2), (19,0) 
//Line 8:(6,13), (8,13), (8,12), (6,12), (6,13) 
//Line 9: (7,17), (7,16), (8,16), (8,17), (7,17)
//Line 10: (3,17), (3,16), (4,16), (4,17), (3,17)
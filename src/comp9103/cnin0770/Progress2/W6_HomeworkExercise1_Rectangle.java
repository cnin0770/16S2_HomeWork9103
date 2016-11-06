//package comp9103.cnin0770;

/**
 Design a class to represent rectangles
 which are axis-parallel in two-dimensional space.
 The objects created from the Rectangle class should provide basic information such as:
 - width, height, and perimeter of rectangles
 - area for rectangles
 - x and y coordinates of the centre for rectangles
 Write a class to:
 a) Describe the data (instance variables)
 b) Define the constructor(s)
 c) Decide on the methods; write a simple list of methods.
 For each method (except trivial methods) provide precise comment on what it does
 */
public class W6_HomeworkExercise1_Rectangle {

    //instances
    double width, height, perimeter, area, x, y;
    boolean areaMode;

    //constructors
    public W6_HomeworkExercise1_Rectangle () {}
    public W6_HomeworkExercise1_Rectangle (double wid, double hei,
                                           double xCentre, double yCentre){
        areaMode = false;

        width = wid;
        height = hei;
        x = xCentre;
        y = yCentre;

        perimeter = (wid + hei) * 2;
        area = wid * hei;
    }

    public W6_HomeworkExercise1_Rectangle (boolean mode,
                                           double peri, double are,
                                           double xCentre, double yCentre){
        areaMode = true;

        areaMode = mode;
        perimeter = peri;
        area = are;
        x = xCentre;
        y = yCentre;

        width = Math.sqrt(Math.pow(peri / 2, 2) / 4 - are) + peri / 2;
        height = peri / 2 - width;
    }

    public static void main (String[] args){
        W6_HomeworkExercise1_Rectangle rect1 = new W6_HomeworkExercise1_Rectangle(
                true, 8.0, 3.0, 0, 0);

        System.out.printf("the diagonal of the 1st rect is %.2f\n", rect1.getDiagonal());

        W6_HomeworkExercise1_Rectangle rect2 = new W6_HomeworkExercise1_Rectangle(
                11.2, 14.0, 0, 0
        );

        System.out.printf("the area of the 2nd rect is %.2f\n", rect2.getArea());
    }

    //to calculate the diagonal
    public double getDiagonal (){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    //to return the area
    public double getArea () {
        return area;
    }
}

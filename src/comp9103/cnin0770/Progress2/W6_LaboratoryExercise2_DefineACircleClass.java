//package comp9103.cnin0770;

/**
 Exercise 2: Define a Circle class
 Define a Circle class with a field named radius
 and two methods to calculate its area and perimeter respectively.
 */
public class W6_LaboratoryExercise2_DefineACircleClass {
    public double radius;

    public W6_LaboratoryExercise2_DefineACircleClass () {}

    public W6_LaboratoryExercise2_DefineACircleClass (double rad) {
        radius = rad;
    }

    public static void main (String[] args) {
        W6_LaboratoryExercise2_DefineACircleClass circle1 = new W6_LaboratoryExercise2_DefineACircleClass(14.0);
        System.out.printf("the area is %.2f; the perimeter is %.2f\n", circle1.getArea(), circle1.getPertimeter());
    }

    public double getPertimeter () {
        return Math.PI * 2 * radius;
    }

    public double getArea () {
        return Math.pow(radius, 2) * Math.PI;
    }
}

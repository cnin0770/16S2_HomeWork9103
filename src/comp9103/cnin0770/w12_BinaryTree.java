package comp9103.cnin0770;

/**
 * Created by cnin0770 on 19/10/16.
 */

import StdDraw.StdDraw;
public class w12_BinaryTree {

    public static void main(String[] args) {
        binaryTree(10, .5, .0, .25, .5 * Math.PI);
    }

    public static void binaryTree(int x, double x0, double y0, double stemLength, double theta){
        if (x == 0) return;
        else if (x > 0) {
            double x1 = x0 + stemLength * Math.cos(theta);
            double y1 = x0 + stemLength * Math.sin(theta);
            StdDraw.line(x0, y0, x1, y1);
            binaryTree(x-1, x1, y1, .75 * stemLength, theta * Math.random());
            binaryTree(x-1, x1, y1, .75 * stemLength, theta + (Math.PI - theta) * Math.random());
        }
    }
}

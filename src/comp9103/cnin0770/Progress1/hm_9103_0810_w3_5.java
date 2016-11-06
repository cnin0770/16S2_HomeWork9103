/** Exercise 3. Body Mass Index (BMI) by if-else
Body Mass Index (BMI) is used to estimate the risk of weight-related problems and it is calculated as:
  BMI = mass / height^2 ; where mass in kilograms, and height in meters.
Health assessment can be estimated according to:
  BMI < 18.5 Underweight
  18.5 ≤ BMI < 25 Normal weight
  25 ≤ BMI < 30 Overweight
  30 >= BMI Obese
Write a program to read body weight and height, calculate BMI and then print health assessment.
*/

public class hm_9103_0810_w3_5 {
  public static void main (String[] args){
    float mass = Integer.parseInt(args[0]),
      height = Integer.parseInt(args[1]),
      bMI = mass / (height * height);
    // float udWeight, nmWeight, ovWeight;
    // udWeight = (float) 18.50; nmWeight = 25.00; ovWeight = 30.00;
    String res = "";

    if (bMI < 18.5) {res = "Underweight";}
    else if (bMI < 25) {res = "Normal weight";}
    else if (bMI < 30) {res = "Overweight";}
    else {res = "Obese";}

    System.out.println("Given your mass: " + mass + " and your height: " + height + ", you are " + res);
  }
}

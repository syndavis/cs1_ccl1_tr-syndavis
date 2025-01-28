public class ProblemFour {
    public static void main(String[] args){
        // (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a rectangle with a width of 4.5 and a height of 7.9 using the following formula.
        double width = 4.5;
        double height = 7.9;
        //I start by setting my variable values for width and height.
        //I use the double value as its value includes decimal spaces.
        double area = height * width;
        double perimeter = (2 * width) + (2 * height);
        //I set a double area variable and set my area equation to be height x width.
        //The equation for a perimeter adds all sides together, so for my perimeter variable equation, I multiplied height and with by 2 and added them together.
        System.out.print("The area of a rectangle with a height of 7.9 and a width of 4.5 = ");
        System.out.println(area);
        System.out.print("The perimeter of a rectangle with the same measurements are = ");
        System.out.print(perimeter);
        //I use System.out.print to display my messages on what I am evaluating, as well as a separate line that prints that evaluation.
        //On line 13, I use "println" for my area so that after that, my evaluations for the perimeter can be printed on a separate line. If I just use print, everything would display on one line.
    }
}

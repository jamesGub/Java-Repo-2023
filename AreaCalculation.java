/**
 * Course: ICSI 201
 * Semester: Spring 2023
 * Name: James Gillanders
 * NetID: JG854613
 * UAlbany Email: Jgillanders@albany.edu
 */



import java.util.Scanner;

public class AreaCalculation {

    public static void main(String[] args) {
        
    	//Scanner to determine the coordinates entered by the user.
    	Scanner shapeRead = new Scanner(System.in);
    	//Boolean condition to check whether the user continues to run the program or not.
        boolean quit = false;
        
        //Our while loop for the Boolean condition being true.
        while (!quit) {
        	//Prompt method to tell the user which shapes they can enter, or if they want to quit the program.
        	Menu();
            //Reads the users input from the method.
        	String choice = shapeRead.nextLine();
        	
        	//Switch statements with fool-proofing via toUpperCase(). 
            switch (choice.toUpperCase()) {
                case "R":
                    System.out.println("Enter the coordinates of two diagonal vertices (xcoordinate1 ycoordinate1 xcoordinate2 ycoordinate2):");
                    //Integer variables for each of the 4 coordinates required to find the area of a rectangle.
                    int xcoordinate1, xcoordinate2, ycoordinate1, ycoordinate2;
                    double rectangleArea;
                    
                    //Scanner for each integer variable.
                    xcoordinate1 = shapeRead.nextInt();
                    ycoordinate1 = shapeRead.nextInt();
                    xcoordinate2 = shapeRead.nextInt();
                    ycoordinate2 = shapeRead.nextInt();
                    
                    shapeRead.nextLine();
                    
                    //Store the result in a double and call the method rectangleArea with the necessary parameters.
                    rectangleArea = rectangleArea(xcoordinate1, ycoordinate1, xcoordinate2, ycoordinate2);
                    
                    //Resulting statement.
                    System.out.println("The area of the rectangle is " + rectangleArea);
                    
                    //End the switch statement.
                    break;
                
                case "T":
                    System.out.println("Enter the coordinates of three vertices (xcoordinate1 ycoordinate1 xcoordinate2 ycoordinate2 xcoordinate3_tri ycoordinate3_tri):");
                    //Integer variables for each of the 4 coordinates required to find the area of a rectangle.
                    int xcoordinate1_tri, xcoordinate2_tri, xcoordinate3_tri, ycoordinate1_tri, ycoordinate2_tri, ycoordinate3_tri;
                    double triangleArea;
                    
                    xcoordinate1_tri = shapeRead.nextInt();
                    ycoordinate1_tri = shapeRead.nextInt();
                    xcoordinate2_tri = shapeRead.nextInt();
                    ycoordinate2_tri = shapeRead.nextInt();
                    xcoordinate3_tri = shapeRead.nextInt();
                    ycoordinate3_tri = shapeRead.nextInt();
                    
                    shapeRead.nextLine();
                    
                  //Store the result in a double and call the method triangleArea with the necessary parameters.
                   triangleArea = triangleArea(xcoordinate1_tri, ycoordinate1_tri, xcoordinate2_tri, ycoordinate2_tri, xcoordinate3_tri, ycoordinate3_tri);
                   
                    //Resulting statement.
                    System.out.println("The area of the triangle is " + triangleArea);
                    
                    //End the switch statement
                    break;
                
                case "Q":
                    //Making our boolean true once the user enters "Q", which will terminate the program.
                	quit = true;
                    
                	//Sample text...
                    System.out.println("Exiting the program...");
                    
                    //End the switch statement.
                    break;
                
                //If the user enters the wrong input.
                default:
                   
                	System.out.println("Invalid choice. Please try again.");
                   
                	break;
            }
        }
        shapeRead.close();
    }
    /*
     * Menu() - Used for navigation on the part of the user, laying out their options and what the program does. 
     */
    public static void Menu() {
    	   System.out.println("Welcome to the area calculation program, to start, view the prompts below: ");
    	   System.out.println("Enter R for calculating a rectangle");
    	   System.out.println("Enter T for calculating a triangle");
    	   System.out.println("Enter Q to terminate this program");
    	   
    }
    
    /*
     * rectangleArea() - Takes 4 arguments, in this case the coordinates of a rectangle on a plane. 
     * 					 Follows the standard area formula, subtracts both sets of points and then 
     * 					 calculates the area. 
     * 
     */
    public static double rectangleArea(int xcoordinate1, int ycoordinate1, int xcoordinate2, int ycoordinate2) {
        double length, width, area;
    	
        length = xcoordinate1 - xcoordinate2;
        
        width = ycoordinate1 - ycoordinate2;
        
        area = length * width;
        
        return area;
    }

    /*
     * triangleArea() - Takes 6 arguments, which are the 3 sets of x, y coordinates for the triangle on a plane. 
     * 					Calls the distance() method and calculates for each side, Heron's Formula is used below to give the area
     * 					seen in variable "heron".
     */
    public static double triangleArea(int xcoordinate1, int ycoordinate1, int xcoordinate2, int ycoordinate2, int xcoordinate3_tri, int ycoordinate3_tri) {
        double tri1, tri2, tri3, sideResult, heron;
    	
        tri1 = distance(xcoordinate1, ycoordinate1, xcoordinate2, ycoordinate2);
        
        tri2 = distance(xcoordinate2, ycoordinate2, xcoordinate3_tri, ycoordinate3_tri);
        
        tri3	= distance(xcoordinate3_tri, ycoordinate3_tri, xcoordinate1, ycoordinate1);
        
        sideResult = (tri1 + tri2 + tri3) / 2;
        
        heron = Math.sqrt(sideResult * (sideResult - tri1) * (sideResult - tri2) * (sideResult - tri3));
        
        return heron;
    }
    
    /*
     * distance() - Distance formula implemented in a method to make code more concise. Calculates the distance between coordinates to receive the dimensions of the sides. 
     */

    public static double distance(int xcoordinate1, int ycoordinate1, int xcoordinate2, int ycoordinate2) {
    	double distance;
    	
    	distance = Math.sqrt(Math.pow((xcoordinate2 - xcoordinate1), 2) + Math.pow((ycoordinate2 - ycoordinate1), 2));
        
        return distance;
    }
}

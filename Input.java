import java.util.Scanner;// we're going to use this 
public class Input {
    Scanner input = new Scanner(System.in);
    public Input(){
        System.out.println("Where do you want go on the X-Axis ? ");// Ask for X Axis 
        int xInput = input.nextInt();
        System.out.println("Where do you want go on the y-Axis ? ");// Ask for Y Axis 
        int yInput = input.nextInt();
    }//END OF METHOD 
}//END OF CLASS 

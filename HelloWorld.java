import java.util.*;

public class HelloWorld
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your weight in kgs.");

    double weight = scanner.nextDouble();
    
    System.out.println("Please enter your height in centimeters");

    double height = scanner.nextDouble()/100;

    double BMI = (weight)/(height*height);

    System.out.println("Your BMI is " + BMI + ".");

    if (BMI > 25){
        System.out.println("This indicates that you are overweight.");
    } else if (BMI > 18.5) {
        System.out.println("This indicates that you are healthy.");
    } else {
        System.out.println("This indicates that you are underweight.");
    }

  }
}
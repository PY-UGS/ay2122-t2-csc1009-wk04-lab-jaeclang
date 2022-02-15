import java.util.*;

public class Person {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        
        double weight_value = input.nextDouble();

        System.out.print("Enter height in inches: ");
        // Scanner height_input = new Scanner(System.in);
        double height_value = input.nextDouble();
        input.close();

        BMI person1 = new BMI(height_value, weight_value);
        person1.calculateBMI();
        System.out.println("BMI is " + person1.getBMI());
        System.out.println(person1.getInterpretation());
    }
}

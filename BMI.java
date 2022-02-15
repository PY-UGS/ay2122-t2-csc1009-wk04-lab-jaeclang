public class BMI {
    protected double height;  // Entered in Pounds
    protected double weight;  // Entered in Inches
    protected double BMI;
    public static final double MT_OFFSET = 0.0254;
    public static final double KG_OFFSET = 0.45359273;


    // Constructor
    public BMI(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public void calculateBMI(){
        double converted_height = height * MT_OFFSET;   // Convert to Metres
        double converted_weight = weight * KG_OFFSET;       // Convert to KG
        setBMI(converted_weight / (converted_height * converted_height));

    }
    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
    public double getBMI() {
        return BMI;
    }
    public String getInterpretation(){
        String interpretation = "";
        if(BMI < 18.5){
            interpretation = "Underweight";
        }
        else if(BMI >= 18.5 && BMI < 25.0){
            interpretation = "Normal";
        }
        else if(BMI >= 25.0 && BMI < 30.0){
            interpretation = "Overweight";
        }
        else if(BMI >= 30.0){
            interpretation = "Obese";
        }
        return interpretation;
    }

}

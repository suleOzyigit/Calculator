public class Calculator {

    public static double add(double num1,double num2){
        double sum=num1+num2;

        return sum;
    }

    public static double subtract(double num1, double num2){

        double result=num1-num2;
        return result;
    }
    public static double multiple(double num1,double num2){
    return num1*num2;
    }
    public static double division(double num1,double num2){
double division;
        if(num2!=0){
            devision = num1/num2;
            return division;
        }else{
            return -1;
        }
    }
}

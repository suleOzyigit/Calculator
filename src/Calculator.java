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
double result;
        if(num2!=0){
            result= num1/num2;
            return result;
        }else{
            return -1;
        }
    }
    public static void reminder(int num1,int num2){
        System.out.println(num1%num1);
    }
}

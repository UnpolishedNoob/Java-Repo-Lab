package Student;

public class Calculator {
    public double Add(float a,float b){
        return  a+b;
    }
    public double Sub(float a,float b){
        return a-b;
    }
    public double Mul(float a,float b){
        return a*b;
    }
    public double Div(float a,float b){
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}

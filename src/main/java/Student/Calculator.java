package Student;

public class Calculator {
    public float Add(float a,float b){
        return  a+b;
    }
    public float Sub(float a,float b){
        return a-b;
    }
    public float Mul(float a,float b){
        return a*b;
    }
    public float Div(float a,float b){
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}

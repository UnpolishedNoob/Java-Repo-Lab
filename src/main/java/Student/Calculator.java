package Student;

public class Calculator {
    public double add(float a,float b){  // changed Add → add
        return  a+b;
    }
    public double sub(float a,float b){  // changed Sub → sub
        return a-b;
    }
    public double mul(float a,float b){
        return a*b;
    }
    public double div(float a,float b){
        if(b==0){
            throw new ArithmeticException("Division by zero!"); // also changed message
        }
        return a/b;
    }
}

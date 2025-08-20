package Student;

public class Calculator {
    public float add(float a,float b){  // changed Add → add
        return  a+b;
    }
    public float sub(float a,float b){  // changed Sub → sub
        return a-b;
    }
    public float mul(float a,float b){
        return a*b;
    }
    public float div(float a,float b){
        if(b==0){
            throw new ArithmeticException("Division by zero!"); // also changed message
        }
        return a/b;
    }
}

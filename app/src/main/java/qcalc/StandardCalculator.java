package qcalc;

public class StandardCalculator {
    
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    
protected double result;

public final void add(int num1, int num2){
    result = (double)num1+(double)num2;
    
}

public final void subtract(int num1, int num2){
    result = (double)num1-(double)num2;  
}


public final void multiply(int num1, int num2){
    result = (double)num1*(double)num2;
}

public final void divide(int num1, int num2){
    if(num2==0){
        throw new ArithmeticException("Divided By Zero");
    }
    result = (double)num1/(double)num2;
}

public final void add(double num1, double num2){
    result = num1+num2;
    if((result == Double.MAX_VALUE)||(result == Double.POSITIVE_INFINITY)){
        throw new ArithmeticException("Double Overflow");
    }
    this.result = result;
}


public final void subtract(double num1, double num2){
    result = num1-num2;
    if((result == Double.MAX_VALUE)||(result == Double.NEGATIVE_INFINITY)){
        throw new ArithmeticException("Double Overflow");
    }
    this.result= result;
}

public final void multiply(double num1, double num2){
    result = num1*num2;
    if((result==Double.MAX_VALUE)||(result==Double.NEGATIVE_INFINITY)||(result==Double.POSITIVE_INFINITY)){
        throw new ArithmeticException("Double Overflow");
    }
    this.result = result;
}

public final void divide(double num1, double num2){
    if(num2==0.0){
        throw new ArithmeticException("Divided By Zero");
    }
    this.result = num1/num2;
}

public double getResult(){
    return result;
}


public void clearResult(){
    result = 0 ;
}

public void printResult(){
    System.out.println("Standard Calculator Result: "+result);
}

}

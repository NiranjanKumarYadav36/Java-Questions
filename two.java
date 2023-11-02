class MathOperation{
    
    static int add(int a, int b){
        return (a+b);
    }

    static int subtract(int a, int b){
        return (a-b);
    }

    int multiply(int a, int b){
        return (a*b);
    }

    int didvide(int a, int b){
        if(b==0){
            System.out.println("denominator cannot be zero");
        }
        return (a/b);
    }
}

public class two{
    public static void main(String[] args){
        
        MathOperation mo = new MathOperation();

        int a1 = MathOperation.add(3,4);
            System.out.println("addition of a and b is : " +a1);
        
        int a2 = MathOperation.subtract(3,4);
            System.out.println("subtraction of a and b is : " +a2);

        int a3 = mo.multiply(4,2);
            System.out.println("multiplication of a and b is : " +a3);


        int a4 = mo.didvide(4,2);
            System.out.println("division of a and b is : " +a4);

    }
}
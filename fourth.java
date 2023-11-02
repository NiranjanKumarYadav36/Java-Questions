import static java.lang.Math.sqrt;

abstract class Shape{

    abstract double area();
    abstract double perimeter();
} 

class Circle extends Shape{
    
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double area(){
        return 3.14 * radius * radius;
    }

    @Override
    double perimeter(){
        return 2 * 3.14 * radius;
    }

}

class Rectangle extends Shape{

    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    double area(){
        return length * width;
    }

    @Override
    double perimeter(){
        return 2 * (length+width);
    }
}

class Triangle extends Shape{

    private double a;
    private double b; 
    private double c;

    Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    double area(){
        double s = (a+b+c)/2;
        return sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    double perimeter(){
        return (a+b+c);
    }

}


public class fourth{
    public static void main(String[] args){

        Circle c = new Circle(4.0);

         double a1 = c.area();
         double p1 = c.perimeter();
        
         System.out.println("Area is" + a1 + "and perimter is" + p1);   
         
        Rectangle r = new Rectangle(3.0, 5.9);

         double a2 = r.area();
         double p2 = r.perimeter();

         System.out.println("Area is" + a2 + "and perimter is" + p2);   

        Triangle t = new Triangle(3.8, 5.9, 8.0);
         double a3 = t.area();
         double p3 = t.perimeter();

         System.out.println("Area is" + a3 + "and perimter is" + p3);   
    }
}
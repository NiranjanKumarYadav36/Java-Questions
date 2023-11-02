class Shape{

    void calculateArea(){
        System.out.println("--Calculating area of a geenric shape--");
    }
}

class Circle extends Shape{

    void calculateArea(double radius){
        double area = 3.14 * radius * radius;
        System.out.println("area of circle is : "+area);
    }

}

class Rectangle extends Shape{

    @Override
    void calculateArea(){

    }

    void calculateArea(double length, double width){
        double area = length * width;
        System.out.println("area of rectangle is : "+area);
    }

}

public class one{
    public static void main(String[] args){

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.calculateArea(4.5);
        r.calculateArea(4.5,8.0);
    }
}
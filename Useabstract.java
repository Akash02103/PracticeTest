abstract class Shape
{
    public abstract double calculateArea(); //abstract mathod
}

class Circle extends Shape
{
    double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double width;
    double hight;

    public Rectangle(double width, double hight)
    {
        this.width=width;
        this.hight=hight;
    }

    public double calculateArea()
    {
        return width * hight;
    }
}

public class Useabstract
{
    public static void main(String args[])
    {
        Circle c=new Circle(5.0);
        double circleArea=c.calculateArea();
        System.out.println("Circle area:"+circleArea);

        Rectangle r=new Rectangle(3.0,4.0);
        double rectangleArea=r.calculateArea();
        System.out.println("Reactangle area:"+rectangleArea);
    }
}
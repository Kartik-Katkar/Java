import java.util.Scanner;
class Triangle extends shape{
    float height,base;

    void getInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Height Of Triangle :- ");
        height=sc.nextFloat();
        System.out.println("Enter the Base size  of Triangle :- ");
        base=sc.nextFloat();
    }
    void setArea(){
        float area;
        area=0.5f*height*base;
        System.out.println("The area Of Triangle is :- " + area);
    }

}
class Square extends shape{
    int side;

    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Triangle :- ");
        side=sc.nextInt();
    }
    void setArea(){
        long area;
        area=side*side;
        System.out.println("The area of square is :- " + area);
    }

}
class Circle extends shape{
    double radius;

    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius Of Circle :-  ");
        radius= sc.nextDouble();
    }
    void setArea(){
        double area;
        area=3.14 * radius * radius;
        System.out.println("The area of Circle is :- " + area);
    }
}
class shape{
    void getInput(){
        System.out.println();
    }
}
public class exp3 {
    public static void main(String[]args){
        Triangle obj1 = new Triangle();
        obj1.getInput();
        obj1.setArea();

        Square obj2 = new Square();
        obj2.getInput();
        obj2.setArea();

        Circle obj3 = new Circle();
        obj3.getInput();
        obj3.setArea();
    }
}
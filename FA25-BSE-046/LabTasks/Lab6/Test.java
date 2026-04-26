package LabTasks.Lab6;
public class Test {
    public static void main(String args[]) {
        Shapes[] s1=new Shapes[5];
        s1[0]=new Diamond(2,5,7,5,4);
        s1[1]=new Circle(2,3,3,3);
        s1[2]=new Triangle(4,2,1,2,3);
        s1[3]=new Rectangle(2,5,3,2,1);
        Util.draw(s1);
        System.out.println();
        Util.colour(s1);
        System.out.println();
        Util.erase(s1);
        System.out.println();
        System.out.println("Area of Diamond is: "+ s1[0].area());
        System.out.println("The Diamond move left by "+s1[0].moveLeft()+" distance");
        System.out.println();
        System.out.println("Area of Circle is: "+ s1[1].area());
        System.out.println("The Circle move right by "+s1[1].moveRight()+" distance");
        System.out.println();
        System.out.println("Area of Triangle is: "+ s1[2].area());
        System.out.println("The Triangle move left by "+s1[2].moveLeft()+" distance");
        System.out.println();
        System.out.println("Area of Rectangle is: "+ s1[3].area());
        System.out.println("The Rectangle move right by "+s1[3].moveRight()+" distance");

    }
}

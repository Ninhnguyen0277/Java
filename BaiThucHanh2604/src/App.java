import Shape.Triangle;
import Shape.Point;
import Shape.Quadrilateral;
public class App {
    public static void main(String[] args) throws Exception {
        Point a=new Point(2, 3);
        Point b=new Point(2, 3);
        Point c=new Point(2, 3);
        Point d=new Point(2, 3);
        Triangle Tr = new Triangle(a,b,c);
        Quadrilateral Qua=new Quadrilateral(a, b, c, d);
        T.checkTriangle();
        Q.checkQuadrilateral();
    }
}

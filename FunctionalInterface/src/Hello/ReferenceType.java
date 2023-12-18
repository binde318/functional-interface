package Hello;

import java.awt.*;
import java.util.Date;

public class ReferenceType {
    //reference types are copy by the references and primitive types are copy by the values and
    // they are completely independent of each other
    public static void main(String[] args) {
//        int age = 89;
//        Date now = new Date();
//        System.out.println(now);
        Point point = new Point(2,7);
        Point point1 = point;
        point1.x =8;
        System.out.println(point1);
    }
}

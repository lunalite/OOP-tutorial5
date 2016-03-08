
package qn3;

public class tut5qn3 {
    public static void main (String args[]){
    triangle tri = new triangle("Triaxx",5,5);
    rectangle rec = new rectangle("Recxx",10,10);
    
    rec.printWidthHeight();
    tri.printWidthHeight();
    testPolygon tPoly = new testPolygon();
    
    tPoly.printArea(tri);
    tPoly.printArea(rec);
    
    printArea(tri);
    printArea(rec);
    
    
    }
    //public static void printArea(rectangle r){
      //  System.out.println(r.width * r.height);
    //}
   // public static void printArea(triangle t){               
     //   System.out.println(t.width * t.height / 2); //Include more methods for all the new sublcasses
    //}
    public static void printArea(Polygon p){
        System.out.println(p.calArea());
    }
}

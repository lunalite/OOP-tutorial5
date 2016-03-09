/*
package qn2;
public class concreteClass {
    public static void main(String[] argc) {            
        //classC c = (classC)new classD();
        //classE e = (classE)c;           //Downcasting error  
        
        //ii.
        //classB b = (classB) new classE();
        //b.print(”hello”);         //incompatible types between classB and classE
        
        //iii.
        //classA a = new classF();
        //a.print(12,"there");       // claasF inherits all the way to class A
        //a.print(88);              //After upcasting, cannot access to classF methods. Compile time error as clas A doesn't have the method
        
        //iv.
        //classA a = new classC();
        //classG g = (classG)a;
        //g.print("hello");           //Runtime error. object is from classC and cannot be cast down to classG
        
        //v.
        //classA a = new classC();
        //classG g = (classG)a;
        //g.print("hello","there");     //Runtime error. object is from classC and cannot be cast down to classG
        
        //vi.
        classA a = new classF();
        classC f = (classC)a;
        f.print(88,"there");
        
    }
}
class classA {
    public void print(int x, String y){
        System.out.println("A: This is "+x+" and "+y);
    }
}
class classB extends classA {
    public void print(int x){
        System.out.println("B: This is "+x);
    }
}
class classC extends classA {          
    public void print(String x, String y){
        System.out.println("C: This is " +x+" and "+y);
    }
}
class classD extends classC {
    public void print(String a, String b){
        System.out.println("D: This is "+a+" and "+b);
    }
}
class classE extends classC {
    public void print(String x){
        System.out.println("E: This is "+x);
    }
}
class classF extends classE {
    public void print(int x){
        System.out.println("F: This is "+x);
    }
}
class classG extends classE{
    public void print(String x) {
        System.out.println("G: This is "+x);
    }
}*/

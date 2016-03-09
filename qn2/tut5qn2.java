
package qn2;

public class tut5qn2 {
    public static void main(String[] argc) {
        //classC c = (classC) new classD();
        //c.print("hello","there");       //No problen with this as classD overrides classC method of print()
        //if class c is abstract, we are declaring abstract reference class c but instantiating object of class D
        // compile time, look at class C method, it's okay. During run time, look at class D, print

        //classA a = new classC();
        //a.print(1,”there”);           //classC cannot be instantiated as it is an abstract class

        classA a = new classF();
        a.print("hello","there");     //Error when upcasting classA to classF. 
                                        //Overloading happens. But classA doesn't have the right parameters, causing an error to happen.
                
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
abstract class classC extends classA {          
    //In the case classC is an abstract class
    //It can only have abstract methods with no body
    //Any clases that extends from this class would have to override and not overload
    //the print given in classC
    abstract void print(String x, String y);
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
    public void print(String x, String y){
        System.out.println("E: This is " +x+" and "+y);
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn1;

/**
 *
 * @author HD
 */
public class tut5qn1 {
    public static void main(String[] argc) {
        classF z = new classF();
        z.print(9);                 //Uses method from classF
        z.print(2,"Cx2002");        //Uses method from classA
        z.print("Object");          //Uses method from classE
        z.print("OODP", "Java");    //Uses method from classC
        //z.print("OODP", 2002);    //Compiler error
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
        System.out.println("C: This is "+x+" and "+y);
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
}
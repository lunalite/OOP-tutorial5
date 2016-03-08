/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn3;

/**
 *
 * @author HD
 */
public class testPolygon {
    public void printArea(rectangle r){
        System.out.println(r.width * r.height);
    }
    public void printArea(triangle t){               
        System.out.println(t.width * t.height / 2);
    }
    public void print(){
        System.out.println("TEST");
    }
}

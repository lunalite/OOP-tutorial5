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
public class triangle extends Polygon{
   
    public triangle(String theName, float theWidth, float theHeight) {
        super(theName, theWidth, theHeight);
    }
    public float calArea(){
        return width*height/2;
    }
}

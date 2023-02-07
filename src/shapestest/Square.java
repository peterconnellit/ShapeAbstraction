/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapestest;

/**
 *
 * @author peter
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return super.getHeight();
    }

    public void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide();
    }
}

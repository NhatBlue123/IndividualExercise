/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bluez
 */
public class Calculation {

    Double a, b;

    public Calculation() {
    }

    public Calculation(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double summation() {
        return this.a + this.b;
    }

    public Double subtraction() {
        return this.a - this.b;
    }

    public Double multiplication() {
        return this.a * this.b;
    }

    public Double division() {
        return this.a / this.b;
    }

}

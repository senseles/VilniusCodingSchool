/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.abstracts;

/**
 *
 * @author Adam
 */
public class SymbolEntity {

    private double number1;
    private double number2;
    private char operation;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
    
    public void reset() {
        number1 = 0;
        number2 = 0;
        operation = '\u0000';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.logic;

import lt.vilnius.coding.abstracts.SymbolEntity;
import static lt.vilnius.coding.gui.MainPage.Display;

/**
 *
 * @author Adam
 */
public class CalculatorManager {

    SymbolEntity se = new SymbolEntity();
    boolean haveFirst;
    boolean haveDot;
    boolean haveAction;
    boolean newNumber;
    boolean hadResult;

    public void action(char op) {
        if (!haveFirst) {
            try {
                se.setNumber1(Double.parseDouble(Display.getText()));
                haveAction = true;
                se.setOperation(op);
            } catch (Exception e) {
                Display.setText("Išmok rašyti skaičius!");
            }
        } else {
            try {
                if (newNumber) {
                    se.setNumber2(Double.parseDouble(Display.getText()));
                    newNumber = false;
                }
                
                if (op != '=') {
                    se.setOperation(op);
                    doOperation(se.getOperation());
                } else {
                    doOperation(se.getOperation());
                    haveFirst = false;
                }
            } catch (Exception e) {
                Display.setText("Išmok rašyti skaičius!");
            }

        }
    }

    public boolean CanIType(char c) {
        if ((!Character.isDigit(c) && c != '.')
                || (c == '.' && Display.getText().contains("."))) {
            return false;
        } else {
            return true;
        }
    }

    public void DisplayAddSymbol(char c) {
        newNumber = true;
        if (haveAction) {
            if (c == '.') {
                Display.setText("0");
            } else {
                Display.setText("");
            }
            haveAction = false;
            haveFirst = true;
            haveDot = false;
        }
        if (c != '.') {
            if (!Display.getText().equals("0")) {
                Display.setText(Display.getText() + c);
            } else {
                Display.setText(Character.toString(c));
            }
        } else if (!haveDot) {
            haveDot = true;
            Display.setText(Display.getText() + c);
        }
    }

    public void ChangeSign() {
        if (Display.getText().contains("-")) {
            Display.setText(Display.getText().substring(1));
        } else {
            Display.setText("-" + Display.getText());
        }
    }

    public void ResetAll() {
        se.reset();
        Display.setText("0");
        haveFirst = false;
        haveDot = false;
        haveAction = false;
        newNumber = false;
    }
    
        public void ResetAllWithLast(String s) {
        se.reset();
        Display.setText(s);
        haveFirst = false;
        haveDot = false;
        haveAction = false;
        newNumber = false;
    }

    private void doOperation(char operation) {
        switch (operation) {
            case '+':
                se.setNumber1(se.getNumber1() + se.getNumber2());
                Display.setText(Double.toString(se.getNumber1()));
                haveFirst = true;
                haveAction = true;
                break;
            case '-':
                se.setNumber1(se.getNumber1() - se.getNumber2());
                Display.setText(Double.toString(se.getNumber1()));
                haveFirst = true;
                haveAction = true;
                break;
            case '*':
                se.setNumber1(se.getNumber1() * se.getNumber2());
                Display.setText(Double.toString(se.getNumber1()));
                haveFirst = true;
                haveAction = true;
                break;
            case '/':
                se.setNumber1(se.getNumber1() / se.getNumber2());
                Display.setText(Double.toString(se.getNumber1()));
                haveFirst = true;
                haveAction = true;
                break;
        }
    }
}

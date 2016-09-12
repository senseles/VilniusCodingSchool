/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.logic;

import lt.vilnius.coding.abstracts.CalculatorInterface;

/**
 *
 * @author Aurimas
 */
public class CalculatorManager implements CalculatorInterface  {

     double firstnum ;
    double secondnum ;
    double result;
   String operations;

    /**
     *
     * @param firstnum
     * @param secondnum
     * @param operations
     * @return
     */
    @Override
    public double calculate(String operations, double firstnum, double secondnum ) { 
        this.firstnum = firstnum;
        this.operations = operations;
        this.secondnum = secondnum;
                switch (operations) {
            
            case "+":
                
                result = firstnum + secondnum;
             
               // sudek.addnumbers(firstnum, secondnum);
               // String answer = String.format("%s", result);
            
                break;
                
            case "-":
                result = firstnum - secondnum;
              // jTextField1.setText(String.valueOf(result));
                break;
                
            case "*":
               result = firstnum * secondnum;
              // jTextField1.setText(String.valueOf(result));
                break;
                
            case "/":
                result = firstnum / secondnum;
             //  jTextField1.setText(String.valueOf(result));
                break;
                
            default:
                System.out.println("Blogas ivestas veiksmas");
                }
        return result;
        }
        
        
      // result = firstnum + secondnum;
    // return result;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    


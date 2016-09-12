/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vilnius.coding.abstracts;

/**
 *
 * @author Aurimas
 */
public  class SimbolEntity {
    double firstnum;
    double secondnum;
    double result;
    String operations;



    public double getfirstnum() {
        return firstnum;
    }

    public void setfirstnum(double firstnum) {
        this.firstnum = firstnum;
    }

    public double getsecondnum() {
        return secondnum;
    }

    public void setSsecondnum(double secondnum) {
        this.secondnum = secondnum;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    

    public String getoperations() {
        return operations;
    }

    public void setoperations(String operations) {
        this.operations = operations;
    }

}
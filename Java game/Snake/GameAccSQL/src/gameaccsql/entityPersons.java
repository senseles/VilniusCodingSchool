/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameaccsql;

import java.util.Objects;

/**
 *
 * @author Daniel
 */
public class entityPersons {

    String id;

    String FisrtName;
    
    String LastName;

    dbHelper dbHelper;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFisrtName() {
        return FisrtName;
    }

    public entityPersons(dbHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public void setFisrtName(String FisrtName) {
        this.FisrtName = FisrtName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public dbHelper getDbHelper() {
        return dbHelper;
    }

    public void setDbHelper(dbHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final entityPersons other = (entityPersons) obj;
   
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPersons{" + "FisrtName=" + FisrtName + ", LastName=" + LastName + ", dbHelper=" + dbHelper + '}';
    }
}

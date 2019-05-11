/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ana
 */
public interface DomainObject extends Serializable{
    
    public String getTableName();

    public String getColumnNames();

    public String getColumnNamesForSelect();

    public String getValueInsert();

    public String getValueUpdate();

    public String getWhereCondition();

    public String getJoinCondition();

    public String getMaxKey();

    public ArrayList<DomainObject> ucitajListu(ResultSet rs) throws SQLException;

    public String getAlias();

    public String getGrouping();
    
    public String getWhereDeleteCondition();
    
    public String getWhereUpdateCondition();

    public String getWhereMaxIdCondition();
    
    public String getIdCondition();
    
    public abstract String vratiImeTabele();
    public abstract String vratiVrednostiZaInsert();
    public abstract String vratiUslovZaPretragu();    
}

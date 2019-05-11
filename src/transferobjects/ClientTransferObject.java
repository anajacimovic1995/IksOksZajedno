/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferobjects;

import domen.DomainObject;
import java.io.Serializable;

/**
 *
 * @author Ana
 */
public class ClientTransferObject implements Serializable{
    private int operation;
    private DomainObject parameter;

    public ClientTransferObject() {
    }

    public ClientTransferObject(int operation, DomainObject parameter) {
        this.operation = operation;
        this.parameter = parameter;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public DomainObject getParameter() {
        return parameter;
    }

    public void setParameter(DomainObject parameter) {
        this.parameter = parameter;
    }

    
   
}

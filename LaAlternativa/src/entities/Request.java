/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import utils.Enumerators.RequirementType;

/**
 *
 * @author alulab14
 */
public class Request {
    private RequirementType type;
    private String description;
    private int idEmployee;
    private int index;
    private int idRequest;
    
    public Request(){}
    /**
     * @return the type
     */
    public RequirementType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(RequirementType type) {
        this.type = type;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the idEmployee
     */
    public int getIdEmployee() {
        return idEmployee;
    }

    /**
     * @param idEmployee the idEmployee to set
     */
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the idRequest
     */
    public int getIdRequest() {
        return idRequest;
    }

    /**
     * @param idRequest the idRequest to set
     */
    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.drogaria.view.menu;

/**
 *
 * @author lucio
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class MenuView {
     
    public void save() {
        addMessage("Salvo com sucesso!", "Data saved");
    }
     
    public void update() {
        addMessage("Atualizado com sucesso!", "Data updated");
    }
     
    public void delete() {
        addMessage("Excluído com sucesso!", "Data deleted");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}

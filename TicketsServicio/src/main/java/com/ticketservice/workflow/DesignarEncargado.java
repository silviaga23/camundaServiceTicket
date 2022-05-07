package com.ticketservice.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class DesignarEncargado implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String valorSolicitado = (String) delegateExecution.getVariable("tipoSolicitud");

        if(valorSolicitado == "planning"){
            System.out.println("se asigna tal");
            delegateExecution.setVariable("responsable", "juan");
        }


    }
}

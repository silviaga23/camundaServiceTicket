package com.ticketservice.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class NotificarAlCliente implements JavaDelegate {


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String responsable = (String) delegateExecution.getVariable("responsable");
        System.out.println("blablabla" + responsable);

    }
}


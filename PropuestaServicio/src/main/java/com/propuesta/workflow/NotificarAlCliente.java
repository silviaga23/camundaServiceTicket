package com.propuesta.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class NotificarAlCliente implements JavaDelegate {
    @Autowired
    JdbcTemplate database;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String responsable = (String) delegateExecution.getVariable("responsable");
        System.out.println("blablabla" + responsable);

    }
}

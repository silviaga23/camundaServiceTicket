package com.ticketservice.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Map;

public class SolicitudRecibida implements JavaDelegate {


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Map<String,Object> valorSolicitado = delegateExecution.getVariables();
        String nombreSolicitante = (String) valorSolicitado.get("nombreSolicitante");
        String emailSolicitante = (String) valorSolicitado.get("emailSolicitante");
        String telSolicitante = (String) valorSolicitado.get("telSolicitante");
        String descProblema = (String) valorSolicitado.get("descProblema");
        String poblacionMeta = (String) valorSolicitado.get("poblacionMeta");
        String presupuesto = (String) valorSolicitado.get("presupuesto");
        String fechaEntrega = (String) valorSolicitado.get("fechaEntrega");
        String descEmpresa = (String) valorSolicitado.get("descEmpresa");
        String tipoSolicitud = (String) valorSolicitado.get("tipoSolicitud");


        System.out.println("Informacion registrada" + nombreSolicitante + emailSolicitante + telSolicitante + descProblema +
                poblacionMeta + presupuesto + fechaEntrega + descEmpresa + tipoSolicitud);


    }
}

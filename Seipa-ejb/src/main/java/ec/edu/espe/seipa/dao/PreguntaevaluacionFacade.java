/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.seipa.dao;

import ec.edu.espe.seipa.model.Preguntaevaluacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ronny
 */
@Stateless
public class PreguntaevaluacionFacade extends AbstractFacade<Preguntaevaluacion> {
    @PersistenceContext(unitName = "ec.edu.espe.seipa_Seipa-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PreguntaevaluacionFacade() {
        super(Preguntaevaluacion.class);
    }
    
    public String findIdPreguntaEvaluacion() {
        try {
            String codigoNuevo;
            Query qry = em.createNativeQuery("select max(IDPREEVALUACION) from BI.PREGUNTAEVALUACION");
            if(qry.getSingleResult() == null)
            {
                codigoNuevo="0";
            }else{
                codigoNuevo= qry.getSingleResult().toString();
            }
            return (codigoNuevo);
        } catch (NoResultException e) {
            return null;
        }
    }
}

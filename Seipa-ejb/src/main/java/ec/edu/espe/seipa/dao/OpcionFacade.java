/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.seipa.dao;

import ec.edu.espe.seipa.model.Evaluacion;
import ec.edu.espe.seipa.model.Opcion;
import ec.edu.espe.seipa.model.Pregunta;
import ec.edu.espe.seipa.model.TipoPregunta;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
public class OpcionFacade extends AbstractFacade<Opcion> {

    @PersistenceContext(unitName = "ec.edu.espe.seipa_Seipa-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OpcionFacade() {
        super(Opcion.class);
    }

    public List<Opcion> getOpcionesByPregunta(Pregunta pregunta) {
        try {

            Opcion objOpcion;
            List<Opcion> lsOpcion = new ArrayList();
            String sql = "SELECT o.* FROM BI.OPCION o join BI.PREGUNTAOPCION po on o.IDOPCION= po.IDOPCION WHERE po.IDPREGUNTA=" + pregunta.getIdpregunta();
            Query qry = em.createNativeQuery(sql);
            List<Object[]> p1 = qry.getResultList();
            if (p1.size() >= 1) {
                for (int i = 0; i < p1.size(); i++) {
                    objOpcion = new Opcion();
                    objOpcion.setIdopcion(new BigDecimal(p1.get(i)[0].toString()));
                    objOpcion.setValorOpcion(p1.get(i)[1].toString());
                    objOpcion.setDescripcion(p1.get(i)[2].toString());
                    lsOpcion.add(objOpcion);
                }
            }
            return lsOpcion;
        } catch (NoResultException e) {
            return null;
        }
    }

}

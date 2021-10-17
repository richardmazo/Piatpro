/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.TblUsuarios;

/**
 *
 * @author johan
 */
@Stateless
public class TblUsuariosFacade extends AbstractFacade<TblUsuarios> {

    @PersistenceContext(unitName = "sardisPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblUsuariosFacade() {
        super(TblUsuarios.class);
    }
    
}

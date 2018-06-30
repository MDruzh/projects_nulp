package ua.Lviv.iot.persistance.dao;

import ua.Lviv.iot.Exhibit;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class ExhibitDaoImpl extends AbstractDao<Exhibit> implements ExhibitDao, Serializable {

    private static final long serialVersionUID = 1L;
    //@PersistenceContext
    //private EntityManager entityManager;

    @Override
    protected Class<Exhibit> getEntityClass() {
        return Exhibit.class;
    }
}


package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rachel
 */
@Stateless
public class StudentsFacade extends AbstractFacade<Students> {

    @PersistenceContext(unitName = "REST_Assignment_B00075594PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentsFacade() {
        super(Students.class);
    }
    
}

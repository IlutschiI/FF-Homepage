/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.story;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import model.story.Story;
import persistence.AbstractFacade;

/**
 *
 * @author wicki
 */
@RequestScoped
public class StoryFacade extends AbstractFacade<Story> {

    @Inject
    EntityManager em;

    public StoryFacade(Class<Story> entityClass) {
        super(entityClass);
    }

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

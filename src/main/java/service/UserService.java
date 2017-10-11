package service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by wicki on 14.07.2017.
 */
@RequestScoped
@Path("test")
public class UserService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test(){
        System.out.println("Test is called");
        return "{value:'hello world'}";
    }

}

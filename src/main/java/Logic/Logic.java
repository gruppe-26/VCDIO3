package Logic;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("Logic")
public class Logic {

    @Path("CreateUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void CreateUser(){
    }

}


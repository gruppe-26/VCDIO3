package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("getUser")
public class GetUserService {

    @Path("CreateUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void getUser(){
    }
}

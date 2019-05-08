package Logic;

import DAL.DTO.UserDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("Logic")
public class Logic {

    @Path("CreateUser")
    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void CreateUser(@FormParam("username") String username, @FormParam("firstname") String firstname, @FormParam("initials") String initials,
                           @FormParam("CPR") String CPR, @FormParam("password") String password, @FormParam("rolle") String rolle){

        UserDTO userDTO = new UserDTO();

    }

}


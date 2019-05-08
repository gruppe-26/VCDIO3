package rest;

import DAL.DTO.IUserDTO;
import DAL.DTO.UserDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("getUser")
public class GetUserService {

    @Path("json")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void getUser(String username, String initials, String password) {
        IUserDTO user = new UserDTO();
        user.setUserName(username);
        user.setIni(initials);
        user.setPassword(password);

        //Test
        System.out.println(user.getUserName() + user.getIni() + user.getPassword());
    }
}

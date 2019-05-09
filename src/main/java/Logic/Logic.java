package Logic;

import DAL.DAO.IUserDAO;
import DAL.DAO.UserDAOImpl;
import DAL.DTO.UserDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/user")
public class Logic {

    @POST
    @Path("/add")
    public void CreateUser(@FormParam("username") String username,
                           @FormParam("firstname") String firstname,
                           @FormParam("initials") String initials,
                           @FormParam("CPR") String CPR,
                           @FormParam("password") String password,
                           @FormParam("rolle") String rolle)
                           throws IUserDAO.DALException {



        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(username);
        userDTO.setIni(initials);
        userDTO.setName(firstname);
        userDTO.setCpr(CPR);
        userDTO.setPassword(password);

        UserDAOImpl init = new UserDAOImpl();

        init.createUser(userDTO);

    }

}


import DAL.DAO.IUserDAO;
import DAL.DAO.UserDAOImpl;
import DAL.DTO.UserDTO;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Path("/user")
public class Logic {

    @GET
    public String newUser(){
        // return newUser();
        return "Hej";
    }

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
    // Method that tests the database to show that backend works.
    public static void main(String[] args) throws IUserDAO.DALException {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(1);
        userDTO.setUserName("mcmalloy");
        userDTO.setIni("mcm");
        userDTO.setName("Mark");
        userDTO.setCpr("150996");
        userDTO.setPassword("acjyanqx5");

        /*
        ArrayList<String> roles = new ArrayList();
        roles.add("Admin");
        userDTO.addRole(roles.get(0));
         */


        UserDAOImpl init = new UserDAOImpl();

        init.createUser(userDTO);
    }

}


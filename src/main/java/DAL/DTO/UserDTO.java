package DAL.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Standard implementation of DAL.DTO.IUserDTO
 */
public class UserDTO implements Serializable, IUserDTO {
    //Fields
    private int	userId;
    private String name;
    private String userName;
    private String ini;
    private String cpr;
    private String password;
    private ArrayList roles;
    //Constructor

//    public UserDTO(int userId, String userName, String ini, String password, String cpr, ArrayList roles) {
//        this.userId = userId;
//        this.userName = userName;
//        this.ini = ini;
//        this.password = password;
//        this.cpr = cpr;
//        this.roles = roles;
//    }

    //Getters and Setters
    @Override
    public int getUserId() {
        return userId;
    }
    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @Override
    public String getName() { return name;}
    @Override
    public void setName(String name) { this.name = name; }
    @Override
    public String getUserName() {
        return userName;
    }
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String getIni() {
        return ini;
    }
    @Override
    public void setIni(String ini) {
        this.ini = ini;
    }
    @Override
    public String getCpr(){return cpr;}

    @Override
    public void setCpr(String cpr) { this.cpr=cpr; }

    @Override
    public void setCpr(){ this.cpr = cpr;}
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public ArrayList getRoles() {
        return roles;
    }
    @Override
    public void setRoles(ArrayList roles) {
        this.roles = roles;
    }

    @Override
    public void addRole(String role){
        this.roles.add(role);
    }
    /**
     *
     * @param role
     * @return true if role existed, false if not
     */
    @Override
    public boolean removeRole(String role){
        return this.roles.remove(role);
    }

    @Override
    public String toString() {
        return "DAL.DTO.UserDTO [userId=" + userId + ", userName=" + userName + ", ini=" + ini + ", roles=" + roles + "]";
    }



}
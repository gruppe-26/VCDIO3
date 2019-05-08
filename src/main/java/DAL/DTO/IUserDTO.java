package DAL.DTO;

import java.util.ArrayList;
import java.util.List;

public interface IUserDTO {
    int getUserId();

    void setUserId(int userId);

    String getUserName();

    void setUserName(String userName);

    String getIni();

    void setIni(String ini);

    String getPassword();

    void setPassword(String password);

    ArrayList getRoles();

    void setRoles(ArrayList roles);

    void addRole(String role);

    boolean removeRole(String role);
}

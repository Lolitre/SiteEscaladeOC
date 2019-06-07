package fr.llescoffit.Action;

import com.opensymphony.xwork2.ActionSupport;
import fr.llescoffit.DAO.Impl.UserImpl;
import fr.llescoffit.Model.User;

public class AddUserAction extends ActionSupport {
    public String execute() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setMotDePasse("test123");
        user.setNom("babor");
        UserImpl userquery = new UserImpl();
        userquery.add(user);

        return SUCCESS;
    }
}

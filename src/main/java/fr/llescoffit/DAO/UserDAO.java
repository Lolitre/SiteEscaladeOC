package fr.llescoffit.DAO;

import fr.llescoffit.Model.User;

public interface UserDAO {

    void add(User user);

    void remvoe(User user);

    void select(User user);

    void channgeMDP(User user);


}

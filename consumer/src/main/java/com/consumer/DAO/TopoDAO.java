package com.consumer.DAO;

import com.model.Topo;
import com.model.User;

public interface TopoDAO {

    void addTopo(Topo topo);

    void remove(Topo topo);

    void edit(Topo topo);

    void changerProprietaire(Topo topo, User user);
}

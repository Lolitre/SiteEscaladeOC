package com.consumer.DAO;

import com.model.Topo;

public interface TopoDAO {

    void addTopo(Topo topo);

    void remove(Topo topo);

    void edit(Topo topo);
}

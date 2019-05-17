package com.consumer.DAO;

import com.model.Tag;

public interface TagDAO {

    void add (Tag tag);

    //Il faut que le tag soit associer à aucun Topo ua moement de la suppression
    void remove(Tag tag);

}

package com.consumer.DAO;

import com.model.Voie;

public interface VoieDAO {

    void add(Voie voie);

    void remove(Voie voie);

    void edit(Voie voie);

    void setdifficulte(Voie voie);
}

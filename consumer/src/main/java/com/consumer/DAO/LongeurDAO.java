package com.consumer.DAO;

import com.model.Difficulte;
import com.model.Longueur;

public interface LongeurDAO {

    void add(Longueur longueur);

    void remove(Longueur longueur);

    void setdifficulte(Longueur longeur, Difficulte difficulte);

}

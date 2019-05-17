package com.consumer.DAO;

import com.model.Commentaire;

public interface CommentaireDAO {

    void add(Commentaire com);

    void remove(Commentaire com);

    void edit(Commentaire com);

}

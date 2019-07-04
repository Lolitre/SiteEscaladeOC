package fr.llescoffit.Action;

import com.opensymphony.xwork2.ActionSupport;

import fr.llescoffit.Business.Inscription;
import fr.llescoffit.Model.User;

public class InscriptionAction extends ActionSupport {

    private User user = new User();
    private String confirmation;
    private String message;

    public String getMessage() {
        return message;
    }

    public String Submit() {

        String result = ActionSupport.INPUT;
        if (this.user != null) {

            if (user.getNom().length() < 3)
                addFieldError("user.name", "Votre nom doit être plus grand que 3 charactère.");

            if (!user.getEmail().matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                addFieldError("user.email", "Merci de saisir un email valide.");
            }
            if (user.getMotDePasse().length() < 3) {
                addFieldError("user.motdepasse", "Votre mot de passe doit être de plus de 3 charactère.");
            }

            if (!user.getMotDePasse().equals(confirmation)) {
                addFieldError("confirmation", "Les mots de passe doivent être identiques");
            }
            if (!this.hasErrors()) {
                //ajouter utilisateur à la base de données
                result = ActionSupport.SUCCESS;

                Inscription inscription = new Inscription();
                String failure = inscription.validation(user);
                if (failure == null) {
                    message = "Inscription réussi";
                    result = ActionSupport.SUCCESS;
                } else {
                    message = failure;

                }
            }
        }
        return result;
    }

}
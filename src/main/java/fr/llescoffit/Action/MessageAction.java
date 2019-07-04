package fr.llescoffit.Action;

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {


        private String message;

        public String getMessage() {
            return message;
        }
        public String execute(){
            message = "Inscirption réussi";

            return SUCCESS;

        }



}

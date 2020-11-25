/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epampractise1;

/**
 *
 * @author microchel
 */
public class Model {

    
    public static String READY_TEXT = "HELLO WORLD";
    
    private String message;
    
    public Model() {
        message = "";
    }
    
    public void appendMessage(String text) {
        message += text;
    }
    
    public String getMessage() {
        return message;
    }
    
    public boolean checkForCorrectnessAndAdd(String line) 
    {
        if(Model.READY_TEXT
                    .contains(line.toUpperCase())) {

                if(!getMessage().contains(line.toUpperCase())) {

                    if(line.toUpperCase().equals("WORLD") && getMessage().toUpperCase().contains("HELLO")) {
                        appendMessage(line);
                        return true;
                    } else {
                        appendMessage(line);
                    }
                        
                }
            }
        return false;
    }
    
}

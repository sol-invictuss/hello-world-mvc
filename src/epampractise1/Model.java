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

    
    public static String READY_TEXT = "Hello World";
    
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
    
    public boolean checkForCorrectness(String line) 
    {
        if(Model.READY_TEXT
                    .toUpperCase()
                    .contains(line.toUpperCase())) {

                if(!getMessage().toUpperCase().contains(line.toUpperCase())) {
                    appendMessage(line);
                    if(line.toUpperCase().equals("WORLD"))
                        return true;
                }
            }
        return false;
    }
    
}

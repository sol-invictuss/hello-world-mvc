/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epampractise1;

import java.util.Scanner;

/**
 *
 * Bob Marten
 * "Clear Code"
 * @author microchel
 */



public class Controller {
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void getMessage() {
        view.showMessage(View.INIT_MESSAGE);
        Scanner in = new Scanner(System.in);
        while(true) {
            String line = in.nextLine();
            if(model.checkForCorrectness(line))
                break;
        }
        
        view.showMessage(View.READY_MESSAGE + ": " + Model.READY_TEXT);
        
        
    }
}

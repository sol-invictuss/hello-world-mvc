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
public class EpamPractise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Model model = new Model();
        final View view = new View();
        
        Controller controller = new Controller(model, view);
        controller.getMessage();
    }
    
}

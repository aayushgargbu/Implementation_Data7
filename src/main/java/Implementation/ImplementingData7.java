/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

/**
 *
 * @author aayush.garg
 */
public class ImplementingData7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String directoryPath = "C:/GitHub/VulData7/Vulnerabilities/";
            
//            Project Name Options: linux, openssl, wireshark, systemd, android
            String projectName = "openssl";
            Interactor_Data7 objInteractor_Data7 = new Interactor_Data7();
            objInteractor_Data7.InteractWithData7(directoryPath, projectName);

        } catch (Exception ex) {
            System.out.println("Exception at ImplementingData7.Main:" + ex.getMessage());
        }
    }
}

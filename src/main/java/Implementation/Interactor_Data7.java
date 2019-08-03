/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import data7.Importer;
import data7.Exporter;
import data7.ResourcesPath;
import data7.model.Data7;

/**
 *
 * @author aayush.garg
 */
public class Interactor_Data7 {

    public void InteractWithData7(String directoryPath, String projectName) {
        try {
            //Indicate your path
            ResourcesPath path = new ResourcesPath(directoryPath);

            //To create or update a project
            Importer importer = new Importer(path);
            Data7 data7 = importer.generateGenericProject(projectName);
            // Projects are available in projects module
            //like CMetaInf.LINUX_KERNEL

            //To simply load a dataset without any update
            Exporter exporter = new Exporter(path);
            // To export to xml
            exporter.exportDatasetToXML(data7);
        } catch (Exception ex) {
            System.out.println("Exception at Interactor_Data7.InteractWithData7: " + ex.getMessage());
        }
    }
}

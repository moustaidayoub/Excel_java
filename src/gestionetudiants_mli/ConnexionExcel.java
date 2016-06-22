/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiants_mli;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author 
 */
public class ConnexionExcel {
    Workbook workbook=null;
    File f=null;
    public ConnexionExcel(String fichier){
    f=new File(fichier);
    }
    public Sheet read() throws IOException, BiffException
    {
        //on recupere le fichier excel
        workbook=Workbook.getWorkbook(f);
        //on accede à la premiere feuille dans le fichier excel
	Sheet sheet = workbook.getSheet(0);
        return sheet;
        
    }
}

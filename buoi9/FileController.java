
package demosuot.buoi9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileController {
    public static void writePersonToFile(String filename, Person person){
        try {
            FileWriter fw= new FileWriter(filename, true);
            BufferedWriter bw= new BufferedWriter(fw);
                
            bw.write(person.getName()+","+person.getAge()+","+person.getAddress()+"\n");
            
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static List<Person> readPersonsFromFile(String filename){
        List<Person> persons= new ArrayList<>();
        try {
            FileReader fr= new FileReader(filename);
            BufferedReader br= new BufferedReader(fr);
            String line = null;  //line= suot,21,vietnam
            while((line= br.readLine())!=null){
                String str[]= line.split(","); 
                Person p= new Person(str[0], Integer.parseInt(str[1]), str[2]);
                persons.add(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
}

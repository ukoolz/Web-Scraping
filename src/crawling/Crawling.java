package crawling;
import crawling.SeleniumDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ukoolz
 */
public class Crawling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       SeleniumDemo sd =new SeleniumDemo();
        try {
        sd.setUp();
        sd.testDemo();
    }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
}

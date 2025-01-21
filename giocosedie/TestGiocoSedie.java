/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package giocosedie;

import java.util.logging.Logger;

import javax.print.DocFlavor.STRING;

import java.util.Scanner;

public class TestGiocoSedie {
    static Scanner a = new Scanner(System.in);
    private final static int NUMSEDIE = a.nextInt();
        private static Logger logger = Logger.getLogger("GiocoSedie.TestGiocoSedie");
        //inizializzazione delle variabili 

        /**
         * @param args the command line arguments
         */
        
        public static void main(String[] args) {
            Posto sedie[] = new Posto[NUMSEDIE];

	for (int k = 0; k < sedie.length; k++)
		sedie[k] = new Posto();
//fino a qua genera il numero di sedie usando anche La classe posto 

	Display display = new Display(sedie);
	//System.out.println("Sto facendo partire il Display.");
        logger.info("Sto facendo partire il Display.\n");
	display.start();
     //fa partire il display 

	Partecipante array[] = new Partecipante[NUMSEDIE+1];
	for (int i = 0; i < NUMSEDIE + 1; i++) {
		array[i] = new Partecipante(sedie);
                //System.out.println("Sto facendo partire il thread n." + array[i].getId());
                logger.info("Sto facendo partire il thread id: " + array[i].getId()+" name: "+array[i].getName()+"\n");
                array[i].start();
                }
	}
    }
//crea partecipanti in base al numero di sedie + 1

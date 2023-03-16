/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.F.SentenciasDeControl;

/**
 *
 * @author Javi
 */
 class F_SentenciaBreakAndContinue {

}

class BreakContinue {

    public void ejemploBreak() {
        for (int i = 1; i <= 10; i++) {
            
            if (i == 5) {

                break;
            }
            System.out.println(i);
        }
    }

    public void ejemploBreak2() {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {

                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public void breakLabeledFor() {
          
        for (int i = 1; i <= 3; i++) {
            
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                   
                    break;
                }
                System.out.println(i + " " + j);
            }

        }
    }

    public void breakWhile() {
         
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }

    public void breakDoWhile() {
         
        int i = 1;
         
        do {
            if (i == 5) {
                
                i++;
                break;
            }
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public void continueEjemplo() {
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
               
                continue; 
            }
            System.out.println(i);
        }
    }

    public void continueBucleAnidado() {
      
        for (int i = 1; i <= 3; i++) {
          
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                     
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public void continueLabeled() {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                  
                    continue aa;
                }
                System.out.println(i + " " + j);
            }
        }

    }

    public void continueWhile() {
        //while loop  
        int i = 1;
        while (i <= 10) {
            if (i == 5) {                 
                i++;
                continue;  
            }
            System.out.println(i);
            i++;
        }
    }

    public void continueDoWhile() {
          
        int i = 1;
         
        do {
            if (i == 5) {
                 
                i++;
                continue;  
            }
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}//fin de la clase


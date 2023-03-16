/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.B.conceptos;

/**
 *
 * @author Javi
 */
//en vez de hacer una clase que se encargue de hacerlo todo
class BudgetReport {

    void connectToRDBMS() {
    }

    void generateBudgetReport() {
    }

    void saveToFile() {
    }

    void print() {
    }
}

//Es un diseño mucho mas cohesivo si lo hicieramos asi
//Teniendo una clase que maneja a las demas, de tal forma, podremos modificar el fichero de cada clase de forma individual y no afectar al resto
class BudgetReport2 {

    void getReportingOptions() {}

    void generateBudgetReport(String opciones) {}
}

class ConnectToRDBMS {
   void  getRDBMS(){;}
}
 
class PrintStuff {

   void  getPrintOptions() {;}
}

class FileSaver {

   void  getFileSaveOptions() {}
}

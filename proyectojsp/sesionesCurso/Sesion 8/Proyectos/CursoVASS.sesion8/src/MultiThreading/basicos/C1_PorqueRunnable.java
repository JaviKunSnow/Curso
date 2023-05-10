/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

import java.io.Serializable;

class C1_PorqueRunnable implements Runnable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

class miClaseSinMasHerencia extends Thread {

}

class MiClaseBase {

}

class miClaseConHerencia extends MiClaseBase implements Runnable, Serializable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

class E1_EjemploHilosPrioridades extends Thread {

   boolean bandera = false;
	
    public void run() {
//        System.out.println("running thread name is:" + Thread.currentThread().getName());
//        System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
//   
    	
    	 
    	   	
    	  if(this.getPriority() == Thread.MAX_PRIORITY) {
    		  System.out.println("Soy el hilo de maxima prioridad");
    		  bandera = true;
    	  }    	  
    	
    	  
    	  if(this.getPriority() == Thread.MIN_PRIORITY && bandera) {
    		  System.out.println("Soy el hilo de maxima prioridad");
    	  }
    	  
    	  if(this.getPriority() == Thread.MIN_PRIORITY && bandera) {
    		  System.out.println("Soy el hilo de maxima prioridad");
    	  }
    
    }

    public static void main(String args[]) {

        for (int i = 0; i < 1000; i++) {
        	E1_EjemploHilosPrioridades m1 = new E1_EjemploHilosPrioridades();
        	E1_EjemploHilosPrioridades m2 = new E1_EjemploHilosPrioridades();
           
        
        	m1.setPriority(Thread.MIN_PRIORITY);
            m2.setPriority(Thread.MAX_PRIORITY);          
            m1.start();
            m2.start();

        }

    }
}

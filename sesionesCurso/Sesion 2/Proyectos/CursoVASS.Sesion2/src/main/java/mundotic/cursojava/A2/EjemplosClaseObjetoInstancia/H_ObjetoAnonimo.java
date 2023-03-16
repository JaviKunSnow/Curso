package mundotic.cursojava.A2.EjemplosClaseObjetoInstancia;

/**
 *
 * @author Javi
 */
class OjetoAnonimo {

    
    void fact(int n) {
        
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial is " + fact);
    }

    public static void main(String args[]) {
        
        //Objeto Anonimo
        new OjetoAnonimo().fact(5);//Hacemos la llamada del metodo a traves de la linea de creacion de instancia, no creando asi un objeto explicitamente. 
        
        //Creacion de multiples objetos del mismo tipo
        OjetoAnonimo o1 = new OjetoAnonimo(), o2 = new OjetoAnonimo();
    }
}

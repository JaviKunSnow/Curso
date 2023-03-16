/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.D.polimorfismo.sobreescribir;

/**
 *
 * @author Javi
 */
public class B_PolimorfismoSobreEscrituraFuncionesPrediseñadas {

}

final class String  implements java.io.Serializable, Comparable, CharSequence {

    public static String valueOf(Object obj) {
        return (obj == null) ? null : null;
    }

    public static String valueOf(char data[]) {
        return new String();
    }

    public static String valueOf(char data[], int offset, int count) {
        return new String();
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char charAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

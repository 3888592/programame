
package pa0;

public class PA0 {

    public static void main(String[] args) {
        boolean finalizar;
        
        do{
            String entrada = leerEntrada();
            if(!(finalizar = finalDelJuego())) {
                logica();
                escribirSalida();
            }
        }while(!finalizar);
    }
//jugador1
    private static String leerEntrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//jugador2
    private static boolean finalDelJuego() {
        throw new UnsupportedOperationException("TODAVIA NO BEBESITA"); //To change body of generated methods, choose Tools | Templates.
    }

    private static void logica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void escribirSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

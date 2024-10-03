


public abstract class JuegoConVidas {
    /**
     * Clase que representa un juego con vidas
     */

    public int vidas;
    private int vidas_iniciales;
    private int record = 0;

    public abstract boolean juega(String cadena);

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public JuegoConVidas(int vidas) {
        this.vidas = vidas;
        this.vidas_iniciales = vidas;
    }


    private void muestraVidasRestantes() {
        System.out.println("Vidas restantes: " + this.vidas);
    }

    public boolean quitaVida() {
        this.vidas--;
        if (this.vidas == 0) {
            System.out.println("Juego terminado");
            return false;
        } else {
            System.out.println("Te quedan " + this.vidas + " vidas");
            return true;
        }
    }

    public void reiniciaPartida() {
        this.vidas = this.vidas_iniciales;
    }

    public void actualizaRecord() {
        if (this.vidas == this.record) {
            System.out.println("Has alcanzado tu record");
        } else if (this.vidas > this.record) {
            this.record = this.vidas;
            System.out.println("Has superado tu record\nNuevo record: " + this.record);
        }
    }

}
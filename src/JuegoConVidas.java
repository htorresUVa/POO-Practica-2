public class JuegoConVidas {
    /**
     * Clase que representa un juego con vidas
     */

    private int vidas;
    private int vidas_iniciales;
    private int record = 0;

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

    public void muestraVidasIniciales() {
        System.out.println("Vidas iniciales: " + this.vidas_iniciales);
    }

    public void muestraVidasRestantes() {
        System.out.println("Vidas restantes: " + this.vidas);
    }

    public void quitaVida() {
        this.vidas--;
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
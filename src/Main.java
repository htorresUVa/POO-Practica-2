

public class Main {
    public static void main(String[] args) {
        JuegoConVidas juego = new JuegoConVidas(5);
        juego.muestraVidasIniciales();
        juego.quitaVida();

        JuegoConVidas juego2 = new JuegoConVidas(5);
        juego2.muestraVidasIniciales();
        juego2.actualizaRecord();
        juego2.quitaVida();

        juego.reiniciaPartida();
        juego.muestraVidasRestantes();
        juego.actualizaRecord();

    }
}
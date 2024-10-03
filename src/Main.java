
import Entrada.MyInput;

public class Main {

    public static void main(String[] args){
        int vidas = 5;
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(vidas, 8);
        JuegoAdivinaNumeroImpar juegoImpar = new JuegoAdivinaNumeroImpar(vidas, 3);
        JuegoAdivinaNumeroPar juegoPar = new JuegoAdivinaNumeroPar(vidas, 6);

        jugar(juego);
        jugar(juegoImpar);
        jugar(juegoPar);

    }

    public static void jugar(JuegoConVidas juego){
        juego.reiniciaPartida();
        System.out.println("Introduce un número entre 0 y 10");
        String end = MyInput.readString();
        while (juego.juega(end)) {
            System.out.println("Introduce un número entre 0 y 10");
            end = MyInput.readString();
        }


    }

}
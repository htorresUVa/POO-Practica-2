
import Entrada.MyInput;

public class Main {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3, 5);
        juego.reiniciaPartida();
        System.out.println("Introduce un número entre 0 y 10");
        String end = MyInput.readString();
        while (juego.juega(end)) {
            System.out.println("Introduce un número entre 0 y 10");
            end = MyInput.readString();
        }

    }
}
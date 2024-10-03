public class JuegoAdivinaNumeroPar  extends JuegoAdivinaNumero{
    public JuegoAdivinaNumeroPar(int vidas, int adivinar) {
        super(vidas, adivinar);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10){
            if (numero % 2 == 0){
                System.out.println("Número par");
                return true;
            } else {
                System.out.println("El número tiene que ser par");
                return false;
            }
        } else {
            System.out.println("Número fuera del intervalo [0, 10]");
            return false;
        }
    }
}

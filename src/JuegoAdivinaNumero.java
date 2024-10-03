public class JuegoAdivinaNumero extends JuegoConVidas {
    private int adivinar;

    public JuegoAdivinaNumero(int vidas, int adivinar) {
        super(vidas);
        this.adivinar = adivinar;
    }

    @Override
    public boolean juega(String cadena) {
        int numero = Integer.parseInt(cadena);
        if (validaNumero(numero)) {
            if (numero == adivinar) {
                System.out.println("Acertaste!!!");
                setRecord(vidas);
                return false;
            }
        }
        if (numero > adivinar) {
            System.out.println("El número a adivinar es menor");
        } else {
            System.out.println("El número a adivinar es mayor");
        }

        return quitaVida();
    }

    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            System.out.println("Número válido");
            return true;
        } else {
            System.out.println("Número fuera del intervalo [0, 10]");
            return false;
        }
    }
}

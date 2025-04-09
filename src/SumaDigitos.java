public class SumaDigitos {
    public int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        else {
            return numero % 10 + sumaDigitos(numero / 10);
        }
    }
}

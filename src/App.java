import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SumaNumeroConsecutivos sumaObj = new SumaNumeroConsecutivos();
        PotenciaNumero potenciaObj = new PotenciaNumero();
        SumaDigitos sumaDigitosObj = new SumaDigitos();
        Fibonacci fib = new Fibonacci();

        System.out.print("Ingrese un número para la suma de números consecutivos: ");
        int numeroSuma = scanner.nextInt();
        System.out.println("Suma de números consecutivos hasta " + numeroSuma + ": " + sumaObj.suma(numeroSuma));

        System.out.print("Ingrese la base para la potencia: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el exponente para la potencia: ");
        int exponente = scanner.nextInt();
        System.out.println(base + "^" + exponente + " = " + potenciaObj.potencia(base, exponente));

        System.out.print("Ingrese un número para la suma de sus dígitos: ");
        int numeroDigitos = scanner.nextInt();
        System.out.println("Suma de dígitos de " + numeroDigitos + ": " + sumaDigitosObj.sumaDigitos(numeroDigitos));

        System.out.println("Ingrese un número para calcular método fibonacci: ");
        int n= scanner.nextInt();
        System.out.println("Fibonacci de "+n+"= "+fib.fibonacci(n));

    }
}

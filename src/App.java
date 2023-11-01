import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Operaciones disponibles:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Selecciona una operación (1/2/3/4/5): ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida. Por favor, selecciona una operación válida.");
                continue;
            }

            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: división por cero");
                        continue;
                    }
                    resultado = num1 / num2;
                    break;
            }

            System.out.println("Resultado: " + resultado);
        }
        
        scanner.close();
    }
}

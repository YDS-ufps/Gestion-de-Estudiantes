import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    private ArrayList<Estudiante> estudiantes;
    private Scanner scanner;

    public Gestion(){
        estudiantes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        gestion.ejecutar();
    }

    public void ejecutar() {
        while (true) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 3:
                    buscarEstudiante();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n---- Menú ----");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Listar Estudiantes");
        System.out.println("3. Buscar Estudiante por Código");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private int obtenerOpcion() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }

    private void agregarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();
        int edad = 0;
        while (true) {
            try {
                System.out.print("Ingrese la edad del estudiante: ");
                edad = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Edad inválida. Intente nuevamente.");
            }
        }
        System.out.print("Ingrese el código del estudiante: ");
        String codigo = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, apellido, edad, codigo);
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado exitosamente.");
    }

    private void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de Estudiantes:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    private void buscarEstudiante() {
        System.out.print("Ingrese el código del estudiante a buscar: ");
        String codigo = scanner.nextLine();
        Estudiante encontrado = null;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                encontrado = estudiante;
                break;
            }
        }
        if (encontrado != null) {
            System.out.println("Estudiante encontrado: " + encontrado);
        } else {
            System.out.println("Estudiante con código " + codigo + " no encontrado.");
        }
    }
}

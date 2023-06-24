package modulo01;

import java.util.Scanner;

 public class Modulo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Medico[] medicos = new Medico[10];
        int contadorMedicos = 0;

        System.out.println("Bienvenido al sistema de registro de medicos");
        System.out.println("--------------------------------------------");

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre del medico: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la especialidad del medico: ");
            String especialidad = scanner.nextLine();

            System.out.print("Ingrese la hora de almuerzo del medico: ");
            int horaAlmuerzo = scanner.nextInt();
            scanner.nextLine();

            Medico medico = new Medico(nombre, especialidad, horaAlmuerzo);
            medicos[contadorMedicos] = medico;
            contadorMedicos++;

            System.out.print("¿Desea agregar otro medico? (s/n): ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("Informacion de los medicos registrados:");
        for (int i = 0; i < contadorMedicos; i++) {
            System.out.println("Medico " + (i + 1));
            System.out.println("Nombre: " + medicos[i].getNombre());
            System.out.println("Especialidad: " + medicos[i].getEspecialidad());
            System.out.println("Hora de almuerzo: " + medicos[i].getHoraAlmuerzo());
            System.out.println();
        }
    }
}









    


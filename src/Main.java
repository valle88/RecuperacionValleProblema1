import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );


        DocInformatico archivo = new DocInformatico("PACO", 32);
        ArrayList<String> lista2= new ArrayList<String>();
        boolean salir = false;
        int opcion = sc.nextInt();

        while (!salir){
            System.out.println("1: Encender Impresora");
            System.out.println("2: Apagar impresora");
            System.out.println("3: Añadir trabajo");
            System.out.println("4: Ver lista de trabajo");
            System.out.println("5: Imprimir");
            System.out.println("6: Salir");

            switch (opcion){
                case 1:
                    System.out.println("Encender Impresora");

                    break;
                case 2:
                    System.out.println("Apagar impresora");
                    break;
                case 3:
                    System.out.println("Añadir Trabajo");
                    lista2.add(archivo.nombre);
                    break;
                case 4:
                    System.out.println("Ver lista de trabajo");
                    System.out.println(lista2);
                    break;
                case 5:
                    System.out.println("Imprimir");
                    lista2.remove(archivo.nombre);
                    break;
                case 6:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("selecione opcion valida");

            }
        }
    }
}


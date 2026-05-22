import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBST arbol = new ArbolBST();
        int opcion;
        do {
            System.out.println("=================================");
            System.out.println(" GanaderosCasanare S.A.S.");
            System.out.println("=================================");
            System.out.println("1. Insertar animal");
            System.out.println("2. Modificar animal");
            System.out.println("3. Buscar animal");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Raza: ");
                    String raza = sc.nextLine();

                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    arbol.insertar(codigo, raza, peso, edad);

                    System.out.println("Animal insertado");
                    break;
                case 2:
                    System.out.print("Codigo: ");
                    int codMod = sc.nextInt();

                    System.out.print("Nuevo peso: ");
                    double nuevoPeso = sc.nextDouble();

                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();

                    boolean modificado =
                            arbol.modificar(codMod,
                                            nuevoPeso,
                                            nuevaEdad);
                    if(modificado) {
                        System.out.println("Datos modificados");
                    } else {
                        System.out.println("Animal no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Codigo a buscar: ");
                    int codBuscar = sc.nextInt();
                    NodoAnimal encontrado =
                            arbol.buscar(codBuscar);
                    if(encontrado != null) {
                        System.out.println(
                            "Raza: " + encontrado.getRaza());
                    } else {
                        System.out.println("No existe");
                    }
                    break;
                case 4:
                    arbol.recorrerInorden();
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while(opcion != 5);
        sc.close();
    }
}
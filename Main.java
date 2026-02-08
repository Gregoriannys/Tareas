import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n  Menu principal ");
            System.out.println("Seleccione una opcion");
            System.out.println("5. Sistema de figuras");
            System.out.println("6. Gestion de productos");
            System.out.println("7. Inventario con arrays");
            System.out.println("8. Copia de arrays");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion){
               
                case 5:
                    sistemaFiguras();
                    break;

                 case 6:
                    gestionProductos();
                    break;
                
                case 7 :
                    inventarioProductos();
                    break;

                case 8 :
                    copiaArrays();
                    break;

                case 0 :
                    System.out.println("Listo!");
                 
                default:
                    System.out.println("Opcion invalida.");
                


            }


        }while (opcion != 0);

        sc.close();


    }


public static void sistemaFiguras(){

    Figura[] figuras = new Figura[3];

    figuras[0] = new Cuadrado(6);
    figuras[1] = new Rectangulo(8, 2);
    figuras[2] = new Circulo(3);

    for (Figura f : figuras){
        System.out.println("Area de la figura: " + f.area());

    }

}

public static void gestionProductos(){

    Producto producto = new Producto("Macbook", 1800, 2);

    producto.vender(2);

    System.out.println("Nombre " + producto.getNombre());
    System.out.println("Precio  " + producto.getPrecio());
    System.out.println("Stock disponible:  " + producto.getStock());


}

public static void inventarioProductos(){

    Producto[] inventario = new Producto[3];

    inventario[0]  = new Producto("Disco duro", 3500, 4);
    inventario[1]  = new Producto("Memoria RAM", 4200, 0);
    inventario[2]  = new Producto("Laptop", 5500, 1);


    double total = 0;

    System.out.println("Productos con stock:");

    for (Producto p : inventario){

        if(p.getStock() > 0){
            System.out.println(p.getNombre() + " - Stock: "  + p.getStock());
            total += p.valorTotal();

        }

    }

    System.out.println("Valor total del inventario: " + total);




}

public static void copiaArrays(){

    int[] original = {15, 25, 35, 45};
    int[] copia = original.clone();

    copia[0] = 99;

    System.out.println("Array original: ");
    for ( int n : original){
        System.out.println(n + " ");
    }

    System.out.println("\nArray copiado: ");
    for (int n : copia){
        System.out.print(n + " ");
    }

    /*
         * DIFERENCIA ENTRE COPIA SUPERFICIAL Y PROFUNDA:
         * - clone() crea una copia superficial.
         * - En arrays de tipos primitivos, esto funciona como copia profunda,
         *   porque los valores se duplican y el array original no se ve afectado.
         * - En arrays de objetos, ambos arrays compartirían las mismas referencias.
         */
}

    
}

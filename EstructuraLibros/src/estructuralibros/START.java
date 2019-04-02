package estructuralibros;


//BRIAN SANTIZO 0901-17-1483
import java.util.Scanner;

public class START {

    public static void main(String[] args) {
        
        Libro libro;
        Lista lista2 = new Lista();
        Scanner sc = new Scanner(System.in);
        String titulo,autor,isbn; 
        int pp;
        int sw = 0;
        //Ingreso del numero de libros que desea ingresar
        System.out.print("INGRESE EL NUMERO DE LIBROS QUE DESEA INGRESAR:   ");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
          //Ingreso de los libros
       
             System.out.println("INGRESE TITULO: ");
             titulo = sc.next();
             System.out.println("INGRESE AUTOR: ");
             autor = sc.next();
             System.out.println("INGRESE CODIGO: ");
             isbn = sc.next();
        
        libro = new Libro(titulo,autor,isbn);
        lista2.insertarPrincipio(libro);
        }
        
        do{  
           
        System.out.print(" \n\t 1) ELIMINAR \n\t 2) MOSTRAR \n\t 3) INGRESO EXTRA");
        System.out.print("\n\t INGRESE LA OPCION QUE DESEA: ");
        sw = sc.nextInt();


        switch (sw) {

            case 1:
                int eli;
                System.out.print("QUE DESEA ELIMINAR (PRIMERO '1' ULTIMO '2' TODO '3'):   ");
                eli = sc.nextInt();
                if(eli == 1){                
                //Eliminar todo
                lista2.borrarPrimero();             
                }
                if(eli ==2){
                //Elimanar el ultimo 
                lista2.eliminarUltimo();
                }
                if(eli==3){
                //Eliminar todo     
                int n = 0;  
                lista2.eliminaPrincipio();
                }
                break;

            case 2:
                //Muestra los datos ingresdos
                System.out.print("LISTADO DE LIBROS");
                System.out.println(lista2.Listar());
                System.out.println("LA LONGITUD ES DE:  "+lista2.contar());
                break;
            
            case 3:
                
                int ops1;
                System.out.print("DESEA INGRESAR AL PRINCIPIO O AL FINAL: (PRINCIPIO '1' FINAL '2' ESPECIAL '3': ");
                ops1 = sc.nextInt();
                //Ingreso al principio de la lista
                if(ops1 ==1){
                System.out.println("--INGRESO PRINCIPIO--");
                System.out.println("INGRESE TITULO: ");
                titulo = sc.next();
                System.out.println("INGRESE AUTOR: ");
                autor = sc.next();
                System.out.println("INGRESE CODIGO: ");
                isbn = sc.next();
        
                libro = new Libro(titulo,autor,isbn);
                lista2.insertarPrincipio(libro);                    
                } 
                if (ops1==2){
                //Ingresa al final de la lista
                System.out.println("--INGRESO FINAL--");
                System.out.println("INGRESE TITULO: ");
                titulo = sc.next();
                System.out.println("INGRESE AUTOR: ");
                autor = sc.next();
                System.out.println("INGRESE CODIGO: ");
                isbn = sc.next();
        
                libro = new Libro(titulo,autor,isbn);
                lista2.insertarFinal(libro);  
                }else {
                    //Ingresa en el lugar especifico que desea el usuario
                int correccion1=0; 
                int correccion2=1; 
                int n=0;

                System.out.println("EN QUE POSICION LA DESEA INGRESAR:  ");
                correccion1 = sc.nextInt();
                n = (correccion1 - correccion2);
                System.out.println("--INGRESO FINAL--");
                System.out.println("INGRESE TITULO: ");
                titulo = sc.next();
                System.out.println("INGRESE AUTOR: ");
                autor = sc.next();
                System.out.println("INGRESE CODIGO: ");
                isbn = sc.next();
        
                libro = new Libro(titulo,autor,isbn);
                lista2.insertarDespues(n,libro); 
                }
                break;
        }
        //Si desea hacer otra operacion
        System.out.print("DESEA HACER OTRA OPERACION ( SI (1) NO (0)):  ");
        pp = sc.nextInt();
        }while(pp!=0);
    }
}

package estructuralibros;


import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class START {

    public static void main(String[] args) {
        
        Libro libro;
        Lista lista2 = new Lista();
        Scanner sc = new Scanner(System.in);
        String titulo,autor,isbn; 
        int pp;
        int sw = 0;
        
        System.out.print("Ingrese numero de libros a ingresar:   ");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
          
       
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
           
        System.out.print(" \n\t 1) Eliminar \n\t 2) Mostrar");
        System.out.print("\n\t Ingrese numero de opcion: ");
        sw = sc.nextInt();


        switch (sw) {

            case 1:
                int eli;
                System.out.print("Desea elimanar el primer libro o el ultimo (PRIMERO '1' ULTIMO '2' TODO '3': ");
                eli = sc.nextInt();
                if(eli == 1){
                    
                //Eliminar el principio
                lista2.borrarPrimero();
                
                }
                if(eli ==2){
                
                //Elimanar el ultimo 
                lista2.eliminarUltimo();
 
                }
                if(eli==3){
                    //Eliminar el libro
                    
                int n = 0;  
                lista2.eliminarLibro(n);

                }
                break;

            case 2:
                
                System.out.print("LISTADO DE LIBROS");
                System.out.println(lista2.Listar());
                
               

                break;

          

        }
        System.out.print("Desea hacer otra operacion SI (1) NO (0):  ");
        pp = sc.nextInt();
        }while(pp!=0);
    }

    
}

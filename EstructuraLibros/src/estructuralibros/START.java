package estructuralibros;


import java.util.ArrayList;
import java.util.Scanner;

public class START {

    public static void main(String[] args) {
         ArrayList<Libro> Lista = new ArrayList<>();
         Libro libro= null;
         Lista lista2 = new Lista();
        
        int pp;
      
 

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese numero de libros a ingresar:   ");
        int num = sc.nextInt();
        Lista.add(libro);
        
        for (int i = 0; i < num; i++) {
          System.out.print("Ingrese titulo " + (i + 1) + ":   ");
          String titulo = sc.next();
            lista2.insertarPrincipio(libro);
           
        }
        
        do{
        System.out.print(" \n\t 1) Eliminar \n\t 2) Mostrar");
        System.out.print("\n\t Ingrese numero de opcion: ");
        int sw = sc.nextInt();

        switch (sw) {

            case 1:
                int eli;
                System.out.print("Desea elimanar el primer libro o el ultimo (PRIMERO '1' ULTIMO '2' TODO '3': ");
                eli = sc.nextInt();
                if(eli == 1){
                    
                //Eliminar el principio
                lista2.eliminaPrincipio();
                
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
               
//                for(int i = 0;  i<Lista.size(); i++){
//                
//               System.out.print(" Titulo "+getTitulo()+" Autor "+getAutor()+"Genero "+getisbn());
//                }
                break;

          

        }
        System.out.print("Desea hacer otra operacion SI (1) NO (0):  ");
        pp = sc.nextInt();
        }while(pp!=0);
    }

    
}

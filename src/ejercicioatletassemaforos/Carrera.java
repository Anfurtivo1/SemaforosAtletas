
package ejercicioatletassemaforos;

/**
 *
 * @author Andres
 */
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Atletas atleta1= new Atletas("Atleta 1-1",1,1);
        Atletas atleta2= new Atletas("Atleta 2-1",2,1);
        
        Atletas atleta3= new Atletas("Atleta 1-2",3,2);
        Atletas atleta4= new Atletas("Atleta 2-2",4,2);
        
        atleta1.start();
        atleta2.start();
        atleta3.start();
        atleta4.start();
        
        atleta1.join();
        //System.out.println("El atleta 1 ha acabado");
        atleta2.join();
        //System.out.println("El atleta 2 ha acabado");
        atleta3.join();
        //System.out.println("El atleta 3 ha acabado");
        atleta4.join();
        //System.out.println("El atleta 4 ha acabado");
        
    }
    
}

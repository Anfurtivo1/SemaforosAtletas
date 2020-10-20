
package ejercicioatletassemaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Andres
 */
public class Atletas extends Thread{
    private String nombre;
    private int dorsal;
    private int equipo;
    Semaphore semAtletas2= new Semaphore(1);
    Semaphore semAtletas= new Semaphore (1);
    private static int contador=1;

    public Atletas(String nombre, int dorsal, int equipo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.equipo = equipo;
    }

    public Atletas() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }
    
    public void run(){
            while (contador<=5) {
                if (this.getDorsal()==contador && this.getEquipo()==1) {
                    try {
                        
                        semAtletas.acquire();
                        System.out.println("El atleta "+this.getNombre()+" ha conseguido el testigo");
                        sleep(3000);
                    
                    semAtletas.release();
                    System.out.println("El atleta "+this.getNombre()+" ha pasado el testigo");
                    sleep(3000);
                    } catch (InterruptedException ex) {
                        System.out.println("Error en "+ex);
                    }catch (Exception ex) {
                        System.out.println("Error en "+ex);
                    }
                }
            
                if (this.getDorsal()==contador && this.getEquipo()==2) {
                        try {
                            sleep(3000);
                            semAtletas2.acquire();
                            System.out.println("El atleta "+this.getNombre()+" ha conseguido el testigo");
                            sleep(3000);
                        
                        semAtletas2.release();
                        System.out.println("El atleta "+this.getNombre()+" ha pasado el testigo");
                        sleep(3000);
                        } catch (InterruptedException ex) {
                            System.out.println("Error en "+ex);
                        }catch (Exception ex) {
                            System.out.println("Error en "+ex);
                        }
                    }
                
                contador++;
        }

    }
}
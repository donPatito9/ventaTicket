package ventaticket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
//import ventaticket.logica.Cliente;
import ventaticket.logica.Ticket;

/**
 *
 * @author RobinsonConcha
 */

public class VentaTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Ticket> listaTickets = new ArrayList<>();
        
        Ticket ticket1 = new Ticket(12, 2, 3, 5000, new Date(), new Date());
        Ticket ticket2 = new Ticket(13, 2, 4, 5000, new Date(), new Date());
        Ticket ticket3 = new Ticket(14, 2, 5, 5000, new Date(), new Date());
        
        
        Ticket ticket4 = new Ticket();
        ticket4.setNumero(15);
        ticket4.setFila(2);
        ticket4.setAsiento(6);
        ticket4.setPrecio(5000);
        ticket4.setFechaCompra(new Date());
        ticket4.setFechaValidez(new Date());
        
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        listaTickets.add(ticket4);
        
        
        double suma = 0;
        for (Ticket tick: listaTickets){
            suma = suma + tick.getPrecio();  
        }
        System.out.println("La suma de Precios es : "+ suma);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la fila de tickets que desea ver");
        int fila = entrada.nextInt();
        
        boolean bandera = false;
        
        for (Ticket tick : listaTickets){
            if (tick.getFila() == fila){
                
                //System.out.println("Numero de Ticket:" + tick.getNumero());
                System.out.println(tick.toString());
                bandera = true;
            }
        }
        
        if (bandera == false){
            System.out.println("No se encontraron datos en la fila");
        }
        //Cliente
      /*  
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setDni("12345");
        cliente.setNombre("Robinson");
        cliente.setApellido("Concha");
        cliente.getListaTickets().add(ticket1);
        
        Ticket ticket5 = new Ticket(16, 2, 6, 4000, new Date(2024-10-02), new Date());
        cliente.getListaTickets().add(ticket5);
          */
    }
    
}

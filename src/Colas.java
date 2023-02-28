import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// es útil en situaciones de productor / consumidor, donde una parte del código está creando datos para ser utilizados por otra parte

public class Colas {
    public Colas () {
    
    System.out.println("Ingresando a ");
        String cadena;
        
         int min = -10000000;
        int max = 10000000;
        int numCount = 1000000;
        Queue<Integer> queue = new LinkedList<>();
         cadena = JOptionPane.showInputDialog("");
         
           Random random = new Random();
        for (int i = 0; i < numCount; i++) {
            int num = random.nextInt(max - min + 1) + min;
            queue.add(num);
        }

     
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("random_numbers.txt"))) {
            while (!queue.isEmpty()) {
                int num = queue.remove();
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
}
    
}

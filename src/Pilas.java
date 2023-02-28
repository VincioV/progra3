import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Stack;
import java.io.FileWriter;
import java.io.IOException;

// Para el metodo de pilas utilice Stack porque permite almacenar objetos y luego recuperarlos en el orden inverso en el cual se insertaron

public class Pilas {
    
    public Pilas(){
    
        System.out.println("Ingresando a ");
        String cadena;
       int min = -10000000;
       int max = 10000000;
       int count = 1000000;
        Stack<Integer> stack = new Stack<>();
        
       cadena = JOptionPane.showInputDialog("");
        
        
        
       Random rand = new Random();
    for (int i = 0; i < count; i++) {
      int num = rand.nextInt((max - min) + 1) + min;
      stack.push(num);
    }
    

    try {
      FileWriter writer = new FileWriter("random_numbers.txt");
      while (!stack.empty()) {
        int num = stack.pop();
        writer.write(Integer.toString(num) + "\n");
      }
      writer.close();
      System.out.println("Random numbers written to file.");
    } catch (IOException e) {
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
    }
       
    
    
        
    }
    

}

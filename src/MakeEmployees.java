import TerminalIO.KeyboardReader;
public class MakeEmployees{
    public static void main(String[] args) {
    KeyboardReader kr = new KeyboardReader(); 
    String name = kr.readLine("Enter Name ---->: "); 
    System.out.println("The Name is: "+name); 
    System.out.println("This is another line.");
            
    }
    
}

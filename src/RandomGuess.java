import javax.swing.*;

public class RandomGuess {

    public static void main(String[] args) {
//     System.out.println("hello world");
        JOptionPane.showMessageDialog(null, "the number is " +
                (1 + (int) (Math.random() * 100)));

    }
}

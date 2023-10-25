package task;

import javax.swing.*;

public class listBuku {

    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.append("List of Books:\n\n");

        // Book 1
        textArea.append("Book 1: Fairy Tail \n");
        textArea.append("Summary 1: This is the summary of book 1.\n\n");

        // Book 2
        textArea.append("Book 2: Your Name \n");
        textArea.append("Summary 2: This is the summary of book 2.\n\n");

        // Book 3
        textArea.append("Book 3: Sevent Deadly Sins \n");
        textArea.append("Summary 3: This is the summary of book 3.\n\n");

        // Book 4
        textArea.append("Book 4: Your lie in April \n");
        textArea.append("Summary 4: This is the summary of book 4.\n\n");

        // Book 5
        textArea.append("Book 5: Demon Slayer \n");
        textArea.append("Summary 5: This is the summary of book 5.\n\n");

        JScrollPane scrollPane = new JScrollPane(textArea);

        JFrame frame = new JFrame("List Buku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

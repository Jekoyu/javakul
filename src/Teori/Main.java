package Teori;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface Info {
    void getInfo();
}

class Person implements Info {
    private String nama;
    private int usia;

    public Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void getInfo() {
        System.out.println("nama: " + nama);
        System.out.println("usia: " + usia);
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
}

class InfoFrame extends JFrame implements Info {
    private JTextField kolomNama;
    private JTextField kolomUsia;

    public InfoFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JLabel labelNama = new JLabel("Nama:");
        kolomNama = new JTextField(20);

        JLabel labelUsia = new JLabel("Usia:");
        kolomUsia = new JTextField(5);

        JButton button = new JButton("Tampilkan");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInfo();
            }
        });

        JPanel panel = new JPanel();
        panel.add(labelNama);
        panel.add(kolomNama);
        panel.add(labelUsia);
        panel.add(kolomUsia);

        panel.add(button);

        add(panel);
    }

    public void getInfo() {
        String nama = kolomNama.getText();
        int usia = Integer.parseInt(kolomUsia.getText());

        Person person = new Person(nama, usia);

        JOptionPane.showMessageDialog(this,
                "Nama\t: " + person.getNama() + "\nUsia\t: " + person.getUsia(),
                "Hasil", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class Main {
    public static void main(String[] args) {
        InfoFrame frame = new InfoFrame();
        frame.setVisible(true);
    }
}

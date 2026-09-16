import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BookRoom{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4;
    JTextArea addr;
    JButton b1,b2;

    public BookRoom() {
        f = new JFrame("Book Room");
        f.setSize(800, 650);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Customer Name");
        l2=new JLabel("Phone Number");
        l3=new JLabel("ID Proof");
        l4=new JLabel("Room Type");
        l5=new JLabel("Check-in-Date");
        l6=new JLabel("Address");

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        addr= new JTextArea();

        b1=new JButton("Book");
        b2=new JButton("Cancel");

        String[] type={"--Select Room Type--","Single","Single with A.C","Double","Double with A.C"};
        JComboBox<String> rt =new JComboBox<>(type);

        l1.setBounds(100,40,150,40);
        l2.setBounds(100,120,150,40);
        l3.setBounds(100,200,150,40);
        l4.setBounds(100,280,150,40);
        l5.setBounds(100,360,150,40);
        l6.setBounds(100,420,150,40);

        t1.setBounds(400,40,350,40);
        t2.setBounds(400,120,350,40);
        t3.setBounds(400,200,350,40);
        rt.setBounds(400,280,350,40);
        t4.setBounds(400,360,350,40);
        addr.setBounds(400,420,350,80);

        b1.setBounds(500,520,100,50);
        b2.setBounds(650,520,100,50);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(addr);
        f.add(rt);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
    }

}
// public class Booking {
//     public static void main(String[] args) {
//         BookRoom br= new BookRoom();
//     }
// }

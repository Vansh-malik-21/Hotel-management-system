import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CheckOutRecord{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,lb;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1,b2,b3;
    JComboBox method;

    public CheckOutRecord(){
        f = new JFrame("Check-Out");
        f.setSize(1000, 700);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lb= new JLabel("Check-Out");
        l1= new JLabel("Booking Id");
        l2= new JLabel("Room No");
        l3= new JLabel("Customer Name");
        l4= new JLabel("Check-In");
        l5= new JLabel("Check-Out");
        l6= new JLabel("Total Days");
        l7= new JLabel("Room Charges");
        l8= new JLabel("Other Charges");
        l9= new JLabel("Payment Method");
        l10= new JLabel("Total Amount");

        lb.setFont(new Font("Arial", Font.BOLD, 24));

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        t7=new JTextField();
        t8=new JTextField();
        t9=new JTextField();

        b1=new JButton("Calculate Total");
        b2=new JButton("Confirm Check Out");
        b3=new JButton("Cancel");
       

        String[] type={"Cash","Card","UPI"};
        JComboBox<String> method =new JComboBox<>(type);

        lb.setBounds(450,50,300,50);
        l1.setBounds(50,150,150,40);
        t1.setBounds(220,150,250,40);
        l2.setBounds(550,150,150,40);
        t2.setBounds(720,150,250,40);
        l3.setBounds(50,230,150,40);
        t3.setBounds(220,230,250,40);
        l4.setBounds(550,230,150,40);
        t4.setBounds(720,230,250,40);
        l5.setBounds(50,310,150,40);
        t5.setBounds(220,310,250,40);
        l6.setBounds(550,310,150,40);
        t6.setBounds(720,310,250,40);
        l7.setBounds(50,390,150,40);
        t7.setBounds(220,390,250,40);
        l8.setBounds(550,390,150,40);
        t8.setBounds(720,390,250,40);
        l9.setBounds(50,470,150,40);
        method.setBounds(220,470,250,40);
        l10.setBounds(550,470,150,40);
        t9.setBounds(720,470,250,40);

        b1.setBounds(180,560,150,70);
        b2.setBounds(360,560,250,70);
        b3.setBounds(640,560,150,70);

        f.add(lb);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.add(t9);
        f.add(method);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setVisible(true);
    }
}

// public class CheckOut {
//     public static void main(String[] args) {
//         CheckOutRecord cor=new CheckOutRecord();
//     }
// }

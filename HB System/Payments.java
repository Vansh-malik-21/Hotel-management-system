import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class PaymentsAccepter{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JButton b1;
    JComboBox method;

    public PaymentsAccepter(){
        f = new JFrame("Payments");
        f.setSize(1000, 700);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Payments");
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        l2= new JLabel("Payments Details");
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l3= new JLabel("Payment Amount");
        l4= new JLabel("Payment Method");
        t1= new JTextField();

        b1= new JButton("Make Payment");

        String[] type={"Cash","Card","UPI"};
        JComboBox<String> method =new JComboBox<>(type);
        
        String[] cols={"Payment ID","Res. ID","Room No","Amount Paid","Method","Date of Payment"};
        Object [][] data={};
       
        DefaultTableModel model=new DefaultTableModel(data,cols);
        JTable table=new JTable(model);
        JScrollPane scroll= new JScrollPane(table);
        table.getTableHeader().setFont(new Font("ARIAL",Font.BOLD,16));

        l1.setBounds(400,50,300,50);
        l2.setBounds(50,120,250,40);
        l3.setBounds(50,150,150,40);
        l4.setBounds(450,150,150,40);
        t1.setBounds(50,200,300,40);
        method.setBounds(450,200,300,40);
        b1.setBounds(700,250,200,50);
        scroll.setBounds(100,320,800,300);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(method);
        f.add(b1);
        f.add(scroll);
        
        f.setVisible(true);
    }
}

// public class Payments {
//     public static void main(String[] args) {
//         PaymentsAccepter pa=new PaymentsAccepter();
//     }
// }

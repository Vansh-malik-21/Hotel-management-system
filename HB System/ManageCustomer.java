import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class Manage{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;

    public Manage() {
        f = new JFrame("Manage Customer");
        f.setSize(1000, 700);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1= new JLabel("Name");
        l2= new JLabel("Phone");
        l3= new JLabel("Email");
        l4= new JLabel("Address");

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();

        b1=new JButton("Add");
        b2=new JButton("Edit");
        b3=new JButton("Delete");
        b4=new JButton("Search");

        String[] cols={"ID","Name","Phone","Email","Address"};
        Object [][] data={};

        Object[] check={1,"Vansh","8923943016","malikvansh101010@gmail.com","Bahawari,Shamli"};
       
        DefaultTableModel model=new DefaultTableModel(data,cols);
        JTable table=new JTable(model);
        JScrollPane scroll= new JScrollPane(table);
        model.addRow(check);
 
        l1.setBounds(50,50,100,30);
        t1.setBounds(50,90,250,40);
        l2.setBounds(50,180,100,30);
        t2.setBounds(50,220,250,40);
        l3.setBounds(50,310,100,30);
        t3.setBounds(50,350,250,40);
        l4.setBounds(50,440,100,30);
        t4.setBounds(50,480,250,40);

        b1.setBounds(50,570,80,60);
        b2.setBounds(140,570,80,60);
        b3.setBounds(230,570,80,60);
        b4.setBounds(320,570,80,60);

        scroll.setBounds(350,50,620,500);
       
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(scroll);

        f.setVisible(true);
    }
}

// public class ManageCustomer {
//     public static void main(String[] args) {
//         Manage manage= new Manage();
//     }
// }

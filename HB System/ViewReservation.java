import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class SearchReservation{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2,b3;

    public SearchReservation(){
         f = new JFrame("View Reservation");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("View Reservation");
        l1.setFont(new Font("Arial", Font.BOLD, 24));

        l2=new JLabel("Search by Name/Room No:");
        l2.setFont(new Font("Arial", Font.PLAIN, 18));

        t1= new JTextField();

        b1= new JButton("Search");
        b2= new JButton("View Details");
        b3= new JButton("Cancel Reservation");

        String[] cols={"Res. ID"," Customer Name","Room No","Check-in-Date","Check-out-Date"};
        Object [][] data={};

        DefaultTableModel model=new DefaultTableModel(data,cols);
        JTable table=new JTable(model);
        JScrollPane scroll= new JScrollPane(table);
       

        l1.setBounds(250,50,400,40);
        l2.setBounds(50,120,300,40);
        t1.setBounds(350,120,350,40);

        b1.setBounds(680,180,80,50);
        b2.setBounds(200,500,200,50);
        b3.setBounds(420,500,200,50);
        
        table.getTableHeader().setFont(new Font("ARIAL",Font.BOLD,16));

        scroll.setBounds(50,290,700,200);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(scroll);

        f.setVisible(true);
    }
}

// public class ViewReservation {
//     public static void main(String[] args) {
//         SearchReservation sr= new SearchReservation();
//     }
// }

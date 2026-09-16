import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class RoomManage{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    JComboBox rt,currentstatus;

    public RoomManage() {
        f = new JFrame("Manage Rooms");
        f.setSize(1000, 700);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1= new JLabel("Room NO.");
        l2= new JLabel("Room Type");
        l3= new JLabel("Price Per Night");
        l4= new JLabel("Status");

        t1=new JTextField();
        t2=new JTextField();

        b1=new JButton("Add Room");
        b2=new JButton("Update Room");
        b3=new JButton("Delete Room");
        b4=new JButton("Search Room");

        String[] type={"--Select Room Type--","Single","Single with A.C","Double","Double with A.C"};
        JComboBox<String> rt =new JComboBox<>(type);

        String[] value={"Available","Booked","Under Maintance"};
        JComboBox<String> currentstatus =new JComboBox<>(value);


        String[] cols={"Room No","Type","Price","Status"};
        Object [][] data={};
       
        DefaultTableModel model=new DefaultTableModel(data,cols);
        JTable table=new JTable(model);
        JScrollPane scroll= new JScrollPane(table);
        table.getTableHeader().setFont(new Font("ARIAL",Font.BOLD,16));

        l1.setBounds(50,50,100,30);
        t1.setBounds(50,90,250,40);
        l2.setBounds(50,180,100,30);
        rt.setBounds(50,220,250,40);
        l3.setBounds(50,310,100,30);
        t2.setBounds(50,350,250,40);
        l4.setBounds(50,440,100,30);
        currentstatus.setBounds(50,480,250,40);

        b1.setBounds(50,570,150,60);
        b2.setBounds(210,570,150,60);
        b3.setBounds(370,570,150,60);
        b4.setBounds(530,570,150,60);

        scroll.setBounds(350,50,620,500);
       
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(rt);
        f.add(currentstatus);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(scroll);

        
        f.setVisible(true);
    }
}

// public class ManageRooms {
//     public static void main(String[] args) {
//         RoomManage rm= new RoomManage();
//     }
// }

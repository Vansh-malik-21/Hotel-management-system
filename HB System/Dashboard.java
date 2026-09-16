import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Dash implements ActionListener{
    JFrame f;
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;

    public Dash() {
        f = new JFrame("Hotel Reservation System");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setBackground(Color.LIGHT_GRAY);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Dashboard");
        l1.setFont(new Font("Arial", Font.BOLD, 24));

        b1=new JButton("Log out");
        b2=new JButton("Book Room");
        b3=new JButton("Manage Customer");
        b4=new JButton("View reservations");
        b5=new JButton("Manage Rooms");
        b6=new JButton("Payments");
        b7=new JButton("Check-Out");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        l1.setBounds(340,60,200,40);
        b1.setBounds(700,0,100,40);
        b2.setBounds(100,160,280,60);
        b3.setBounds(420,160,280,60);
        b4.setBounds(100,270,280,60);
        b5.setBounds(420,270,280,60);
        b6.setBounds(100,380,280,60);
        b7.setBounds(420,380,280,60);

        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);

        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.dispose();
            Log login =new Log();
        }
        else if(ae.getSource()==b2){
            BookRoom br= new BookRoom();
        }
        else if(ae.getSource()==b3){
            Manage manage=new Manage();
        }
        else if(ae.getSource()==b4){
            SearchReservation search= new SearchReservation();
        }
        else if(ae.getSource()==b5){
            RoomManage rm=new RoomManage();
        }
        else if(ae.getSource()==b6){
            PaymentsAccepter pa=new  PaymentsAccepter();
        }
        else if(ae.getSource()==b7){
            CheckOutRecord cr= new CheckOutRecord();
        }
    }
}

// public class Dashboard {
//     public static void main(String[] args) {
//         Dash d = new Dash();
//             }
// }

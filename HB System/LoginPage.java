import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Log implements ActionListener,ItemListener{
    JFrame f,f1;
    JLabel l1,l2,l3,l4,l5,l6,lmsg;
    JButton b1,bmsg;
    JTextField t1;
    JPasswordField t2;
    ImageIcon img;
    JComboBox<String> cb;
    String item;

    public Log()
    {
        f=new JFrame("Hotel Reservation System");
        f.setSize(1000,700);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        img = new ImageIcon("C:\\Users\\11th gen pc\\Desktop\\HB System\\HM Image.png");
        l1=new JLabel(img);
        l2=new JLabel("Hotel Reservation System");
        l3=new JLabel("Login To Continue");
        l4=new JLabel("Role");
        l5=new JLabel("UserName");
        l6=new JLabel("Password");

        l2.setFont(new Font("Arial", Font.BOLD, 28));
        l3.setFont(new Font("Arial", Font.PLAIN, 18));

        b1= new JButton("Login");
        b1.addActionListener(this);

        t1=new JTextField();
        t2=new JPasswordField();
       

        String[] roles={"--Select your Role--","Admin","Receptionist"};

        cb= new JComboBox<>(roles);
        cb.addItemListener(this);
        l1.setBounds(10,10,500,630);
        l2.setBounds(530,50,450,50);
        l3.setBounds(530,110,220,30);
        l4.setBounds(530,170,100,30);
        l5.setBounds(530,290,100,30);
        l6.setBounds(530,430,100,30);
        b1.setBounds(530,570,450,60);
        t1.setBounds(530,330,450,50);
        t2.setBounds(530,470,450,50);
        cb.setBounds(530,210,450,50);

        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(b1);
        f.add(t1);
        f.add(t2);
        f.add(cb);
        f.add(l1);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String un,pass;
            un=t1.getText();
            pass=new String(t2.getPassword());
            if("Admin".equals(item))
            {
            if(un.equals("Vansh")&&pass.equals("1234@1234"))
            {
                f.dispose();
                Dash dashboard =new Dash();
            }
            else
            {
                f1=new JFrame("Message");
                f1.setSize(500,300);
                f1.setLocationRelativeTo(null);
                f1.setResizable(false);
                f1.setLayout(null);

                lmsg=new JLabel("Invalid Username or Password, Try again!");
                lmsg.setFont(new Font("Arial", Font.PLAIN, 18));
                bmsg=new JButton("Ok");
                bmsg.addActionListener(e->{f1.dispose();});

                lmsg.setBounds(50,50,380,50);
                bmsg.setBounds(200,150,50,50);

                f1.add(lmsg);
                f1.add(bmsg);
                t1.setText("");
                t2.setText("");

                f1.setVisible(true);
            }
        }  
        else if("Receptionist".equals(item))
            {
            if(un.equals("Tushar")&&pass.equals("5678@5678"))
            {
                f.dispose();
                Dash dashboard =new Dash();
            }
            else
            {
                f1=new JFrame("Message");
                f1.setSize(500,300);
                f1.setLocationRelativeTo(null);
                f1.setResizable(false);
                f1.setLayout(null);

                lmsg=new JLabel("Invalid Username or Password, Try again!");
                lmsg.setFont(new Font("Arial", Font.PLAIN, 18));
                bmsg=new JButton("Ok");
                bmsg.addActionListener(e->{f1.dispose();});

                lmsg.setBounds(50,50,380,50);
                bmsg.setBounds(200,150,50,50);

                f1.add(lmsg);
                f1.add(bmsg);
                 t1.setText("");
                t2.setText("");


                f1.setVisible(true);
            }
        }  
        else{
              f1=new JFrame("Message");
                f1.setSize(500,300);
                f1.setLocationRelativeTo(null);
                f1.setResizable(false);
                f1.setLayout(null);

                lmsg=new JLabel("Plese select your role first.");
                lmsg.setFont(new Font("Arial", Font.PLAIN, 18));
                lmsg.setBounds(50,50,380,50);
                f1.add(lmsg);
                 t1.setText("");
                t2.setText("");

                f1.setVisible(true);
                
        }
        }
    }
    public void itemStateChanged(ItemEvent ie){
        String item1;
        item1=(String)cb.getSelectedItem();
        if(item1.equals("Admin")){
            item="Admin";
        }
        else if(item1.equals("Receptionist")){
            item="Receptionist";
        }
    }
}

public class LoginPage {
    public static void main(String[] args) {
        Log log=new Log();
    }
}

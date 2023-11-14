import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    private JPanel panel1;
    private JButton mineButton;
    private JButton shopButton;

    public Menu(){
        initialize();
    }
    public void initialize(){

      setTitle("My example");
      setSize(500,500);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);

      panel1 = new JPanel();
      panel1.setBackground(Color.red);
      panel1.setBounds(0,0,1000,1000);

      mineButton = new JButton("Mine");
      mineButton.setBounds(100,100,500,500);
      mineButton.addActionListener(this);
        
      ImageIcon icon = new ImageIcon("cat.png");
        
      mineButton.setIcon(icon);


      shopButton = new JButton("Shop");
      shopButton.setBounds(200,100,100,100);



      panel1.add(mineButton);
      panel1.add(shopButton);
      add(panel1,BorderLayout.CENTER);

  }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mineButton)
        {
            MineClick.money += 1;
            
            System.out.println(MineClick.money);
        }
    }
}

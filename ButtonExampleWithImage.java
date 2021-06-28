import javax.swing.*;      
public class ButtonExampleWithImage{    
ButtonExampleWithImage(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton ("click",new ImageIcon("click.jpg"));    
b.setBounds(100,100,300, 100);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ButtonExampleWithImage();    
}    
}    

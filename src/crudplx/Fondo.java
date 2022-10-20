package crudplx;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel{
    
    public Image imagen;
    
    public void paint(Graphics g){
        
        imagen = new ImageIcon(getClass().getResource("/imagenes/imagenCRUD.jpg")).getImage();
        
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
        
        setOpaque(false);
        
        super.paint(g);
        
    }
    
}

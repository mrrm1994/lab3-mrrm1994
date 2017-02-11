import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;


import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        g.setColor(Color.MAGENTA);
//                        g.drawRect(x1+5, y1+5, width-10, height-10);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.BLUE);
//                        g.drawLine(x1, y1+200, x2, y2-200);
                        
//                        g.setColor(Color.BLACK);
//                        g.fillOval((x2-55)/2, (y2-55)/2, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        
                        
                        
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1 + 50, y1 +160);
                        p3.addPoint(x1 + 400, y1 +160);
                        
                        p3.addPoint(x1 + 50, y1 +160);
                        p3.addPoint(x1 + 50, y1 +120);
                        
                        p3.addPoint(x1 + 400, y1 +120);
                        p3.addPoint(x1 + 400, y1 +160);
                        
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p3);
                        
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1 + 50, y1 + 40);
                        p4.addPoint(x1 + 400, y1 +40);
                        
                        p4.addPoint(x1 + 50, y1 + 40);
                        p4.addPoint(x1 + 50, y1 +80);
                        
                        
                        p4.addPoint(x1 + 400, y1 + 80);
                        p4.addPoint(x1 + 400, y1 +40);
  
                        g.setColor(Color.WHITE);
                        
                        g.fillPolygon(p4);
                        
            
                        Polygon p1 = new Polygon();
                        p1.addPoint(x1 , y1 );
                        p1.addPoint(x1+143, y1+100 );
                        p1.addPoint(x1 , y1 );
                        p1.addPoint(x1+143, y1+100 );
                        p1.addPoint(x1 , y1+200 );
                        p1.addPoint(x1, y1 );
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p1);
                        
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 93);
                        p2.addPoint(x1 + 41, y1 + 93);
                        p2.addPoint(x1 + 47, y1 + 78);
                        p2.addPoint(x1 + 53, y1 + 93);
                        p2.addPoint(x1 + 69, y1 + 93);
                        p2.addPoint(x1 + 56, y1 + 103);
                        p2.addPoint(x1 + 61, y1 + 118);
                        p2.addPoint(x1 + 47, y1 + 108);
                        p2.addPoint(x1 + 34, y1 + 118);
                        p2.addPoint(x1 + 38, y1 + 103);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                       
          
			}
			
        }

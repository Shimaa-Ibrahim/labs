
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class LineDraw extends Applet {

    Vector<InnerLine> v = new Vector<InnerLine>();

    InnerLine l;

    @Override
    public void init() {

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                l = new InnerLine();
                l.x1 = l.x2  = me.getX();
                l.y1 = l.y2 = me.getY();

            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (l.x1 != l.x2 && l.y1 != l.y2)
                {v.add(l);}
                repaint();

            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent me) {

                l.x2 = me.getX();
                l.y2 = me.getY();
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent me) {
            }

        }
        );

    }

    @Override
    public void paint(Graphics g) {
        
        g.drawLine(l.x1, l.y1, l.x2, l.y2);
        
        for (int i = 0; i < v.size(); i++) {
            g.drawLine(v.get(i).x1, v.get(i).y1, v.get(i).x2, v.get(i).y2);

        }
    }

    public class InnerLine {

        public int x1;
        public int y1;
        public int x2;
        public int y2;

    }

}

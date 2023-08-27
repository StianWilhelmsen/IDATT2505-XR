import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;



public class Drawing_Exercise1 implements GLEventListener {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangel Tegning");
        GLCapabilities capabilities = new GLCapabilities(null);
        GLCanvas canvas = new GLCanvas(capabilities);

        frame.setSize(800, 600);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas.addGLEventListener(new Drawing_Exercise1());
        frame.setVisible(true);
    }

    @Override
    public void init(GLAutoDrawable drawable){

    }

    @Override
    public void dispose(GLAutoDrawable drawable) {}


    @Override
    public void display(GLAutoDrawable drawable){
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(-1.5f, 0.0f, -8.0f);
        gl.glColor3f(0.0f, 1.0f, 0.0f);

        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, 0.0f);
        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

    }
}

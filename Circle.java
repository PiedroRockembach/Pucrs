import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Circle
{
    public int diameter;
    public int xPosition;
    public int yPosition;
    public String color;
    public boolean isVisible;
    public int R = 0;
    public int G = 0;
    public int B = 0;
    public int A = 0;
    
    /**
     * Create a new circle at default position with default color.
     */
    public void SetColor(int r, int g, int b,int a){
        Color newColor = new Color(r, g, b, a);
        R = r;
        G = g;
        B = b;
        A = a;
        
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, newColor, new Ellipse2D.Double(xPosition, yPosition, 
                                                          diameter, diameter));
            canvas.wait(10);
        }
        
    }
    public Circle()
    {
        diameter = 30;
        xPosition = 20;
        yPosition = 60;
        color = "blue";
        isVisible = true;
    }
    
    public void SetPositionY(int translate) {
        yPosition = translate;
        draw();
    }
     public void SetPositionX(int translate) {
        xPosition = translate;
        draw();
    }
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the circle a few pixels to the right.
     */
    public void moveRight(int translate)
    {
        moveHorizontal(translate);
    }

    /**
     * Move the circle a few pixels to the left.
     */
    public void moveLeft(int translate)
    {
        moveHorizontal(-translate);
    }

    /**
     * Move the circle a few pixels up.
     */
    public void moveUp(int translate)
    {
        moveVertical(-translate);
    }

    /**
     * Move the circle a few pixels down.
     */
    public void moveDown(int translate)
    {
        moveVertical(translate);
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newDiameter)
    {
        erase();
        diameter = newDiameter;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the circle with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, new Color(R,G,B, A), new Ellipse2D.Double(xPosition, yPosition, 
                                                          diameter, diameter));
        }
    }

    /**
     * Erase the circle on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}

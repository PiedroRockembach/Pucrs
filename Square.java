import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Square
{
    private int xSize;
    private int ySize;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    public int R = 0;
    public int G = 0;
    public int B = 0;
    public int A = 0;
    

    /**
     * Create a new square at default position with default color.
     */
    public Square()
    {
        xSize = 30;
        ySize = 30;
        xPosition = 60;
        yPosition = 50;
        color = "red";
        isVisible = true;
    }
    
     public void SetColor(int r, int g, int b,int a)
    {
        Color newColor = new Color(r, g, b, a);
        R = r;
        G = g;
        B = b;
        A = a;
        
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, new Color(R,G, B, A),
                        new Rectangle(xPosition, yPosition, xSize, ySize));
            canvas.wait(10);
        }
        
    }
    public void SetPosition(int x, int y) {
        xPosition = x;
        yPosition = y;
    }
    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the square a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the square a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the square a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the square a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the square horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the square vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the square horizontally by 'distance' pixels.
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
     * Slowly move the square vertically by 'distance' pixels.
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
    public void ChangeSize(int x, int y)
    {
        erase();
        xSize = x;
        ySize = y;
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
     * Draw the square with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, new Color(R,G, B, A),
                        new Rectangle(xPosition, yPosition, xSize, ySize));
        }
    }

    /**
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}

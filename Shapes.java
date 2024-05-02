
/**
 * Escreva uma descriï¿½ï¿½o da classe Controlador aqui.
 * 
 * @author (seu nome) 
 * @version (um nï¿½mero da versï¿½o ou uma data)
 */
import java.lang.Thread;
public class Controlador
{
    public static void main(  String args[]  ) {
        Square sky = new Square();
        sky.SetPosition(0, 0);
        sky.SetColor(38,133, 196, 255);
        sky.ChangeSize(300,300);
        
        Circle moon = new Circle();
        moon.SetPositionX(130);
        moon.SetPositionY(50);
        moon.changeSize(40);
        moon.SetColor(240,240,240,0);
        
        Circle moonShadow = new Circle();
        moonShadow.SetPositionX(140);
        moonShadow.SetPositionY(70);
        moonShadow.changeSize(15);
        moonShadow.SetColor(200,200,200,0);
        
        Circle moonShadow2 = new Circle();
        moonShadow2.SetPositionX(155);
        moonShadow2.SetPositionY(60);
        moonShadow2.changeSize(10);
        moonShadow2.SetColor(200,200,200,0);
        
        
        Circle star1 = new Circle();
        star1.SetPositionX(5);
        star1.SetPositionY(20);
        star1.changeSize(5);
        star1.SetColor(255,255,255,0);
        
        Circle star2 = new Circle();
        star2.SetPositionX(200);
        star2.SetPositionY(45);
        star2.changeSize(5);
        star2.SetColor(255,255,255,0);
        
        Circle star3 = new Circle();
        star3.SetPositionX(105);
        star3.SetPositionY(70);
        star3.changeSize(5);
        star3.SetColor(255,255,255,0);
        
        Circle star4 = new Circle();
        star4.SetPositionX(250);
        star4.SetPositionY(90);
        star4.changeSize(5);
        star4.SetColor(255,255,255,0);
        
        Circle star5 = new Circle();
        star5.SetPositionX(40);
        star5.SetPositionY(105);
        star5.changeSize(5);
        star5.SetColor(255,255,255,0);
        //water
        Square water = new Square();
        water.SetPosition(0, 150);
        water.SetColor(88,146, 203, 255);
        water.ChangeSize(300,150);
        
        
        //sun
        Circle sun = new Circle();
        sun.SetPositionX(125); 
        sun.changeSize(50);
        sun.SetColor(242,185,0,255);
        
        //reflex 
        
        Circle reflex = new Circle();
        reflex.SetPositionY(150);
        reflex.SetPositionX(125); 
        reflex.changeSize(50);
        reflex.SetColor(242,185,0,0);
        
        //ground
        Square ground = new Square();
        ground.SetPosition(0, 200);
        ground.SetColor(55,148, 48, 255);
        ground.ChangeSize(300,100);
        
        
        
        
        while(sun.yPosition < 160) {
            
            try{
                if(sun.yPosition >= 130) {
                    if (sky.R - 3 >= 5)sky.R -= 3;
                    if (sky.B - 3 >= 10)sky.B -= 3;
                    if (sky.G - 3 >= 10)sky.G -= 3;
                    
                    
                    sky.draw();
                    
                    if(sun.yPosition >= 147) {
                        reflex.SetColor(255,255,255,0);
                        reflex.SetPositionY(150);
                        reflex.SetPositionX(125); 
                        reflex.changeSize(50);
    
                        if(reflex.A + 15 <= 200) reflex.A += 15;
                        if(star1.A + 5 <= 255) star1.A += 5;
                        if(star2.A + 5 <= 255) star2.A += 5; 
                        if(star3.A + 5 <= 255) star3.A += 5; 
                        if(star4.A + 5 <= 255) star4.A += 5; 
                        if(star5.A + 5 <= 255) star5.A += 5; 
                        if(moon.A + 20 <= 255) moon.A += 20;
                        else{ moon.A = 255; } 
                        if(moonShadow.A + 20 <= 240) moonShadow.A += 20;
                        else{ moonShadow.A = 255; }
                        if(moonShadow2.A + 20 <= 240) moonShadow2.A += 20;
                        else{ moonShadow2.A = 255; }
                        moon.draw();
                        moonShadow.draw();
                        moonShadow2.draw();
                        star1.draw();
                        star2.draw();
                        star3.draw();
                        star4.draw();
                        star5.draw();
                        
                    ;
                    }
                    
                }
                sun.moveDown(1);
                if(sun.yPosition >= 90) {
                    if(sun.yPosition < 120) {
                        if(reflex.A + 2 <= 200)reflex.A += 2;
                        
                        reflex.moveUp(1);
                    } else {
                        if(reflex.A - 6 >= 0)reflex.A -= 6;
                        else {reflex.A = 0;}
                    }
                }                
                if(sun.yPosition >= 100){
                    if (ground.R - 5 >= 5)ground.R -= 5;
                    if (ground.B - 5 >= 10)ground.B -= 5;
                    if (ground.G - 2 >= 30)ground.G -= 2;
                    
                    if (water.R - 1 >= 20)water.R -= 1;
                    if (water.B - 2 >= 60)water.B -= 2;
                    if (water.G - 2 >= 50)water.G -= 2;
                    
                    
                    
                    water.draw();
                    reflex.draw();
                    ground.draw();
                }
                
                Thread.sleep(80);
            }catch(InterruptedException e) {
                System.out.println(e);
            }
            
                
            
        }
        
    }
}

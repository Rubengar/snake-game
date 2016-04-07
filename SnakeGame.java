
/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    private Canvas lienzo;
    private Snake serpiente;
    private  static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;
    /**
     * Constructor for objects of class SnakeGame
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Serpiente",ANCHO_LIENZO,ALTO_LIENZO);
    }
    /**

     */
    public void drawSnake()
    {
      serpiente = new Snake(ANCHO_LIENZO,ALTO_LIENZO);
      lienzo.erase();
      serpiente.dibujar(lienzo); 
    }
}

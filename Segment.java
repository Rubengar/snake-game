import java.awt.Color;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    //posicion del segmento en el eje x
    private int posicionX;
    //posicion del segmento en el eje y
    private int posicionY;
    //direcio del segmento
    private int direccion;
    //color del segmento
    private Color color;
    //longitud del segmento
    public static final int LONGITUD_SEGMENTO = 4;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posicionX,int posicionY,int direccion,Color color)
    {
       this.posicionX = posicionX;
       this.posicionY = posicionY;
       this.direccion = direccion;
       this.color = color;
    }

    /**
     * Dibuja un segmento
     */
    public void dibujar(Canvas lienzo)
    {
        Pen pen = new Pen(posicionX, posicionY, lienzo);
        pen.setColor(color);
        pen.turnTo(direccion);
        pen.move(LONGITUD_SEGMENTO);
    }
    /**
     * Borra el segmento
     */
    public void borrar(Canvas lienzo)
    {
        Pen pen = new Pen(posicionX, posicionY ,lienzo);
        pen.setColor(lienzo.getBackgroundColor());
        pen.turnTo(direccion);
        pen.move(LONGITUD_SEGMENTO);
    }
    /**
     * Devuelve la posicion inicial en el eje x
     */
    public int getPosicionInicialX()
    {
        return posicionX;
    }
    /**
     * Devuelve la posicion inicial en el eje y
     */
    public int getPosicionInicialY()
    {
        return posicionY;
    }
    /**
     * Devuelve la posicion final en el eje x
     */
    public int getPosicionFinalX()
    {
       int posicion = posicionX;
       if (direccion == 0 )
       {
           posicion = posicionX + LONGITUD_SEGMENTO;
       }
       if (direccion == 180)
       {
           posicion = posicionX - LONGITUD_SEGMENTO;
       }
       return posicion;
    }
    /**
     * Devuelve la posicion final en el eje y
     */
    public int getPosicionFinalY()
    {
       int posicion = posicionY;
       if (direccion == 90 )
       {
           posicion = posicionY - LONGITUD_SEGMENTO;
       }
       if (direccion == 270)
       {
           posicion = posicionY + LONGITUD_SEGMENTO;
       }
       return posicion;
    }
    /**
     * Devuelve la dirección
     */
    public int getDireccion()
    {
        return direccion;
    }
    /**
     * Delvuelve verdadero si colisiona o falso en caso contrario
     */
    public boolean colisionaCon(Segment segmento)
    {
        return segmento.getPosicionFinalX() == posicionX && segmento.getPosicionFinalY() == posicionX;
    }
}

package connect4showwin;
import java.awt.*;

public class Piece {
    private Color color;
    private int value;
    Piece()
    {
        color = Color.white;
        value = 0;
    }
    
    Piece(Color _color)
    {
        color = _color;
        value = (int)(Math.random() * 5 + 1);

    }
    Color getColor()
    {
        return (color);
    }
    
    public int getValue()
    {
        return (value);
    }
    
}

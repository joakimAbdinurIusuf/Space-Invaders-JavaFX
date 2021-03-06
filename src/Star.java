
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * A star, serves as part of the background
 */
public class Star extends Sprite {
    Color color;

    /**
     * Constructor.
     * @param posX X-position.
     * @param posY Y-position.
     * @param height Height in y-axis.
     * @param width Width in x-axis.
     * @param velocity Speed.
     * @param color Star color.
     */
    public Star(int posX, double posY, int height, int width, double velocity, Color color) {
        super(posX, posY, height, width, velocity);
        this.color = color;
    }

    /**
     * Draw the star using current values, then update.
     * @param gc The canvas to draw on.
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(posX, posY, width, height);
        this.posY += velocity;
    }
}

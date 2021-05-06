import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * Enemies travelling towards the player.
 */
public class Enemy extends Rocket {
    boolean ableToShoot, boss;

    /**
     * Constructor.
     * @param posX X-position.
     * @param posY Y-position.
     * @param velocity Speed.
     * @param img Image.
     * @param health Health.
     * @param ableToShoot Is able to shoot or not.
     * @param boss Is boss or not.
     */
    public Enemy(double posX, double posY, double velocity, Image img, int health, boolean ableToShoot, boolean boss) {
        super(posX, posY, (int) img.getHeight(), (int) img.getWidth(), velocity, img, health);
        this.ableToShoot = ableToShoot;
    }

    /**
     * Draws the enemy onto the canvas.
     * @param gc The canvas.
     */
    public void draw(GraphicsContext gc) {
        if (exploding) {
            this.drawExplode(gc);
        } else {
            update();
            gc.drawImage(img, posX, posY);
        }
    }

    /**
     * Updates the Enemy.
     */
    public void update() {
        this.posY += velocity;
    }
}
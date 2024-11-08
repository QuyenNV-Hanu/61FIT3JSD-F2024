package tank90.model;

import java.awt.*;

/**
 * Created by ducnd on 24/10/2016.
 */
public class Item {
    Image img;
    int id;
    int x, y;
    int size;

    public Item(int id, int x, int y, int size) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.size = size;
        this.img = Images.getImage(this.id);
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(img,
                x, y,
                size, size,
                null);
    }
}

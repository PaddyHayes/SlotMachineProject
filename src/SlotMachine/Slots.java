package SlotMachine;

import javax.swing.*;

public class Slots {

    private String item;
    private ImageIcon image;

    public Slots (String item, ImageIcon image){
        setImage(image);
        setItem(item);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

}

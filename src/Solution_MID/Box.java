package Solution_MID;

public class Box {
    private int height,width,length;
    public Box(int height,int width,int length){
        this.height=height;
        this.length=length;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getVolume(){
        return length*width*height;
    }
}

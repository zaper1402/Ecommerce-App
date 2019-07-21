package ashir.myapplication;

public class OffersItemClass {
    private int image;
    private   String off,currentPrice,OrignalPrice,sold,ordered;


    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public OffersItemClass(int image, String off, String currentPrice, String orignalPrice, String sold, String ordered){
        this.image = image;
        this.off = off;
        this.currentPrice = currentPrice;
        this.OrignalPrice = orignalPrice;
        this.sold = sold;
        this.ordered = ordered;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getOrignalPrice() {
        return OrignalPrice;
    }

    public void setOrignalPrice(String orignalPrice) {
        OrignalPrice = orignalPrice;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public String getOrdered() {
        return ordered;
    }

    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }
}

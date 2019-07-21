package ashir.myapplication;

public class CartItemClass {

    private int image;
    private String title, currentPrice, OrignalPrice, Stock, deliveryCharge, count;

    public CartItemClass(int image, String title, String currentPrice, String orignalPrice, String stock, String deliveryCharge, String count) {
        this.image = image;
        this.title =title;
        this.currentPrice = currentPrice;
        this.OrignalPrice = orignalPrice;
        this.Stock = stock;
        this.deliveryCharge = deliveryCharge;
        this.count = count;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(String deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}


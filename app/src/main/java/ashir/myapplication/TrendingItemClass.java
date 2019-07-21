package ashir.myapplication;

import android.media.Image;

public class TrendingItemClass {
    private int image;
  private   String title;
  private   String detail;

    public TrendingItemClass(int image,String title, String detail){
        this.image =image ;
        this.title =title ;
        this.detail =detail ;

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

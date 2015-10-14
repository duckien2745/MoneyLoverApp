package soict.kien.com.moneylover.object;

public class CategoryObj {

    Integer icon;
    String categgoryName;

    public CategoryObj(Integer icon, String categgoryName) {
        this.icon = icon;
        this.categgoryName = categgoryName;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getCateggoryName() {
        return categgoryName;
    }

    public void setCateggoryName(String categgoryName) {
        this.categgoryName = categgoryName;
    }
}

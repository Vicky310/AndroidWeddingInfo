package start.SupportList;

/**
 * Created by user-- on 10-07-2015.
 */
public class ItemObject2 {

    private String name,name2;
    private int imageId,imageId1,imageId2;

    public ItemObject2(String name, String name2, int imageId, int imageId1, int imageId2) {
        this.name = name;
        this.name2= name2;
        this.imageId = imageId;
        this.imageId1 = imageId1;
        this.imageId2 = imageId2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId1() {
        return imageId1;
    }

    public void setImageId1(int imageId1) {
        this.imageId1 = imageId1;
    }

    public int getImageId2() {
        return imageId2;
    }

    public void setImageId2(int imageId2) {
        this.imageId2 = imageId2;
    }
}
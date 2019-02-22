

/**
 * 元素
 */
public class Item {

    private ItemType type;
    private String name;

    public Item(ItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public final void setType(ItemType type) {
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}

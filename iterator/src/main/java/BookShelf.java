

import java.util.ArrayList;
import java.util.List;

/**
 * 书架
 */
public class BookShelf {

    private List<Item> items;

    public BookShelf() {
        items = new ArrayList<>();
        items.add(new Item(ItemType.FICTION, "西游记"));
        items.add(new Item(ItemType.FICTION, "水浒传"));
        items.add(new Item(ItemType.FICTION, "三国演义"));
        items.add(new Item(ItemType.FICTION, "红楼梦"));
        items.add(new Item(ItemType.CARTOON, "阿衰"));
        items.add(new Item(ItemType.CARTOON, "七龙珠"));
        items.add(new Item(ItemType.CARTOON, "火影忍者"));
        items.add(new Item(ItemType.IT, "设计模式-可复用面向对象软件的基础"));
        items.add(new Item(ItemType.IT, "重构-改善既有代码的设计"));
        items.add(new Item(ItemType.IT, "Effective Java"));
        items.add(new Item(ItemType.IT, "Java编程思想"));
    }

    public List<Item> getItemList() {
        List<Item> list = new ArrayList<>();
        list.addAll(items);
        return list;
    }
}

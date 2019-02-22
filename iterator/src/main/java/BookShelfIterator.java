

import java.util.List;

/**
 * 图书的迭代器
 */
public class BookShelfIterator implements ItemIterator {

    private ItemType type;
    private BookShelf shelf;
    private int idx;

    public BookShelfIterator(ItemType type, BookShelf shelf) {
        this.type = type;
        this.shelf = shelf;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return -1 != getNexIdx();
    }

    @Override
    public Item next() {
        idx = getNexIdx();
        if (-1 != idx) {
            return shelf.getItemList().get(idx);
        }
        return null;
    }

    private int getNexIdx() {
        List<Item> list = shelf.getItemList();
        int tempIdx = idx;
        boolean found = false;
        while (!found) {
            tempIdx++;
            if (tempIdx >= list.size()) {
                tempIdx = -1;
                break;
            }
            if (list.get(tempIdx).getType().equals(type)) {
                break;
            }
        }
        return tempIdx;
    }
}

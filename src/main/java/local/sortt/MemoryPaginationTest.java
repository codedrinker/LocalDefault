package local.sortt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 11/18/16.
 */
public class MemoryPaginationTest {

    class Pagination {
        private List<String> items;
        private Integer nextPageToken;

        public List<String> getItems() {
            return items;
        }

        public void setItems(List<String> items) {
            this.items = items;
        }

        public Integer getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(int nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        @Override
        public String toString() {
            return "Pagination{" +
                    "items=" + items +
                    ", nextPageToken=" + nextPageToken +
                    '}';
        }
    }

    public static void main(String[] args) {
        MemoryPaginationTest memoryPaginationTest = new MemoryPaginationTest();
        int pagetoken = 0;
        int size = 3;

        while (memoryPaginationTest.showItems(pagetoken, size).getNextPageToken() != null) {
            pagetoken = memoryPaginationTest.showItems(pagetoken, size).getNextPageToken();
        }
    }

    private Pagination showItems(int page, int size) {
        Pagination itemsByPage = new MemoryPaginationTest().getItemsByPage(page, size);
        System.out.println(itemsByPage);
        return itemsByPage;
    }

    public Pagination getItemsByPage(int pageToken, int count) {
        List<String> items = new ArrayList<String>() {{
            add("1");
            add("2");
            add("3");
            add("4");
            add("5");
            add("6");
            add("7");
            add("8");
            add("9");
            add("10");
            add("11");
            add("12");
            add("13");
        }};

        if (items.size() <= pageToken + count) {
            Pagination pagination = new Pagination();
            pagination.setItems(items.subList(pageToken, items.size()));
            return pagination;
        } else {
            Pagination pagination = new Pagination();
            pagination.setItems(items.subList(pageToken, pageToken + count));
            pagination.setNextPageToken(pageToken + count);
            return pagination;
        }
    }

}

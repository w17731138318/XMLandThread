package cn.wja.dom4j;

import java.util.List;

/**
 * Created by wangweixin on 16/9/4.
 */
public class XMLPojo {
    private String root;
    private List<Book> books;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "XMLPojo{" +
                "root='" + root + '\'' +
                ", books=" + books +
                '}';
    }
}

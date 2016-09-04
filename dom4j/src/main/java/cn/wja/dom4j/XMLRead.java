package cn.wja.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangweixin on 16/9/4.
 */
public class XMLRead {
    public XMLPojo doReadXml(InputStream in) throws DocumentException {
        XMLPojo pojo = new XMLPojo();
        List<Book> books = new ArrayList<Book>();
        Book book = null;
        SAXReader reader= new SAXReader();
        Document doc = reader.read(in);
        Element e = doc.getRootElement();
        pojo.setRoot(e.getName());
        List<Element> list = e.elements();
        for (Element element:list) {
            if("book".equals(element.getName())){
                book=new Book();
                List<Element> bookparams = element.elements();
                for (Element param:bookparams) {
                    if ("name".equals(param.getName())){
                        book.setName(param.getText());
                    }else if ("author".equals(param.getName())){
                        book.setAuthor(param.getText());
                    }else if ("price".equals(param.getName())){
                        book.setPrice(Float.parseFloat(param.getText()));
                    }
                }
                books.add(book);
            }
            pojo.setBooks(books);
        }
        System.out.println(pojo);
        return pojo;
    }
}

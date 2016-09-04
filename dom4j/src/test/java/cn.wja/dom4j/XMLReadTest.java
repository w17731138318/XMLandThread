package cn.wja.dom4j;

import org.junit.Test;

import java.io.InputStream;

/**
 * Created by wangweixin on 16/9/4.
 */
public class XMLReadTest {

    @Test
    public void testDoReadXml() throws Exception {
       // this.getClass().getClassLoader().
        InputStream in = Object.class.getResourceAsStream("/Book.xml");
        XMLRead read = new XMLRead();
        read.doReadXml(in);
    }
}
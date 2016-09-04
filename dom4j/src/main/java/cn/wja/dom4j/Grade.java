package cn.wja.dom4j;

import java.util.List;

/**
 * Grade 年级
 */
public class Grade {
    /*
    年级名称:1年级,2年级...
     */
    private String gradeName;
    /*
    年级下属班级
     */
    private List<Clazz> clazzs;

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public List<Clazz> getClazzs() {
        return clazzs;
    }

    public void setClazzs(List<Clazz> clazzs) {
        this.clazzs = clazzs;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeName='" + gradeName + '\'' +
                ", clazzs=" + clazzs +
                '}';
    }
}

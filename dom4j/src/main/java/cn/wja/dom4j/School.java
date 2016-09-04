package cn.wja.dom4j;

import java.util.List;

/**
 * School 学校
 */
public class School {

    /*
    学校名称
     */
    private String schoolName;
    /*
    学校地址
     */
    private String address;
    /*
    校长
     */
    private HeadMaster headmaster;
    /*
    年级
     */
    private List<Grade> grades;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HeadMaster getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(HeadMaster headmaster) {
        this.headmaster = headmaster;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", headmaster=" + headmaster +
                ", grades=" + grades +
                '}';
    }
}

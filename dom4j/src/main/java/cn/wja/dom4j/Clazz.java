package cn.wja.dom4j;

import java.util.List;

/**
 * Clazz班级
 */
public class Clazz {
    /*
    班级名称:一班,二班...
     */
    private String clazzName;
    /*
    老师
     */
    private Teacher teacher;
    /*
    班级下属学生
     */
    private List<Student> students;

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzName='" + clazzName + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}

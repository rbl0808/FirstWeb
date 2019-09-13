package ZXD_2018_4_1;

import java.util.Date;

public class Person {
    private Integer code;
    private String name;
    private int age;
    private String sex;
    private Date birth;

    //Json Test
    public Person(String zhangSan, int i, String male) {
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

    //Excel
    public Person(String name, int age, String sex,Integer code,Date birth) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.code = code;
        this.birth = birth;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex +  "code=" + code
        + "birth=" + birth + "]";
    }

}

package app;

public class Member {
    private int id;
    private  String name;
    private int age;
    private String course;

    // コンストラクタ（オブジェクトを作るときに使う）
    public Member(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // getter（フィールドの値を取り出す）
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // setter（フィールドの値を変更する）
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString（オブジェクトを文字列として表示する）
    @Override
    public String toString() {
        return "ID=" + id + ", 名前=" + name + ", 年齢=" + age + ", コース=" + course;
    }
}

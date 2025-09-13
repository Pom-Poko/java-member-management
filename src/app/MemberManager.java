package app;

import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    private List<Member> members = new ArrayList<>(); // 会員のリストを保持
    private int nextId = 1; // 会員IDを自動採番するためのカウンタ

    // 会員追加（Create）
    public void addMember(String name, int age, String course) {
        Member m = new Member(nextId++, name, age, course);
        members.add(m);
        System.out.println("登録しました: " + m);
    }

    // 会員一覧表示（Read）
    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("会員はまだ登録されていません。");
        } else {
            for (Member m : members) {
                System.out.println(m);
            }
        }
    }

    // 会員更新（Update）
    public void updateMember(int id, String name, int age, String course) {
        for (Member m : members) {
            if (m.getId() == id) {
                m.setName(name);
                m.setAge(age);
                m.setCourse(course);
                System.out.println("更新しました：" + m);
                return;
            }
        }
        System.out.println("ID=" + id + "の会員が見つかりません。");
    }

    // 会員削除（Delete）
    public void deleteMember(int id) {
        boolean removed = members.removeIf(m -> m.getId() == id);
        if (removed) {
            System.out.println("削除しました (ID=" + id + ")");
        } else {
            System.out.println("ID=" + id + " の会員が見つかりません。");
        }
    }
}

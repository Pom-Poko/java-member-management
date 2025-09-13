package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== 会員管理システム ===");
            System.out.println("1. 会員登録");
            System.out.println("2. 会員一覧表示");
            System.out.println("3. 会員更新");
            System.out.println("4. 会員削除");
            System.out.println("5. 終了");
            System.out.print("選択してください: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("名前: ");
                    String name = sc.nextLine();
                    System.out.print("年齢: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("コース: ");
                    String course = sc.nextLine();
                    manager.addMember(name, age, course);
                    break;
                case 2:
                    manager.listMembers();
                    break;
                case 3:
                    System.out.print("更新する会員のID: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.print("新しい名前: ");
                    name = sc.nextLine();
                    System.out.print("新しい年齢: ");
                    age = Integer.parseInt(sc.nextLine());
                    System.out.print("新しいコース: ");
                    course = sc.nextLine();
                    manager.updateMember(updateId, name, age, course);
                    break;
                case 4:
                    System.out.print("削除する会員のID: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    manager.deleteMember(deleteId);
                    break;
                case 5:
                    running = false;
                    System.out.println("システムを終了します。");
                    break;
                default:
                    System.out.println("無効な選択です。1〜5を入力してください。");
            }
        }
        sc.close();
    }
}

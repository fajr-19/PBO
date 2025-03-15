import java.util.Scanner;

public class Player {
    private String nickname;
    private String skills;


    public Player() {
        this.nickname = inputNickname();
        this.skills = skillManager.choiceSkill();
    }

    public Player(String nickname) {
        this.nickname = nickname;
        this.skills = skillManager.choiceSkill();
    }

        private String inputNickname() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nickname: ");
        return scanner.nextLine();
    }

    public String getNickname(){
        return nickname;
    }

    public String getSkills(){
        return skills;
    }

    public void displayInfo() {
        System.out.println("Nickname: " + nickname);
        System.out.println("Skill: " + skills);
    }

}
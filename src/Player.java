import java.utilScanner;

public class Player {
    private String nickname;
    private String skills;


    public Player() {
        this.nickname = inputNickname();
        this.skills = choiceSkill();
    }

    public Player(String nickname) {
        this.nickname = nickname;
        this.skills = choiceSkill();
    }

    public Player(String skills) {
        this.nickname = nickname;
        this.skills = skills;
    }

    private String inputNickname() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nickname: ");
        return scanner.nextLine();
    }

    public string getNickname(){
        return nickname;
    }

    public string getSkills(){
        return skills;
    }

    public void displayInfo() {
        System.out.println("Nickname: " nickname);
        System.out.println("Skill: " skills);
    }

}
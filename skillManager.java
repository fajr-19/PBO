import java.util.Scanner;

public class skillManager {
    public static String choiceSkill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choise skill: ");
        System.out.println("1. Fighting"); 
        System.out.println("2. Magic"); 
        System.out.println("3. Resist"); 
        System.out.println("4. Misc"); 
        System.out.print("Enter choice (1-4): "); 

        int (choice) {
            case 1: return "Fighting"
            case 2: return "Magic"
            case 3: return "Resist"
            case 4: return "Misc"
            default: return "NPC"

        }
    }
}
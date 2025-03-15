public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Player 1 ===");
        Player p1 = new Player();
        p1.displayInfo();

        System.out.println("\n=== Player 2 ===");
        Player p2 = new Player();
        p2.displayInfo();
    }
}

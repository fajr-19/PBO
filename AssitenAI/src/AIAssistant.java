import java.util.Scanner;

public class AIAssistant {
    private TaskManager taskManager = new TaskManager();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Selamat datang! Saya asisten AI Anda.");
        boolean running = true;
        while (running) {
            System.out.println("\nMasukkan perintah (CREATE_TASK, VIEW_TASKS, EXIT):");
            try {
                Command command = Command.valueOf(scanner.nextLine().toUpperCase());
                switch (command) {
                    case CREATE_TASK:
                        createTask();
                        break;
                    case VIEW_TASKS:
                        viewTasks();
                        break;
                    case EXIT:
                        running = false;
                        System.out.println("Terima kasih telah menggunakan asisten AI!");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Perintah tidak dikenali. Silakan coba lagi.");
            }
        }
    }

    private void createTask() {
        System.out.println("Masukkan judul tugas:");
        String title = scanner.nextLine();
        System.out.println("Masukkan deskripsi tugas:");
        String description = scanner.nextLine();
        taskManager.addTask(new Task(title, description));
        System.out.println("Tugas berhasil dibuat!");
    }

    private void viewTasks() {
        if (taskManager.getAllTasks().isEmpty()) {
            System.out.println("Belum ada tugas.");
        } else {
            System.out.println("Daftar Tugas:");
            for (Task task : taskManager.getAllTasks()) {
                System.out.println("- " + task.getTitle());
            }
        }
    }
}

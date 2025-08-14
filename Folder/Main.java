import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaryManager diaryManager = new DiaryManager();

        while (true) {
            System.out.println("\n--- Personal Diary ---");
            System.out.println("1. Add Entry");
            System.out.println("2. View All Entries");
            System.out.println("3. Search Entry by Date");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Enter your diary entry: ");
                    String content = sc.nextLine();
                    diaryManager.addEntry(new DiaryEntry(date, content));
                    System.out.println("Entry added successfully!");
                    break;

                case 2:
                    diaryManager.viewEntries();
                    break;

                case 3:
                    System.out.print("Enter date to search (YYYY-MM-DD): ");
                    String searchDate = sc.nextLine();
                    diaryManager.searchEntry(searchDate);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

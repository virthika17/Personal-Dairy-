import java.util.ArrayList;
import java.util.List;

public class DiaryManager {
    private List<DiaryEntry> entries;

    public DiaryManager() {
        entries = new ArrayList<>();
    }

    public void addEntry(DiaryEntry entry) {
        entries.add(entry);
    }

    public void viewEntries() {
        if (entries.isEmpty()) {
            System.out.println("No diary entries found.");
            return;
        }
        System.out.println("\n--- All Diary Entries ---");
        for (DiaryEntry entry : entries) {
            System.out.println(entry);
        }
    }

    public void searchEntry(String date) {
        boolean found = false;
        for (DiaryEntry entry : entries) {
            if (entry.getDate().equals(date)) {
                System.out.println("Entry found: " + entry);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No entry found for the given date.");
        }
    }
}

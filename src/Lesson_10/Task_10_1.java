package Lesson_10;

enum Season {
    WINTER("Cold"),
    SPRING("Mild"),
    SUMMER("Hot"),
    AUTUMN("Cool");

    private String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void printInfo() {
        System.out.println("Name: " + name());
        System.out.println("Ordinal: " + ordinal());
        System.out.println("Description: " + getDescription());
    }
}

public class Task_10_1 {
    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;
        System.out.println("Current season: " + currentSeason);
        currentSeason.printInfo();
    }
}
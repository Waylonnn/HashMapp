import java.util.Collections;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> thirdQuarter = new HashMap<String, Integer>();
        thirdQuarter.put("AP Government", 89);
        thirdQuarter.put("AP PreCalculus", 82);
        thirdQuarter.put("German 2", 88);
        thirdQuarter.put("Physics", 80);

        Integer min = Collections.min(thirdQuarter.values());
        float sum = 0.0f;
        for (float f : thirdQuarter.values()) {
            sum += f;
        }
        double avg = sum / thirdQuarter.size();
        System.out.println("AP PreCalculus\t\t" + thirdQuarter.get("AP PreCalculus"));
        System.out.println("Ap Government\t\t" + thirdQuarter.get("German 2"));
        System.out.println("German 2\t\t\t" + thirdQuarter.get("Physics"));
        System.out.println("Physics\t\t\t\t" + thirdQuarter.size());
        System.out.print("\nLowest Grade\nSubject: " + "Physics" + "\nGrade: " + thirdQuarter.get("Physics"));
        System.out.print("\n" +
                "\nHighest Grade\nSubject: " + "AP Government" + "\nGrade: " + thirdQuarter.get("AP Government"));
        System.out.print("\n\nOverall Average: " + avg);
    }
}
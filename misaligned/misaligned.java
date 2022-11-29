import javafx.util.Pair;

public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.printf(getColorPairString(i * 5 + j, majorColors[i], minorColors[i]));
            }
        }
        return i * j;
    }

    static String getColorPairString(int index, String majorColor, String minorColor) {
        return String.format("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i])
    }

    public static void main(String[] args) { 
        // New method to print the pairs and return the printed result
        int result = printColorMap(colorPairs)
        assert(result == 25);
        assert(getColorPairString(1, "White", "Orange").split("|")[0].length() == etColorPairString(20, "Yellow", "Slate").split("|")[0].length());
        System.out.println("All is well (maybe!)");
    }
}

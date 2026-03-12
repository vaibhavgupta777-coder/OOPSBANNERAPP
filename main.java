public class Main {

    public static String[] getAPattern() {
        return new String[] {
            "   *** ",
            " **  **",
            "**   **",
            "**   **",
            "**   **",
            "**  ** ",
            "  ***  "
        };
    }

    public static String[] getBPattern() {
        return new String[] {
            "   *** ",
            " **  **",
            "**   **",
            "**   **",
            "**   **",
            "**  ** ",
            "  ***  "
        };
    }

    public static String[] getCPattern() {
        return new String[] {
            "  ***** ",
            "  **  **",
            "  **  **",
            "  ***** ",
            "  **    ",
            "  **    ",
            "  **    "
        };
    }

    public static String[] getDPattern() {
        return new String[] {
            "  ***** ",
            " **     ",
            " **     ",
            "  ***** ",
            "       **",
            "  **   **",
            "   ***** "
        };
    }

    public static void main(String[] args) {
        String aPattern [] = getAPattern();
        String cPattern[] = getCPattern();
        String bPattern[] = getBPattern();
        String dPattern[] = getDPattern();

        for (int i = 0; i < aPattern.length; i++) {
            System.out.println(aPattern[i] + " " + bPattern[i] + " " + cPattern[i] + " " + dPattern[i]);
        }
    }
}

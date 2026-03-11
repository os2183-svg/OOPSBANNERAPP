public class UC4 {

    public static void main(String[] args) {

        // String array to store all 7 lines of the OOPS banner
        String[] bannerLines = new String[7];

        // Populate each line using String.join()
        bannerLines[0] = String.join("", " *** ", "  ", " *** ", "  ", "***  ", "  ", " ****");
        bannerLines[1] = String.join("", "*   *", "  ", "*   *", "  ", "*   *", "  ", "*    ");
        bannerLines[2] = String.join("", "*   *", "  ", "*   *", "  ", "*   *", "  ", "*    ");
        bannerLines[3] = String.join("", "*   *", "  ", "*   *", "  ", "***  ", "  ", " *** ");
        bannerLines[4] = String.join("", "*   *", "  ", "*   *", "  ", "*    ", "  ", "    *");
        bannerLines[5] = String.join("", "*   *", "  ", "*   *", "  ", "*    ", "  ", "    *");
        bannerLines[6] = String.join("", " *** ", "  ", " *** ", "  ", "*    ", "  ", "***  ");

        // Use for-each loop to print each line of the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }

    }

}
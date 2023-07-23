public class SpaceOccurancePercentage2 {
    public static void main(String[] args) {
        String text = "sdvgdfg xcbvdfgd sdfsdfsd dgfsdgfsw vdsdfv zxcsdsdf" +
                "333" + "        gfgfgf vff vff ";
        int spaceCount = 0;
        int textTotalLength = text.length();

        for (int i = 0; i < textTotalLength; i++) {
            if (text.charAt(i) == ' ') {
                System.out.println("Space found at position " + i);
                spaceCount++;
            }
        }
        System.out.println("Space count is: " + spaceCount);
        double spacePercentage = (double) spaceCount / textTotalLength * 100;

        //show only 2 digits
        System.out.format("Percentage: %.2f", spacePercentage);
    }
}

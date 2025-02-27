package kyu5.java.task7;

// https://www.codewars.com/kata/513e08acc600c94f01000001
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        final int maxRGB = 255;
        final int minRGB = 0;
        final int hexadecimal = 16;

        final char[] hexList = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        final int[] rgbList = {r, g, b};

        StringBuilder rgb = new StringBuilder();

        for(int list : rgbList) {
            char tempValueFirst;
            char tempValueSecond;
            if (list < minRGB) {
                rgb.append("00");
            } else if (list > maxRGB) {
                rgb.append("FF");
            } else {
                tempValueFirst = hexList[list % hexadecimal];
                tempValueSecond = hexList[list / hexadecimal];
                String tempRgb = "" + tempValueSecond + tempValueFirst;
                rgb.append(tempRgb);
            }
        }

        return rgb.toString();
    }
}

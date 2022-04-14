package colorcoder;
public class ColorPair {
        private MajorColor majorColor;
        private MinorColor minorColor;
        
        public ColorPair(MajorColor major, MinorColor minor)
        {
            majorColor = major;
            minorColor = minor;
        }
        public MajorColor getMajor() {
            return majorColor;
        }
        public MinorColor getMinor() {
            return minorColor;
        }
        public static ColorPair GetColorFromPairNumber(int pairNumber) {
            int zeroBasedPairNumber = pairNumber - 1;
            MajorColor majorColor = 
                Color.fromIndex(MajorColor.class, zeroBasedPairNumber / MinorColor.values().length);
            MinorColor minorColor =
                Color.fromIndex(MinorColor.class, zeroBasedPairNumber % MinorColor.values().length);
            return new ColorPair(majorColor, minorColor);
        }
        public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
            return major.getIndex() * MinorColor.values().length + minor.getIndex() + 1;
        }
        String ToString() {
        	String colorPairStr = MajorColor.values()[majorColor.getIndex()].toString();
            colorPairStr += " ";
            colorPairStr += MinorColor.values()[minorColor.getIndex()].toString();
            return colorPairStr;
        }
    }

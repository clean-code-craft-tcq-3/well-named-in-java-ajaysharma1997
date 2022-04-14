package colorcoder;

public class Color {
	public static <E extends Enum<E>&IColor> E fromIndex(Class<E> color, int index) {
		for(E colorName: color.getEnumConstants()) {
            if(colorName.getIndex() == index) {
                return colorName;
            }
        }
        return null;
	}
}

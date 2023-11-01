package patterns;

public class PatternMain {

	public static void main(String[] args) {
		
		//pattern01
		//rectangular star pattern
		new Pattern01().pattern(6, "* ");
		
		//pattern02
		//right-angled triangle pattern
		new Pattern02().pattern(6, "* ");
		
		//pattern03
		//right-angled number pyramid pattern
		new Pattern03().pattern(6);
		
		//pattern04
		//right-angled number pyramid pattern - II
		new Pattern04().pattern(6);
		
		//pattern05
		//inverted right pyramid pattern
		new Pattern05().pattern(6, "* ");
		
		//pattern06
		//inverted numbered right pyramid pattern
		new Pattern06().pattern(6);
		
		//pattern07
		//star pyramid pattern
		new Pattern07().pattern(6, "*");
		
		//pattern08
		//inverted star pyramid pattern
		new Pattern08().pattern(6, "*");
		
		//pattern09
		//diamond star pattern
		new Pattern09().pattern(6, "*");
		
		//pattern10
		//half diamond star pattern
		new Pattern10().pattern(6, "*");
	}

}
 
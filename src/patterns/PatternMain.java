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
		
		//pattern11
		//binary number triangle pattern
		new Pattern11().pattern(6);
		
		//pattern12
		//number crown pattern
		new Pattern12().pattern(6);
		
		//pattern13
		//increasing number triangle pattern
		new Pattern13().pattern(6);
		
		//pattern14
		//increasing letter triangle pattern
		new Pattern14().pattern(6);
		
		//pattern15
		//reverse letter triangle pattern
		new Pattern15().pattern(6);
		
		//pattern16
		//alpha-ramp pattern
		new Pattern16().pattern(6);
		
		//pattern17
		//alpha-hill pattern
		new Pattern17().pattern(6);
		
		//pattern18
		//alpha-triangle pattern
		new Pattern18().pattern(5);
		
		//pattern19
		//symmetric-void pattern
		new Pattern19().pattern(6);
		
		//pattern20
		//symmetric-butterfly pattern
		new Pattern20().pattern(6);
		
		//pattern21
		//hollow rectangle pattern
		new Pattern21().pattern(6);
		
		//pattern22
		//number pattern
		new Pattern22().pattern(6);
		
	}

}
 
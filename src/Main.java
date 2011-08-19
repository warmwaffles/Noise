import riven.PerlinNoise;

/**
 * Just testing out the noise generators
 * 
 * @author Matthew A. Johnston (WarmWaffles)
 *
 */
public class Main {
	public static void main(String args[]) {
		PerlinNoise p = new PerlinNoise(254);
		for(float y = 0; y< 2; y += .01) {
			for(float x = 0; x<2; x += .01)
				System.out.print(p.noise(x, y, 0) + "\t");
			System.out.println();
		}
	}
}

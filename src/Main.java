import riven.PerlinNoise;


public class Main {
	public static void main(String args[]) {
		PerlinNoise p = new PerlinNoise(254);
		for(float y = -1; y< 1; y += .01) {
			for(float x = -1; x<1; x += .01) {
				System.out.print(p.noise(x, y, 0) + "\t");
			}
			System.out.println();
		}
	}
}

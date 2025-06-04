package Practice;

import java.util.HashSet;
import java.util.Set;

// Nexthink Interview
public class Point {
		
		private int x;
		private int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public static void main(String[] args) {
			Point p1 = new Point(5 ,2);
			Point p2 = new Point(5 ,2);
			Point p3 = new Point(5 ,2);
			Set<Point> set = new HashSet<>();
			set.add(p1);
			set.add(p2);
			set.add(p3);
			System.out.println(set.size());
		}
}

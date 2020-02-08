package chap09;

public class MyPoint {
	int x,y;
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Object obj) {
		MyPoint m = null;
		if(obj instanceof MyPoint) {
			m = (MyPoint)obj;
		}
		return this.x==m.x && this.y==m.y;
	}

	@Override
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}



	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		
		System.out.println(p);
		
		if(p.equals(q)) {
			System.out.println("같은 점");
		}else {
			System.out.println("다른 점");
		}

	}

}


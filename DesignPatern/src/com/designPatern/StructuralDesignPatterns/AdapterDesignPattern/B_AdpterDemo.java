package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class B_Point {

	int x, y;

	public B_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "B_Ponit [x=" + x + ", y=" + y + "]";
	}
}

class Line {
	B_Point start, end;

	public Line(B_Point start, B_Point end) {
		this.start = start;
		this.end = end;
	}
}

class VectorObject extends ArrayList<Line> {
}

class VectorRectangle extends VectorObject {

	public VectorRectangle(int x, int y, int witdh, int height) {
		add(new Line(new B_Point(x, y), new B_Point(x + witdh, y)));
		add(new Line(new B_Point(x + witdh, y), new B_Point(x + witdh, y + height)));
		add(new Line(new B_Point(x, y), new B_Point(x, y + height)));
		add(new Line(new B_Point(x, y + height), new B_Point(x + witdh, y + height)));
	}
}

class LineToPointAdapter extends ArrayList<B_Point> {
	private static int count = 0;

	public LineToPointAdapter(Line line) {
		System.out.println(String.format("%d: Generating points for line [%d,%d]-[%d,%d] (no caching)", ++count,
				line.start.x, line.start.y, line.end.x, line.end.y));

		int left = Math.min(line.start.x, line.end.x);
		int right = Math.max(line.start.x, line.end.x);
		int top = Math.min(line.start.y, line.end.y);
		int bottom = Math.max(line.start.y, line.end.y);
		int dx = right - left;
		int dy = line.end.y - line.start.y;

		if (dx == 0) {
			for (int y = top; y <= bottom; ++y) {
				add(new B_Point(left, y));
			}
		} else if (dy == 0) {
			for (int x = left; x <= right; ++x) {
				add(new B_Point(x, top));
			}
		}
	}
}

public class B_AdpterDemo {

	private static final List<VectorObject> vectorObjects = new ArrayList<>(
			Arrays.asList(new VectorRectangle(1, 1, 10, 10), new VectorRectangle(3, 3, 6, 6)));

	public static void drawPoint(B_Point p) {
		System.out.print(".");
	}

	private static void draw() {
		for (VectorObject vo : vectorObjects) {
			for (Line line : vo) {
				LineToPointAdapter adapter = new LineToPointAdapter(line);
				adapter.forEach(B_AdpterDemo::drawPoint);
			}
		}
	}

	public static void main(String[] args) {
		draw();
		draw();
	}
}

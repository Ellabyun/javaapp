package classTest;

//static final: �������� ����ϴ� ���

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURACE_AREA;
	
	static {
		EARTH_SURACE_AREA = 4*EARTH_RADIUS*EARTH_RADIUS*Math.PI;
	}

}

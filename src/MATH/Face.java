package MATH;

public class Face {
	private Segment s1, s2, s3;
	
	public Face(Segment s1, Segment s2, Segment s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public Segment getS1() {
		return s1;
	}

	public Segment getS2() {
		return s2;
	}

	public Segment getS3() {
		return s3;
	}

	public Segment[] getSegment(){
		Segment[] tab = {s1, s2, s3};
		return tab;
	}
}

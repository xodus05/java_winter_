package Test.access3;

public class RunAccessSample {

	public static void main(String[] args) {
		AccessSample a1 = new AccessSample();
		a1.n1 = 100;
		a1.setN2(88);

		System.out.printf("a1�� �����ϴ� AccessSample ��ü�� n1 �ʵ� : %d\n", a1.n1);
		System.out.printf("a1�� �����ϴ� AccessSample ��ü�� n2 �ʵ� : %d", a1.getN2());

	}

}

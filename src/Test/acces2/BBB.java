package Test.acces2;

import Test.access1.AccessBase;

public class BBB {
	
	public void test() {
		AccessBase ab = new AccessBase();
//		System.out.println("n1(private) = " + ab.n1); //private �ʵ�� �ٸ� ��Ű������ ���� �Ұ���
		System.out.println("n2(public) = " + ab.n2); //public �ʵ�� �ٸ� ��Ű������ ���� ����
//		System.out.println("n3(protected) = " + ab.n3); //protected �ʵ�� �ٸ� ��Ű������ ���� �Ұ���
//		System.out.println("n4(default) = " + ab.n4); //default �ʵ�� �ٸ� ��Ű������ ���� �Ұ���
	}
}

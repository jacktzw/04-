package exercise;
/**
 * 
 * @author Ϳ־��
 * javaEE-2005�� day04 ��ҵ
 *
 */
public class Test01 {
	 public static void main(String[] args) {
//		 1�������������ͱ����������Ǹ�ֵ��������������ͱ�������ǰ���������ĺ͸�ֵ���������������������ֵ��
		 int a=10,b=30,sum;
		 sum=a+b;
		 System.out.println("������������ֵΪ:"+sum);
//		 2��ʹ��˫���ȸ�����(double)����������Ʒ�ļ۸񣬸�������ֵ��Ȼ���������ֵ��		 
		 double price=6.5;
		 System.out.println("��Ʒ�ļ۸�Ϊ:"+price+"Ԫ");
//		 3��ʹ�ñ���������Ϸ��ɫ�Ĺ�����(float)��Ѫ��(short)������(byte)����Ϣ���������
		 float atk=300.0f;
		 short blood=100;
		 byte grade=10;
		 System.out.println("��ɫ�Ĺ�����Ϊ:"+atk+"��\tѪ��Ϊ:"+blood+"\t����Ϊ:"+grade+"��");
		/*
		 * 4������������������������������ֵ�������
		 *
		 * ��ʾ����������������
		 * ���� �� �� ƿ�ӽ��н���
		 * 1���ÿ�ƿ�������ѽ��͵����ƿ
		 * 2���Ѵ׵��뽴��ƿ
		 * 3���ѿ�ƿ��Ľ��͵����ƿ
		 */
        int aa=3,bb=5;
        int cc=bb;
        bb=aa;
        aa=cc;
        System.out.println("aa: "+aa+"bb: "+bb);
        
	}

}

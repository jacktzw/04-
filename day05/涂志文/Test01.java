package exercise;
/**
 * 
 * @author 涂志文
 * javaEE-2005期 day04 作业
 *
 */
public class Test01 {
	 public static void main(String[] args) {
//		 1、定义两个整型变量并给它们赋值，定义第三个整型变量，将前两个变量的和赋值给它，输出第三个变量的值。
		 int a=10,b=30,sum;
		 sum=a+b;
		 System.out.println("第三个变量的值为:"+sum);
//		 2、使用双精度浮点型(double)变量保存商品的价格，给变量赋值，然后输出变量值。		 
		 double price=6.5;
		 System.out.println("商品的价格为:"+price+"元");
//		 3、使用变量保存游戏角色的攻击力(float)、血量(short)、级别(byte)等信息，并输出。
		 float atk=300.0f;
		 short blood=100;
		 byte grade=10;
		 System.out.println("角色的攻击力为:"+atk+"点\t血量为:"+blood+"\t级别为:"+grade+"级");
		/*
		 * 4、定义两个变量，交换两个变量的值并输出。
		 *
		 * 提示：借助第三个变量
		 * 酱油 和 醋 瓶子进行交换
		 * 1）拿空瓶子来，把酱油导入空瓶
		 * 2）把醋导入酱油瓶
		 * 3）把空瓶里的酱油导入醋瓶
		 */
        int aa=3,bb=5;
        int cc=bb;
        bb=aa;
        aa=cc;
        System.out.println("aa: "+aa+"bb: "+bb);
        
	}

}

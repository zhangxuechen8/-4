# -4 实验四

## 实验目的
+ 1.通过设计学生管理接口和教师管理接口来掌握java中接口的定义及实现方法
+ 2.掌握抽象类

## 实验过程
+ 1.创建java新项目
+ 2.编写graduate、studentmanageinterface、teachermanagerinterface和test四个类
+ 3.编写graduate里的语句：构造博士研究生的姓名、性别、年龄、每学期学费和月工资并输入赋值语句和返回语句
+ 4.编写studentmanageinterface、teachermanagerinterface
```
package StudentMageInterface;

public interface StudentMageInterface {
	
		public void setFee(int f); //设置学生每学期的学费
		public int getFee(); //获取学生每学期的学费

}
```
教师接口同理
+ 5.编写test语句，通过main方法的参数args一次性赋值，计算博士研究生按照国家标准是否需要交纳税金，每年需要交纳多少税额
+ 6.运行程序

## 核心代码
```
public static void main(String[] args)   {    
		 Graduate g1=new Graduate("张三","男",35);
		 g1.setFee(8000);
		 g1.setPay(800);
		 if((g1.getFee()-g1.getPay())<=5000)     
			 System.out.println("无需纳税");    
		 else     
			 System.out.println("张三每年应缴纳税额："+((g1.getFee()-g1.getPay())-5000)*0.03*12); 
       }
      
 ```
  ## 实验感想
  + 1.掌握java抽象类和抽象方法的定义
  + 2.掌握java接口定义及实现方法

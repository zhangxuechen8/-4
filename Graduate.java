import StudentMageInterface.StudentMageInterface;
import TeacherManageInterface.TeacherManageInterface;


public class Graduate implements StudentMageInterface,TeacherManageInterface{
	private String name; //姓名
	 private String sex;//性别
	 private int age;
	 private int fee;//每学期学费
	 private int pay;//月工资
	 Graduate(String n,String s,int a)  {     
		 this.name=n;    
		 this.sex=s;  
		 this.age=a;
		 }
	 public void setFee(int f)     {     
		 fee=f;   
		 }    
	 public int getFee()  {      
		 return fee;  
		 }   
	 public void setPay(int p)  {    
		 pay=p;  
		 }     
	 public int getPay()  {     
		 return pay;  
		 }
	 public static void main(String[] args)   {    
		 Graduate g1=new Graduate("zhangsan","男",35);
		 g1.setFee(8000);
		 g1.setPay(800);
		 if((g1.getFee()-g1.getPay())<=5000)     
			 System.out.println("无需纳税");    
		 else     
			 System.out.println(((g1.getFee()-g1.getPay())-5000)*12);   
		 }  
	 }
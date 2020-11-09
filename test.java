
public class test {
	public static void main(String[] args)   {    
		 Graduate g1=new Graduate("张三","男",35);
		 g1.setFee(8000);
		 g1.setPay(800);
		 if((g1.getFee()-g1.getPay())<=5000)     
			 System.out.println("无需纳税");    
		 else     
			 System.out.println("张三每年应缴纳税额："+((g1.getFee()-g1.getPay())-5000)*0.03*12);   
		   


Graduate g2=new Graduate("李三","男",36);
g2.setFee(9000);
g2.setPay(800);
if((g2.getFee()-g2.getPay())<=5000)     
	 System.out.println("无需纳税");    
else     
	 System.out.println("李三每年应缴纳税额："+((g2.getFee()-g2.getPay())-5000)*0.03*12);   
}  
}


public class test {
	public static void main(String[] args)   {    
		 Graduate g1=new Graduate("����","��",35);
		 g1.setFee(8000);
		 g1.setPay(800);
		 if((g1.getFee()-g1.getPay())<=5000)     
			 System.out.println("������˰");    
		 else     
			 System.out.println("����ÿ��Ӧ����˰�"+((g1.getFee()-g1.getPay())-5000)*0.03*12);   
		   


Graduate g2=new Graduate("����","��",36);
g2.setFee(9000);
g2.setPay(800);
if((g2.getFee()-g2.getPay())<=5000)     
	 System.out.println("������˰");    
else     
	 System.out.println("����ÿ��Ӧ����˰�"+((g2.getFee()-g2.getPay())-5000)*0.03*12);   
}  
}

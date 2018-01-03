package nei;


public class textgou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gou a=new gou();
       a.show( );
       a.setName("姓名：旺财");
       a.setAge(3);
       a.setKind("品种：中华田园犬");
       
       System.out.println(a.getName());
       System.out.println(a.getAge());
       System.out.println(a.getKind());

      a.shout();
       a.sleep();  
       gou.eat();
       a.show();
   
	}

}

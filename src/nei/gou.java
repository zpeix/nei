package nei;

public class gou {
     private String name;
     private int  age;
     private String kind;
     
     public gou(){
	 }
	 public gou(String name){
		 this.name=name;
	 }
	 public gou(String name,int age,String kind){
		 this.name=name;
		 this.age=age;
		 this.kind=kind;
	 }
	  public String getName(){
		 return name;
	 }
	 public void setName(String name){
		 this.name=name;
	 }
	 public int getAge(){
		 return age;
	 }
	 public void setAge( int  age){
		 this.age=age;
	 }
	 public String getKind(){
		 return kind;
	 }
	 public void setKind(String kind){
		 this.kind=kind;
	 }
	 public void shout(){
			System.out.println("��У�������");
		}
	 public void sleep(){
			System.out.println("˯����������");
		}
	public static void eat(){
		System.out.println("�Է����й�ͷ");
	}
	public void show(){
		System.out.println("����:"+this.name+" ����:"+this.age+" Ʒ��:"+this.kind);
	}
}

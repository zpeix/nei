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
			System.out.println("´ó½Ğ£ºÍôÍôÍô");
		}
	 public void sleep(){
			System.out.println("Ë¯¾õ£ººôºôºô");
		}
	public static void eat(){
		System.out.println("³Ô·¹£º¿Ğ¹ÇÍ·");
	}
	public void show(){
		System.out.println("ĞÕÃû:"+this.name+" ÄêÁä:"+this.age+" Æ·ÖÖ:"+this.kind);
	}
}

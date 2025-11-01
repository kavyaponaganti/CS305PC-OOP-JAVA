enum Fruits{
	Apple,Banana,Citrus,DragonFruit,Fig,Grapes
}
public class EnumEx1{
	public static void main(String...args){
		for(Fruits f: Fruits.values()){
			System.out.println(f);
		}
	}
}				
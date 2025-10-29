enum Fruits{
        private char a;
        Apple('a'),Banana('b'),Citrus('c'),DragonFruit('d'),Fig('f'),Grapes('g');
        Fruits(char a){
                this.a = a;
        }
        public void get(){
        }
}                
public class EnumEx{
       public static void main(String...args){
         	 for(Fruits f: Fruits.values()){
         	      System.out.println(f);
         	      }
         	}
}         	              	

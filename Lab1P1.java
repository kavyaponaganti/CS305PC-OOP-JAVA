class Lab1P1{
	public static void main(String...args){
		byte b = 15; 
		Byte bb=b;      //Autoboking
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(bb.MIN_VALUE);
		System.out.println(bb.SIZE);
		System.out.println(bb.TYPE);
		System.out.println(bb.BYTES);
		
		System.out.println("--------INTEGER-------");
		int x=200;
		Integer it=x;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(it.MIN_VALUE);
		System.out.println(it.SIZE);
		System.out.println(it.TYPE);
		//System.out.println(it.INTEGERS);
		
		System.out.println("--------SHORT-------");
		short d=2;
		Short ss=d;
		System.out.println(Short.MAX_VALUE);
		System.out.println(ss.MIN_VALUE);
		System.out.println(ss.SIZE);
		System.out.println(ss.TYPE);
		//System.out.println(ss.SHORTS);
		
		System.out.println("--------LONG-------");
		long c=20;
		Long ll=c;
		System.out.println(Long.MAX_VALUE);
		System.out.println(ll.MIN_VALUE);
		System.out.println(ll.SIZE);
		System.out.println(ll.TYPE);
		//System.out.println(ll.LONGS);
		
		System.out.println("--------FLOAT-------");
		float e=2;
		Float ff=e;
		System.out.println(Float.MAX_VALUE);
		System.out.println(ff.MIN_VALUE);
		System.out.println(ff.SIZE);
		System.out.println(ff.TYPE);
		//System.out.println(ff.FLOATS);
		
		System.out.println("--------DOUBLE-------");
		double a=200.0000;
		Double dd=a;
		System.out.println(Double.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(dd.SIZE);
		System.out.println(dd.TYPE);
		//System.out.println(dd.DOUBLES);
		
		System.out.println("--------BOOLEAN-------");
		boolean f=0;
		Boolean bol=f;
		System.out.println(Boolean.MAX_VALUE);
		System.out.println(bol.MIN_VALUE);
		System.out.println(bol.SIZE);
		System.out.println(bol.TYPE);
		//System.out.println(bol.INTEGERS);
	}
}
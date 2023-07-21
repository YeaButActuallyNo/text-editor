
public class Something {
	public static void main(String[] args) {
		new TextEditor();
		
		Test bob = new Test();
		System.out.println("division " + bob.wow(2));
		System.out.println("modulus " + bob.killMe(2));
		System.out.println("fun " + bob.fun(2));
	}

}

class Test{
	public int wow(int a) {
		 return a/5;
	}
	public int killMe(int a) {
		return a%5;
	}
	public int fun(int x)
	{
	   if(x < 1)
	      return 1;
	   else
	      return x + fun(x - 1);
	}

}
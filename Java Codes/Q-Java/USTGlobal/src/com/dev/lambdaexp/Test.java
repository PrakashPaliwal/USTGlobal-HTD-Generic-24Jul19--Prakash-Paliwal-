package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {

			FuncInt f = () -> {
				for (int i=0; i<=10; i++) {
					System.out.println("i = "+i);			//multiple line code
				}
			};
			
			
			FunctInt2 f2 = (int i) -> System.out.println("Hello "+i);		// we can also have single line of code without { }
																			// we can have arguments as well
			
			FuncInter3 f3 = () -> {									// we can also the exceptions ie., try catch...
				try {
					int j = 10/0;
					System.out.println("j = "+j);
				}catch(Exception e){
					System.out.println("Exception Accured");
				}
				
			};
			
			
			f.printVal();
			f2.printHello(5);
			f3.try$catch();
	}
}

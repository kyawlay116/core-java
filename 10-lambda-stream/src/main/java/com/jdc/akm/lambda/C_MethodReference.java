package com.jdc.akm.lambda;

public class C_MethodReference {
	
	
	
	public static void main(String[] args) {
		useLambda();
		System.out.println();
		useMethodReference();
		
	}
	
	public static void useMethodReference() {
		FunctionalOne one = FunctionalReference :: useStatic;
		one.withoutReturn("one ref");
		
		FunctionalTwo two = new FunctionalReference("20") :: useInstance;
		System.out.println(two.withReturn("two ref"));
		
		FunctionalThree three = FunctionalReference :: new;
		three.withoutReturn("30");
		
//		sayHello instance method is in current class.
//		FunctionalFour four = FunctionalReference :: sayHello;
//		four.withoutReturn("10");
	}
	
	static void useLambda(){
		FunctionalOne one = s -> System.out.println(s);
		one.withoutReturn("Functional One.");
		
		FunctionalTwo two = s -> s+" Two";
		System.out.println(two.withReturn("Functional"));
		
		FunctionalThree three = a -> System.out.println("Functional Three.");
		three.withoutReturn("40");
		
	}
}

@FunctionalInterface
interface FunctionalOne{
	void withoutReturn(String message);
}

@FunctionalInterface
interface FunctionalTwo{
	String withReturn(String message);
}

@FunctionalInterface
interface FunctionalThree{
	void withoutReturn(String a);
}

@FunctionalInterface
interface FunctionalFour{
	void withoutReturn(String a);
}


class FunctionalReference{
	public FunctionalReference(String a) {
		System.out.println("Using Constructor !");
	}
	
	static void useStatic(String mess) {
		System.out.println("Using static method reference with ::"+mess);
	}
	
	String useInstance(String mess) {
		return "Using instance method with :: "+mess;
	}
	static void sayHello(){
		System.out.println("Using this Constructor");
	}
}
package com.jdc.akm;

import javax.naming.directory.AttributeInUseException;

public class E_MethodOverriding {
	
}

class Parent{
	ClassB getValue() throws Exception{
		return new ClassB();
	}
}

class Child extends Parent{
	
	@Override
	// child can use unchecked without any exception in parent
	// Child also can use sub type of exception when parent use exception
	ClassB getValue() throws AttributeInUseException{
		return (ClassB) new ClassA();
	}
}

class ClassA{}
class ClassB extends ClassA{}
class ClassC extends ClassB{}
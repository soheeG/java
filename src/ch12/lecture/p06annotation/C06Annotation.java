package ch12.lecture.p06annotation;

public class C06Annotation {

}

class MyClass06 {
	@MyAnnotaion06
	String field1;
	
	@MyAnnotaion06(myAttr = 10)
	int field2;
	
	@MyAnnotaion06
	boolean field3;
}

@interface MyAnnotaion06 {
	int myAttr() default 0;
	
}
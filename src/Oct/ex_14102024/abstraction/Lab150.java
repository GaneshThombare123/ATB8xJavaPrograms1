package Oct.ex_14102024.abstraction;

import java.util.SimpleTimeZone;

public class Lab150 {

}
interface I1{}
interface I2{}
class A{}
class B{}

class Test1 extends A{}// single inheritance
//class Test2 extends A,B{} // multiple inheritance-- never possible

class Test3 implements I1{}
class Test4 implements I1,I2{}// multiple inheritance possible by using interfaces
class Test5 extends A implements I1,I2{}
//class Test6  implements I1,extends A{}// extend keyword should be first(before the implementation)


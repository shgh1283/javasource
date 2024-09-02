<<<<<<< HEAD
package extendstest;

import javax.swing.Spring;

public class Child extends Parent {

    Spring name;

    void play() {
        System.out.println("놀자!!!");
    }

    @Override
    void print() {
        super.print(); // 가려지는 부모의 메소드 호출
        System.out.println("자식 메소드");
    }
}
=======
package extendstest;

import javax.swing.Spring;

public class Child extends Parent {

    Spring name;

    void play() {
        System.out.println("놀자!!!");
    }

    @Override
    void print() {
        super.print(); // 가려지는 부모의 메소드 호출
        System.out.println("자식 메소드");
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        //a.work();    //fail
        ((Cat)a).work();    //downcast
    }
}

interface Animal {
    void eat();
}

class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("猫：吃鱼");
    }

    public void work() {
        System.out.println("猫：捉老鼠");
    }
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("狗：吃骨头");
    }

    public void work() {
        System.out.println("狗：看家");
    }
}
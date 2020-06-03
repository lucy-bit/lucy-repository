class A {
    static {
        System.out.println("A.static {}");
    }

    static int i = initI();

    static int initI() {
        System.out.println("A.initI()");
        return 0;
    }

    A() {
        System.out.println("A()");
    }

    {
        System.out.println("A.{}");
    }
}

class B extends A {
    static {
        System.out.println("B.static {}");
    }

    static int i = initI();

    static int initI() {
        System.out.println("B.initI()");
        return 0;
    }

    B() {
        System.out.println("B()");
    }

    {
        System.out.println("B.{}");
    }
}

class Main extends B {
    public static void main(String[] args) throws Exception {
        System.out.println("start");
        new B();
        new B();
        System.out.println("end");

        while (true) {
            Thread.sleep(1000);
        }
    }
}
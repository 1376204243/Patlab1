package Default;

public class Test {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton01 = EagerSingleton.getinstance2();
        EagerSingleton eagerSingleton02 = EagerSingleton.getinstance2();
        if (eagerSingleton01 == eagerSingleton02) {
            System.out.println("eagerSingleton01 == eagerSingleton02,是同一个实例");
        } else {
            System.out.println("不是同一个实例");
        }
        LazySingleton lazySingleton01 = LazySingleton.getInstance();
        LazySingleton lazySingleton02 = LazySingleton.getInstance();
        if (lazySingleton01 == lazySingleton02) {
            System.out.println("lazySingleton01 == lazySingleton02,是同一个实例");
        } else {
            System.out.println("不是同一个实例");
        }
    }

}

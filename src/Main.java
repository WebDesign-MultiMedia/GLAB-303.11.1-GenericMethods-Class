//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n\"Generics Method\" \n");
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25);
        dObj.genericsMethod("Per Scholas");
        dObj.genericsMethod(2563.5);
        dObj.genericsMethod('H');
        System.out.println("\n");

        System.out.println("\n\"Two parameters in Generic Class\"\n");
        GMultipleDatatype<String, Integer> mObj = new GMultipleDatatype("Per Scholas", 11025);
        System.out.println(mObj.getvOne());
        System.out.println(mObj.getvTwo());

        GMultipleDatatype<String, String> mObj2 = new GMultipleDatatype<>("Per Scholas", "Non Profit");
        System.out.println(mObj2.getvOne());
        System.out.println(mObj2.getvTwo());
    }
}
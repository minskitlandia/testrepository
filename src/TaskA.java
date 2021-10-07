public class TaskA {

    public static void main(String[] args) {
        //System.out.println("Я Науменко Сергей");
        //System.out.println("Начинаю изучать Java");
        //method();
        String result = method2("Сергей", "Науменко", "Java");
        System.out.println(result);
//5^15−7^10∗cos⁡90+sin⁡25∗|〖−5〗^15 |
        System.out.println(Math.pow(5, 15) - Math.pow(7, 10)
                * Math.cos(90) + Math.sin(25) * Math.abs(Math.pow(-5, 15)));
    }

    static void method() {
        String name = "Сергей";
        String surname = "Науменко";
        String language = "Java";

        System.out.println("Я " + surname + " " + name);
        System.out.println("Начинаю изучать " + language);
    }

    static String method2(String name, String surname, String language) {
        return "Я " + surname + " " + name + "\nНачинаю изучать " + language;
    }
}

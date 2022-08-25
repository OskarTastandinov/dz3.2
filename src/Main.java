public class Main {
    public static void main(String[] args){
        // Задание 1

        var dog = 8f;
        var cat = 3.6F;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        /* Задание 2
        т.к. в первом задании переменные уже объявлены (с помощью типа var), их повторно не нужно объявлять */
        dog += 4;
        cat += 4F;
        papper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        // Задание 3

        dog -= 3.5F;
        cat -= 1.6F;
        papper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        // Задание 4

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        // Задание 5

        var frog = 3.5F;
        System.out.println(frog);
        frog *= 10F;
        System.out.println(frog);
        frog /= 3.5F;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        // Задание 6

        var boxer1 = 78.2F;
        var boxer2 = 82.7F;
        var summBoxers = boxer1 + boxer2;
        System.out.println(summBoxers);
        var difBoxer = Math.abs(boxer1 - boxer2);
        System.out.println(difBoxer);

        /* задание 7
         т.к. в шестом задании переменные уже объявлены (с помощью типа var), их повторно не нужно объявлять */
        var dif1 = boxer2 - boxer1; // dif1 - разница в весе (из большего меньшее)
        var dif2 = boxer2 % boxer1; // dif2 - разница в весе (остаток от деления)
        System.out.println(dif1);
        System.out.println(dif2);

        // Задание 8.1 (Условние 1)

        var manHours = 640;
        var manHourPerEmpl = 8;
        var totalEmpl = manHours / manHourPerEmpl;
        System.out.println("Всего работников в компании – " + totalEmpl + " человек");

        // Задание 8.2 (Условние 2)
        var addEmpl = 94;
        var allEmpl = totalEmpl + addEmpl;
        var NewManHoursPerEmpl = manHours / allEmpl;
        System.out.println("Если в компании работает " + allEmpl + " человек, то всего по " + NewManHoursPerEmpl + " часа работы может быть поделено между сотрудниками");

    }
}

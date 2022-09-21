public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //задача 2
        System.out.println("задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //задача 3
        System.out.println("задача 3");
        var dog1 = 8.0;
        dog1 -= 3.5;
        System.out.println(dog1);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        //задание 4
        System.out.println("задание 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //задание 5
        System.out.println("задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //задача 6
        System.out.println("задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("общий вес двух бойцов: " + (boxerWeight1 + boxerWeight2));
        System.out.println("разница весов двух бойцов: " + (boxerWeight2 - boxerWeight1));

        //задача 7
        System.out.println("задача 7");
        System.out.println("общий вес двух бойцов (1 способ): " + (boxerWeight2 - boxerWeight1));
        System.out.println("общий вес двух бойцов (2 способ): " + (boxerWeight2 % boxerWeight1));

        //задача 8
        System.out.println("задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours /hoursPerDay;
        System.out.println("Всего работников в компании - " + totalWorkingHours / hoursPerDay + "человек");

        totalEmployees += 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компаниии работает " + totalEmployees + "человек, то всего"  + totalWorkingHours + " часа работы может быть поделенно между сотрудниками");




    }
}
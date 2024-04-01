import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        var dog = 10.0;
        var cat = 20.0;
        var paper = 763789;
        System.out.println("Задание 1");
        System.out.println("кошка " + cat);
        System.out.println("собака " + dog);
        System.out.println("бумага " + paper);
        var a = 4;
        dog = dog + a;
        cat = cat + a;
        paper = paper + a;
        System.out.println("Задание 2");
        System.out.println("кошка +4 " + cat);
        System.out.println("собака +4" + dog);
        System.out.println("бумага +4" + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задание 3");
        System.out.println("у кошки отняли " + cat);
        System.out.println("у собаки отняли " + dog);
        System.out.println("из бумаги вычли " + paper);
        var friend = 19;
        System.out.println("Задание 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println("Задание 5");
        System.out.println("лягушка" + frog);
        frog = frog * 10;
        System.out.println("умножилии" + frog);
        frog = frog / 3.5;
        System.out.println("поделили" + frog);
        frog = frog + 4;
        System.out.println("добавили 4 " + frog);
        System.out.println("Задание 6");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var SUM = fighter2 + fighter1;
        var DIF = abs(fighter1 - fighter2);
        System.out.println("общая масса " + SUM + "кг");
        System.out.println("разница масс " + DIF + "кг");
        System.out.println("Задание 7");
        var div = fighter2 % fighter1;
        System.out.println("Остаток= " + div);
    }
    }



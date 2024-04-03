import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка:переменные Часть 1");
     var dog = 10f;
     var cat = 20f;
     var paper = 763789;
        System.out.println("Задание 1");
        System.out.println(" кошка " + cat);
        System.out.println(" собака " + dog);
        System.out.println(" бумага " + paper);
       var na = 4;
           dog += na;
           cat += na;
           paper +=na;
        System.out.println("Задание 2");
        System.out.println("кошка +4 " + cat);
        System.out.println("собака +4" + dog);
        System.out.println("бумага +4" + paper);
           dog -=3.5f;
           cat -=1.6f;
           paper -=7639;
        System.out.println("Задание 3");
        System.out.println("у кошки отняли " + cat);
        System.out.println("у собаки отняли " + dog);
        System.out.println("из бумаги вычли " + paper);
     var friend = 19f;
        System.out.println("Задание 4");
        System.out.println(friend);
           friend +=2;
        System.out.println(friend);
           friend /=7;
        System.out.println(friend);
     var frog = 3.5;
        System.out.println("Задание 5");
        System.out.println("лягушка" + frog);
           frog *=10;
        System.out.println("умножилии" + frog);
           frog /=3.5;
        System.out.println("поделили" + frog);
           frog +=4;
        System.out.println("добавили 4 " + frog);
        System.out.println("Задание 6");
     var fighter1 = 78.2;
     var fighter2 = 82.7;
     var sum = fighter2 + fighter1;
     var dif = abs(fighter1 - fighter2);
        System.out.println("общая масса " + sum + "кг");
        System.out.println("разница масс " + dif + "кг");
        System.out.println("Задание 7");
     var div = fighter2 % fighter1;
        System.out.println("Остаток, он же разница масс= " + div);
        System.out.println("Задание 8");
     var wholeTime=640;
     var personalTimeLimit=8;
     var personalNum=wholeTime/personalTimeLimit;
        System.out.println("Всего в компании работает "+personalNum+" человек, и на всех отведено "+wholeTime+" часов");
        personalNum=personalNum+94;
        System.out.println("Если в компании работает "+personalNum+" сотрудника,то "+(personalTimeLimit*personalNum)+" часов нужно выделить на вcех");
System.out.println("Домашка:переменные Часть 2");
        System.out.println(" ");
        System.out.println("   Задача 1");
            byte fist=124;
         System.out.println("Значение переменной с типом byte равно"+fist);
            short second=3013;
         System.out.println("Значение переменной с типом short равно"+second);
            int third=-2000128;
         System.out.println("Значение переменной с типом int равно"+third);
            long fourth=2_310_537_146_057L;
         System.out.println("Значение переменной с типом long равно"+fourth);
            float fifth=3.25f;
         System.out.println("Значение переменной с типом float равно"+fifth);
            double sixth=5.9412374124d;
         System.out.println("Значение переменной с типом byte равно"+sixth);
         System.out.println(" ");
System.out.println("   Задача 2");
            float a=27.12f;
            long b=987_678_965_549L;
            double c=2.786d;
 //вижу, что следующие две переменных проще инициализировать как short, так как их значения идеально попадают в этот тип
            short d=569;
            short e=-159;
// Хоть значение переменной f и попадает в диапазон short,но должен же этом зоопарке быть хоть один integer. Потому инициалирую как int
            int f=27897;
            byte g=67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("Итого, раскидаем по типам:");
            System.out.println(a+"    ,это - float");
            System.out.println(b+"    ,это - long");
            System.out.println(c+"    ,это - double");
            System.out.println(d+"    ,это - short");
            System.out.println(e+"    ,это - short");
            System.out.println(f+"    ,это - int");
            System.out.println(g+"    ,это - byte");
        System.out.println(" ");
System.out.println("   Задача 3");
 //ну не бывает в классе больше 127 учеников. Потому логично предположить, что кол-ва учеников обявляемкак byte
          byte lyudmilaPavlovnaStudents=23;
          byte annaSegreevnaStudents=27;
          byte ekaterinaAndreevnaStudents=30;
           int totalStudents=lyudmilaPavlovnaStudents+annaSegreevnaStudents+ekaterinaAndreevnaStudents;
         short wholeSheets=480;
                            System.out.println("Итого, на каждого ученика, приходится "
                            +(wholeSheets/totalStudents)+
                            " листов.");
        System.out.println(" ");
System.out.println("   Задача 4");
                 byte perfomance=16;
                  int perfomancePerMinute=perfomance/2;
                  int perfomancePerHour=perfomancePerMinute*60; //хотел объявить как short, но IDE ругается.
                  int perfomancePerDay=perfomancePerHour*24;
                     System.out.println("За 20 минут машина нашлёпает "+perfomancePerMinute*20+" бутылок.");
                     System.out.println("За сутки машина изваяет "+perfomancePerDay+" бутылок.");
                     System.out.println("За ТРИ дня это будет "+perfomancePerDay*3+" бутылок.");
                     System.out.println("За месяц непрерывной работы машина сделает "+perfomancePerDay*30+ " бутылок");
        System.out.println(" ");
System.out.println("   Задача 5");
                  byte totalTinsOfPaint=120;
                  byte whitePaintPerClass=2;
                  byte brownPaintPerClass=4;
                  int totalClasses=totalTinsOfPaint/(whitePaintPerClass+brownPaintPerClass);
                 int totalWhitePaintTins=whitePaintPerClass*totalClasses;
                 int totalBrownPaintTins=brownPaintPerClass*totalClasses;
                       System.out.println("В школе, где"+totalClasses+" классов, нужно "+totalBrownPaintTins+" банок коричневой краски и "
                       +totalWhitePaintTins+" банок белой краски.");

        System.out.println(" ");
        System.out.println("   Задача 6");
                  short bananaUnitWeightGramms=80;
                  float milkUnitWeightGrammsPerMl=105f/100f;
                  short iceCreamUnitWeightGramms=100;
                  short eggUnitWeightGramms=70;


                                    float recipe=5*bananaUnitWeightGramms+200*milkUnitWeightGrammsPerMl+2*iceCreamUnitWeightGramms+4*eggUnitWeightGramms;
                                             System.out.println("Весь завтрак весит"+recipe+"грамм.");
                                             System.out.println("Ну или "+recipe/1000+" килограмма.");
        System.out.println(" ");
        System.out.println("   Задача 7");
                     int needToSlimKg=7;
                     short var1g=250;
                     short var2g=500;
                     int daysToSlimVar1=needToSlimKg*1000/var1g;
                     int daysToSlimVar2=needToSlimKg*1000/var2g;
                     int midDaysNeeded=(daysToSlimVar1+daysToSlimVar2)/2;
                               System.out.println("Если будет худеть первым способом, то сбросит 7кг за"+daysToSlimVar1+
                                                "дней. А если вторым, тогда, за "+daysToSlimVar2+"дней");
                               System.out.println("В среднем, может скинуть 7 кг за"+midDaysNeeded+" день.");
    }
    }
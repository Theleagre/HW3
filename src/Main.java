public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int a = 2000000;
        byte b = 126;
        short c = -32000;
        long d = 100055555;
        float e = (float) 125.6;
        double g = 185.666;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной g с типом double равно " + g);
        System.out.println("Задача2");
        float aa = 27.12f;
        long bb = 987678965549L;
        double cc = 2.786;
        boolean dd = false;
        char ee = 569;
        short ff = -159;
        int gg = 27897;
        byte hh = 67;
        System.out.println("Задача3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        byte allStudents = (byte) (studentsEA + studentsAS + studentsLP);
        System.out.println("Всего учеников - " + allStudents + " человек");
        short allPaper = 480;
        short paperForStudent = (short) (allPaper / allStudents);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
        System.out.println("Задача4");
        byte bottlesForTwomin = 16;
        byte bottlesForOneMin = (byte) (bottlesForTwomin / 2);
        short bottlesFor20min = (short) (bottlesForOneMin * 20);
        System.out.println("За 20 минут машина произвела бутылок " + bottlesFor20min + " штук");
        short bottlesDay = (short) (bottlesForOneMin * 60 * 24);
        System.out.println("За сутки машина произвела бутылок " + bottlesDay + " штук");
        int bottles3Days = (int) (bottlesDay * 3);
        System.out.println("За 3 дня машина произвела бутылок " + bottles3Days + " штук");
        int bottlesMonth = (int) (bottlesDay * 30);
        System.out.println("За 3 дня машина произвела бутылок " + bottlesMonth + " штук");
        System.out.println("Задача5");
        byte allPaint = 120;
        byte white1room = 2;
        byte brown1room = 4;
        byte allroom = (byte) (allPaint / (white1room + brown1room));
        byte allwhite = (byte) (allroom * white1room);
        byte allbrown = (byte) (allroom * brown1room);
        System.out.println("В школе, где " + allroom + " классов, нужно " + allwhite + " банок белой краски и " + allbrown + " банок коричневой краски");
        System.out.println("Задача6");
        byte bananas = 5;
        short milk = 200;
        byte icecream = 2;
        byte eggs = 4;
        short weightBananas = (short) (bananas * 80);
        short weightMilk = (short) (milk / 100 * 105);
        short weightIcecream = (short) (icecream * 100);
        short weightEggs = (short) (eggs * 70);
        double weightBreakfast = (double) (weightBananas + weightMilk + weightIcecream + weightEggs);
        System.out.println("Вес завтрака спортсмена составляет " + weightBreakfast + " г");
        double weightBreakfastKg = weightBreakfast / 1000;
        System.out.println("Вес завтрака спортсмена составляет " + weightBreakfastKg + " кг");
        System.out.println("Задача7");
        byte allweight = 7;
        float minKg = 0.25F;
        float maxKg = 0.5F;
        double minDay = allweight / minKg;
        double maxDay = allweight / maxKg;
        int average = (int) ((minDay + maxDay) / 2);
        System.out.println("Среднее количество дней для похудения на 7 кг является " + average + " дней");
        System.out.println("Задача8");
        int Mary = 67760;
        int Dan = 83690;
        int Kris = 76230;
        float MoreM = Mary + 10*Mary/100;
        float MoreD = Dan + 10*Dan/100;
        float MoreK = Kris + 10*Kris/100;
        int aveM = (int) ((MoreM - Mary) * 12);
        int aveD = (int) ((MoreD - Dan) * 12);
        int aveK = (int) ((MoreK - Kris) * 12);
        System.out.println("Маша теперь получает " + MoreM + " рублей. Годовой доход вырос на " + aveM + " рублей");
        System.out.println("Денис теперь получает " + MoreD + " рублей. Годовой доход вырос на " + aveD + " рублей");
        System.out.println("Кристина теперь получает " + MoreK + " рублей. Годовой доход вырос на " + aveK + " рублей");
    }
}
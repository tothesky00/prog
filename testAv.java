public class testAv {
    public static void main(String[] args) {
        Aviacomp AV = new Aviacomp();

        camal CA = new camal("Кинг Бредли", 1000, 1500 , 3000 , "АВВВ",2,false);

        AV.addFur(CA); // добавляем шкаф в комнату

        AV.addFur(new camal("Лука Кит", 1000,1800 , 7000, "ООО тех", 4, false));

        vert VER = new vert("Кинг Бредли",1000,3900,6500,"ветолет грузовой",4,true);

        AV.addFur(VER);

        AV.printAviacomp();

        if (AV.findFur(CA)) {
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }

        System.out.println();
        System.out.println("Гараж после удаления самолета");
        AV.removeFur(CA);
        AV.printAviacomp();
    }
}
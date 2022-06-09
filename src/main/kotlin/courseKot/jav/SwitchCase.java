package courseKot.jav;

import org.w3c.dom.ls.LSOutput;

public class SwitchCase {
    public static void main(String[] args) {
        String nameOfMonth = "";
        String season;
        switch (nameOfMonth) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                season = "Зима";
                break;
            case "Март":
            case "Апрель":
            case "Май":
                season = "Весна";
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                season = "Лето";
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                season = "Осень";
                break;
            default:
                season = "Сезон не найден";
        }
        System.out.printf(season);
    }

}

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        calculateYear(2023);
        getApplicationVersion(0, 2026);
        calculateDeliveryDays(70);
    }
    public static void calculateYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год - високосный год");
        }else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void getApplicationVersion(int systemType, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if(systemType == 0){
            if(clientDeviceYear > currentYear){
                System.out.println("Установите облегченную версию приложения на ios по ссылке");
            }else{
                System.out.println("Установите версию приложения для ios по ссылке");
            }
        }else {
            if(clientDeviceYear > currentYear){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance < 100){
            if(deliveryDistance > 20){
                deliveryDays++;
            }
            if(deliveryDistance > 60){
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }else{
            System.out.println("Свыше 100 км доставки нет.");
        }

    }

}

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        String name = "year";
        int year = leapYear;
        public static int leapYear (String year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "год является високосным");
                return;
                System.out.println(year + "год не является високосным");
            }
            // Задание 2.
            String osName = "iOS";
            int clientOS = getClientOS(osName);
            public static int getClientOS (String name){
                if (name.equals("iOS")) {
                    return 0;
                } else {
                    return 1;
                }
            }
            // Задание 3.
            int deliveryDisntance = 95;
            int deliveryDays = 1;
            public static int distance (String deliveryDays) {
                if (deliveryDisntance > 20) {
                    deliveryDays++;
                }
                if (deliveryDisntance > 60) {
                    deliveryDays++;
                }
                System.out.println("Потребуется дней: " + deliveryDays);
            }


            }



        }
    }
}
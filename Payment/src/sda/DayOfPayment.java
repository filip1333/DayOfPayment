package sda;

import java.time.*;

public class DayOfPayment {

        public static void main(String[] args) {

                LocalDate dayToday = LocalDate.of(2016, 12, 27);
                if (dayToday.getMonthValue() == 12) {
                        System.out.println(31 - dayToday.getDayOfMonth() + 25);
                } else if (dayToday.getDayOfMonth() == 25) {
                        System.out.println("Yeeeeeaaa, You took the money today!");
                } else if (dayToday.getDayOfMonth() > 25) {
                                int days = Period.between(dayToday, LocalDate.of(dayToday.getYear(), dayToday.getMonth().plus(1), 25)).getDays();
                                System.out.println(days);
                } else {
                        int days = Period.between(dayToday, LocalDate.of(dayToday.getYear(), dayToday.getMonth(), 25)).getDays();
                        System.out.println(days);
                }
        }
}
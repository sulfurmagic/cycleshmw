package ru.netology.homework.cycleshmw.services;

public class VacationMonthsService {

    public int calcMonths(int income, int expenses, int threshold) {
        int count = 0; //скока месяцев отдыхает чел
        int money = 0; //скока денег на счету

        for (int months = 0; months < 12; months++) {

            if (money > threshold) {
                count++;
                money = (money - expenses) / 3;
                System.out.println("Денег " + money + ". Отдыхаю");
            } else {
                money = money + income - expenses;
                System.out.println("Денег " + money + ". Работаю");
            }
        }
        return count;
    }
}

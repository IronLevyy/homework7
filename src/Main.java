import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Задача 1
        int target = 2_459_000;
        double total = 0;
        int savedPerMonth = 15000;
        int count = 0;
        while (total <= target) {
            total = total + savedPerMonth;
            total = total + total / 100;
            count++;
            System.out.printf("Месяц %d, сумма накоплений равна %f рублей.\n", count, total);
        }
        System.out.print("\n\n");

//Задача 2
        count = 0;
        do {
            count++;
            System.out.print(count + " ");
        } while (count < 10);
        System.out.print("\n");
        for (; count >= 1; count--) {
            System.out.print(count + " ");
        }
        System.out.print("\n\n");

//Задача 3
        int population = 12_000_000;
        int birthPerThousand = 17;
        int deathsPerThousand = 8;
        int birthRate, deathRate;
        for (int i = 1; i <= 10; i++) {
            birthRate = population / 1000 * birthPerThousand;
            deathRate = population / 1000 * deathsPerThousand;
            population = population + birthRate - deathRate;
            System.out.printf("Год %d, численность населения составляет %d.\n", i, population);
        }
        System.out.print("\n\n");

//Задача 4
        target = 12_000_000;
        float contribution = 15_000f;
        int interestRate = 7;
        count = 0;
        while (contribution <= target) {
            contribution = contribution + ((contribution / 100) * interestRate);
            count++;
            System.out.printf("Месяц %d, сумма вклада равна %.2f рублей.\n", count, contribution);
        }
        System.out.print("\n\n");

//Задача 5
        target = 12_000_000;
        contribution = 15_000f;
        count = 0;
        while (contribution <= target) {
            contribution = contribution + ((contribution / 100) * interestRate);
            count++;
            if ((count % 6) == 0) {
                System.out.printf("Месяц %d, сумма вклада равна %.2f рублей.\n", count, contribution);
            }
        }
        System.out.print("\n\n");

//Задача 6
        float contributionTaskSix = 15_000f;
        count = 0;
        while (count <= 108) {
            contributionTaskSix = contributionTaskSix + ((contributionTaskSix / 100) * interestRate);
            count++;
            if ((count % 6) == 0) {
                System.out.printf("Месяц %d, сумма вклада равна %.2f рублей.\n", count, contributionTaskSix);
            }
        }
        System.out.print("\n\n");

//Задача 7
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату первой пятницы: ");
        int FridayDate = in.nextInt();
        for (; FridayDate < 31; FridayDate +=7){
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", FridayDate);
        }
        in.close();

    }
}
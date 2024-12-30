package ru.ivanpavlyuk.hw5;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
// Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).

        List<Transaction> transactionsFor2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();
        System.out.println(transactionsFor2011);

// Вывести список неповторяющихся городов, в которых работают трейдеры.

        Set<String> distinctCities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println(distinctCities);

// Найти всех трейдеров из Кембриджа и отсортировать их по именам.

        List<Trader> cambridgeTraders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .toList();
        System.out.println(cambridgeTraders);

// Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.

        String tradersNames = cambridgeTraders.stream()
                .map(Trader::getName)
                .collect(Collectors.joining(", "));
        System.out.println(tradersNames);

// Выяснить, существует ли хоть один трейдер из Милана.

        boolean hasTraderFromMilan = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(hasTraderFromMilan);

// Вывести суммы всех транзакций трейдеров из Кембриджа.

        String allCambridgeTraidersTransactions = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(allCambridgeTraidersTransactions);

// Какова максимальная сумма среди всех транзакций?

        int maxTransaction = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo)
                .get();
        System.out.println(maxTransaction);

// Найти транзакцию с минимальной суммой.

        Transaction minTransaction = transactions.stream()
                .min(Comparator.comparingInt(Transaction::getValue))
                .get();
        System.out.println(minTransaction.getValue());
    }
}

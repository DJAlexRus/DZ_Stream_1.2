import java.lang.module.FindException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание № 1:
        System.out.println("Задание № 1:");
        Integer[] arr = {1,2,3,4,5,6};
        Optional<Integer> sumEven = Stream.of(arr)
                .filter(a ->a % 2 ==0)
                .reduce((x,y) ->x+y)
                ;
        System.out.println("вариант 1: Сумма четных чисел:" + sumEven.get());

        Optional<Integer> sumNoEven = Stream.of(arr)
                .filter(a ->a % 2 !=0)
                .reduce((x,y) ->x+y)
                ;
        System.out.println("вариант 1: Сумма не четных чисел:" + sumNoEven.get());
        //---
        Set<Integer> setEven = Stream.of(arr).filter(s ->s % 2==0).collect(Collectors.toSet());
        Integer sumA = 0, i =0;
        List<Integer> numEven = new ArrayList<Integer>(setEven);
        for (Integer item: numEven ){
            sumA += numEven.get(i);
            i++;
        }
        System.out.println("вариант 2: Сумма четных чисел:" + sumA);
        //TODO Вопрос: Какой вариант для обработки данных быстрее?

        //Задание № 2:
        System.out.println('\n' + "Задание № 2:");
        List<String> wordsStream = Stream.of("Маша","Даша","Катя","Петя","Катя","Даша","Толя")
                .distinct()
                .toList()
                ;
        System.out.println("Список эксклюзивных элементов: " + wordsStream);
    }
}
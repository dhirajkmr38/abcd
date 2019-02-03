package thread.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.IntStream;


public class Test
{


    public static void main(String args[]) throws InterruptedException
    {
        OccurrenceCounter occurrenceCounter = new OccurrenceCounter();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<Void>> callables = IntStream.range(0, 100)
            .mapToObj(i -> {
                Callable<Void> callable = () -> {
                    occurrenceCounter.addLetterOccurence("123A456");
                    return null;
                };
                return callable;
            })
            .collect( Collectors.toList());
        executorService.invokeAll(callables);
        Integer occurence = occurrenceCounter.mapCountByLetter.get('A');
        System.out.println("A occurence=" + occurence);
        executorService.shutdown();


    }
}

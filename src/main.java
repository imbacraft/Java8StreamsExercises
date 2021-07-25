import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {

    /* THEORY OF JAVA 8 STREAMS

    * Introduced in Java 8, the Stream API is used to process collections of objects.
    * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
    * A stream is not a data structure. Instead, it takes input from the Collections, Arrays or I/O channels.
    * Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
    * Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined.
    * Terminal operations mark the end of the stream and return the result.
    * A stream consists of source followed by zero or more intermediate methods combined together (pipelined) and a terminal method to process
    the objects obtained from the source as per the methods described

    * Different Operations On Streams

    * Α. Intermediate Operations:
    * 1. map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
    * 2. filter: The filter method is used to select elements as per the Predicate passed as argument.
    * 3. sorted: The sorted method is used to sort the stream.
    *
    * B. Terminal Operations:
    * 1. collect: The collect method is used to return the result of the intermediate operations performed on the stream.
    * 2. forEach: The forEach method is used to iterate through every element of the stream.
    * 3. reduce: The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.

*/
    public static void main (String[] args){

        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);
        System.out.println("Integer List to be squared: "+ number);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println("Using map method to produce squared Integer list: " + square);

        // create a list of String
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        System.out.println("String list to be filtered: "+ names);

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println("Using filter method to filter String List and keep only Strings that start with S: "+ result);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Using sorted() method to sort String list alphabetically: "+ show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);

    }


    }


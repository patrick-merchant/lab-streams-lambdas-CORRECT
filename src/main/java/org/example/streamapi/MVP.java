package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
        names.stream().forEach(name -> System.out.println(name));
    }

    /*
        Given a List<Integers>, return a List<Integer> with even numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
        return evenNumbers;
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)
         return Arrays.stream(numbers).map(number -> number*2 ).toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)

        return Arrays.stream(input.toUpperCase().split("")).toList();
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        Predicate<String> startsWithGivenLetter = (String -> String.startsWith(letter));
        return list.stream().filter(startsWithGivenLetter).sorted().map(String -> String.toUpperCase()).toList();
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        Predicate<String> shorterThanMaxLength = (String -> String.length() < maxLength);
        Predicate<String> startWithFirstLetter = (String -> String.startsWith(firstLetter));
        return words.stream().filter(shorterThanMaxLength.and(startWithFirstLetter)).toList();
    }
}
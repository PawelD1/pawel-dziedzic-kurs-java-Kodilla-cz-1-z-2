package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifer;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.util.Map;
import java.util.stream.Collectors;

//public class StreamMain {
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);
//    }
//}

//public class StreamMain {
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));
//    }
//}

//public class StreamMain
//{
//    public static void main(String[] args)
//    {
//        PoemBeautifer pb= new PoemBeautifer();
//        String result=pb.beautify("Akalsldkdk",n->"ABC"+n+"ABC");
//        System.out.println(result);
//        String result2=pb.beautify("Akalsldkdk",n->n.toUpperCase());
//        System.out.println(result2);
//        String result3=pb.beautify("Kajah",n->n.replaceFirst("K","P"));
//        System.out.println(result3);
//        String result4=pb.beautify("Kajah",n->n.replaceAll("a","z"));
//        System.out.println(result4);
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//    }
//}
public class StreamMain {
    public static void main(String[] args) {
        Forum f = new Forum();
        Map<Integer, ForumUser> mapOfChoosenUsers = f.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirthday().getYear() <= 1998)
//                .filter(forumUser -> forumUser.getDateOfBirthday().getMonthValue() <= 11)
//                .filter(forumUser -> forumUser.getDateOfBirthday().getDayOfMonth() <= 22)
                .filter(forumUser -> forumUser.getAmountOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        System.out.println("# elements: " + mapOfChoosenUsers.size());
        mapOfChoosenUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}


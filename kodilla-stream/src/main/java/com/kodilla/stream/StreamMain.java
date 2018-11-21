package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifer;

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

public class StreamMain
{
    public static void main(String[] args)
    {
        PoemBeautifer pb= new PoemBeautifer();
        String result=pb.beautify("Akalsldkdk",n->"ABC"+n+"ABC");
        System.out.println(result);
        String result2=pb.beautify("Akalsldkdk",n->n.toUpperCase());
        System.out.println(result2);
        String result3=pb.beautify("Kajah",n->n.replaceFirst("K","P"));
        System.out.println(result3);
        String result4=pb.beautify("Kajah",n->n.replaceAll("a","z"));
        System.out.println(result4);
    }
}
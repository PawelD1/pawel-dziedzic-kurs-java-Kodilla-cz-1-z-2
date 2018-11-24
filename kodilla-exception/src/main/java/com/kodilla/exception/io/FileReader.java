package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader
{
    public void readFile() throws FileReaderException
    {
        ClassLoader classLoader=getClass().getClassLoader();
        File file=new File(classLoader.getResource("file/names.txt").getFile());
        System.out.println(file.getPath());
        Path path= Paths.get("file/names.txt");
        try(Stream<String> fileLines = Files.lines(Paths.get(file.getPath())))
        {

            fileLines.forEach(System.out::println);
        }catch(IOException e)
        {
            System.out.println("Oh no! Something went wrong!"+e);
            throw new FileReaderException();
        } finally{
            System.out.println("Im am gonna be here... always!");
        }
    }
}

package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface ISellRepository
{
    Map<String,String>add=new HashMap<String, String>();
    void addToRepository(Product product, User user);
    void showReepository(Map<String,String> add);

}

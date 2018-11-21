package com.kodilla.stream.beautifier;

public class PoemBeautifer
{

    public String beautify(String tekst, PoemDecorator pd)
    {
        String result=pd.decorate(tekst);
        return result;
    }

}

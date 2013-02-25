package com.amazon.stream.question;

import com.amazon.stream.provided.Stream;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstOddPicker {
    public Character identifyFirstOddFromStream(Stream stream) {
        Set<Character> jaFoi = new LinkedHashSet<Character>();
        Character n = null;

        if(null != stream){
            while (stream.hasNext()){
                n = Character.toLowerCase(stream.getNext());

                if(jaFoi.isEmpty()){
                    jaFoi.add(n);
                }
                else if(!jaFoi.contains(n)){
                    return n;
                }
            }
        }

        return null;
    }
}
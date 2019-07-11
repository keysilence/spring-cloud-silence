package com.silence;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //或者这么写也可以：DataInputStream reader = new DataInputStream(System.in);
        String inString = reader.readLine();
        Map<String, Integer> countMap = new LinkedHashMap<>();
        List<String> minCharList = new ArrayList<>();
        for (int i = 0; i < inString.length(); i++) {
           char b = inString.charAt(i);
            String currentStr = String.valueOf(b);
            if (countMap.containsKey(currentStr)) {
                countMap.put(currentStr, countMap.get(currentStr) + 1);
                minCharList.remove(currentStr);
            } else {
                countMap.put(currentStr, 1);
                minCharList.add(currentStr);
            }
        }

        String result = inString;
        if (minCharList.size() > 0) {
            for (String tmp : minCharList) {
                result = result.replace(tmp, "");
            }
        } else {
            result = "";
        }

        System.out.println("输入：" + inString);
        System.out.println("输出：" + result);

    }
}

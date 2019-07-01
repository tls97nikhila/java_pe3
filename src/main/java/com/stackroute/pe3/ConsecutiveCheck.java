
package com.stackroute.pe3;

        import static org.junit.Assert.*;

public class ConsecutiveCheck {

    public String checkconsecutive(String input) {

        String str[]=input.split(",");
        int num[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            num[i]=Integer.parseInt(str[i]);
        }

        int count=1;
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]==num[i+1]+1)
            {
                count++;
            }

        }
        if(count==num.length)
        {
            return ("consecutive numbers");
        }
        else
        {
            return("Non consecutive numbers");
        }

    }
}


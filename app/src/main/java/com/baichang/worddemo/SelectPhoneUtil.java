package com.baichang.worddemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by win10 on 2017/7/4.
 */

public class SelectPhoneUtil {
    public static String StringFilter(String str) throws PatternSyntaxException {
        String regEx = "[0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        StringBuffer buffer = new StringBuffer();
        while (m.find()) {
            buffer.append(m.group());
        }
        return buffer.toString();
    }

    public static String StringFilter2(String str) throws PatternSyntaxException {
        String regEx = "[0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }
}

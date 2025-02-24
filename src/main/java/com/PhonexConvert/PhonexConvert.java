package main.java.com.PhonexConvert;

import java.util.Map;
import java.util.stream.Collectors;

public class PhonexConvert {
    private Map<Character, String> phoneticMap = Map.ofEntries(
            Map.entry('A', "Alpha"), Map.entry('B', "Bravo"), Map.entry('C', "Charlie"),
            Map.entry('D', "Delta"), Map.entry('E', "Echo"), Map.entry('F', "Foxtrot"),
            Map.entry('G', "Golf"), Map.entry('H', "Hotel"), Map.entry('I', "India"),
            Map.entry('J', "Juliett"), Map.entry('K', "Kilo"), Map.entry('L', "Lima"),
            Map.entry('M', "Mike"), Map.entry('N', "November"), Map.entry('O', "Oscar"),
            Map.entry('P', "Papa"), Map.entry('Q', "Quebec"), Map.entry('R', "Romeo"),
            Map.entry('S', "Sierra"), Map.entry('T', "Tango"), Map.entry('U', "Uniform"),
            Map.entry('V', "Victor"), Map.entry('W', "Whiskey"), Map.entry('X', "X-ray"),
            Map.entry('Y', "Yankee"), Map.entry('Z', "Zulu")
    );

    Map<String, Character> reversePhoneticMap = phoneticMap.entrySet()
            .stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
}
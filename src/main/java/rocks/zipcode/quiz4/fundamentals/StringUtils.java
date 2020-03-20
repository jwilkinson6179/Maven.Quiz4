package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils
{
    public static Character getMiddleCharacter(String string)
    {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder result = new StringBuilder();
        Integer charIdx = str.length() / 2;

        for(Integer i = 0; i < str.length(); i++)
        {
            if(i == charIdx)
            {
                result.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {

                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder result = new StringBuilder();
        Integer charIdx = str.length() / 2;

        for(Integer i = 0; i < str.length(); i++)
        {
            if(i == charIdx)
            {
                result.append(Character.toLowerCase(str.charAt(i)));
            }
            else
            {

                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static Boolean isIsogram(String str)
    {
        for(Integer i = 0; i < str.length(); i++)
        {
            for(Integer k = i + 1; k < str.length(); k++)
            {
                if(str.charAt(i) == (str.charAt(k)))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str)
    {
        for(Integer i = 1; i < str.length(); i++)
        {
            if(str.charAt(i - 1) == str.charAt(i))
            {
                return true;
            }
        }

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str)
    {
        StringBuilder result = new StringBuilder();

        Character current = str.charAt(0);
        if(!current.equals(str.charAt(1)))
        {
            result.append(current);
        }

        for(Integer i = 1; i < str.length() - 1; i++)
        {
            current = str.charAt(i);
            if(!current.equals(str.charAt(i - 1)) && !current.equals(str.charAt(i + 1)))
            {
                result.append(current);
            }
        }

        current = str.charAt(str.length() - 1);
        if(!current.equals(str.charAt(str.length() - 2)))
        {
            result.append(current);
        }

        return result.toString();
    }

    public static String invertCasing(String str)
    {
        StringBuilder result = new StringBuilder();

        for(Integer i = 0; i < str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                result.append(Character.toLowerCase(str.charAt(i)));
            }
            else
            {
                result.append(Character.toUpperCase(str.charAt(i)));
            }
        }

        return result.toString();
    }
}
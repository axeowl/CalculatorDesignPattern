package business;

import java.util.Iterator;

public class Subtract implements Strategy {

    @Override
    public int doOperation(String expr)
    {
        String[] tmp = expr.split(" ", 3);
        int result = 0;

        for (String a : tmp)
        {
            if(isNumeric(a))
            {
                if (result == 0)
                    result = Integer.parseInt(a);
                else
                    result -= Integer.parseInt(a);
            }
        }
        return result;
    }

    private static boolean isNumeric(final String str) {

        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;

    }
}

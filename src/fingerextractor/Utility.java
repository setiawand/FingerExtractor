/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerextractor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Deni Setiawan
 */
public class Utility {

    static final Logger logger = Logger.getLogger(Utility.class.getName());
    private static Utility utility;

    public static Utility getDefault() {
        if (utility == null) {
            utility = new Utility();
        }
        return utility;
    }

    public Date toDate(String s, String format) {
        Date result = null;
        try {
            DateFormat df = new SimpleDateFormat(format);
            result = df.parse(s);
        } catch (ParseException ex) {
        }
        return result;
    }

    public String toText(Date input, String format) {
        DateFormat df = new SimpleDateFormat(format);
        return df.format(input);
    }
    
    public Date addDate(Date d, int interval, String mask) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        mask = mask.toLowerCase();
        if (mask.equals("d")) {
            cal.add(Calendar.DATE, interval);
        } else if (mask.equals("m")) {
            cal.add(Calendar.MONTH, interval);
        } else if (mask.equals("y")) {
            cal.add(Calendar.YEAR, interval);
        } else if (mask.equals("h")) {
            cal.add(Calendar.HOUR_OF_DAY, interval);
        }
        return cal.getTime();
    }
    
    public String[] merge(Comparable[] arg1, Comparable[] arg2) {
        //convert arrays to collections (lists)
        Collection coll1 = Arrays.asList(arg1);
        Collection coll2 = Arrays.asList(arg2);

        List set = new ArrayList(coll1);
        set.addAll(coll2);

        //Create an array to hold the results
        String[] merged = new String[set.size()];
        Iterator itSorted = set.iterator();

        for (int i = 0; itSorted.hasNext(); i++) {
            merged[i] = ((String) itSorted.next()).toString();
        }

        //return the SortedSet as an array
        return (merged);
    }
}

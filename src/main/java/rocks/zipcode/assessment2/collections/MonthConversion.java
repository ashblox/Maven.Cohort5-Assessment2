package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    Map<Integer, String> months;

    public MonthConversion() {
        months = new HashMap<>();
    }

    public void add(Integer monthNumber, String monthName) {
        months.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if (months.containsKey(monthNumber)) {
            return months.get(monthNumber);
        } else {
            return null;
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer number = null;
        for (Map.Entry<Integer, String> entry : months.entrySet()) {
            if (entry.getValue().equals(monthName)) {
                number = entry.getKey();
            }
        }
        return number;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return months.keySet().contains(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return months.values().contains(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return months.entrySet().size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        months.put(monthNumber, monthName);
    }
}

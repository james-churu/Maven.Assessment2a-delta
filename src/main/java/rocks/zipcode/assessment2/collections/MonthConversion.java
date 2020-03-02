package rocks.zipcode.assessment2.collections;

import java.util.HashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    HashMap<Integer, String> months = new HashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        months.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if(!months.containsKey(monthNumber)){
            return null;
        }else{
            return months.get(monthNumber);
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {

        if(!months.containsValue(monthName)){
            return null;
        }else{
            Integer key = null;
            for(Integer keyVal : months.keySet()){
                if(months.get(keyVal).equals(monthName)){
                    key = keyVal;
                    break;
                }
            }
            return key;
        }

    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return months.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return months.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        months.put(monthNumber,monthName);
    }
}

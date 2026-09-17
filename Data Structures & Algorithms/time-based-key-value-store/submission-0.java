class TimeMap {

    class TimeValue {
        int timestamp;
        String value;

        TimeValue(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    HashMap<String, ArrayList<TimeValue>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        timeMap
            .computeIfAbsent(key, k -> new ArrayList<>())
            .add(new TimeValue(timestamp, value));
    }

    public String get(String key, int timestamp) {

        ArrayList<TimeValue> list = timeMap.get(key);

        if (list == null) {
            return "";
        }

        int left = 0;
        int right = list.size() - 1;

        String result = "";

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid).timestamp <= timestamp) {

                // Valid timestamp mila.
                // Lekin humein largest valid timestamp chahiye.
                result = list.get(mid).value;

                left = mid + 1;

            } else {

                // Timestamp bahut bada hai.
                right = mid - 1;
            }
        }

        return result;
    }
}
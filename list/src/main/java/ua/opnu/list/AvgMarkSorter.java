package ua.opnu.list;

import java.util.Comparator;

public class AvgMarkSorter implements Comparator {

    private final boolean order;

    public AvgMarkSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            // Double.compare повертає: -1 (s1 < s2), 0 (s1 == s2), 1 (s1 > s2)
            int result = Double.compare(s1.getAvgMark(), s2.getAvgMark());

            if (order) { // Прямий порядок (зростання)
                return result;
            } else { // Зворотний порядок (спадання)
                return -result;
            }
        }
        return 0;
    }
}
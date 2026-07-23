import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {

    public static int minMeetingRooms(int[][] intervals) {

        if (intervals.length == 0) {
            return 0;
        }

        // Sort meetings by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Min Heap stores ending times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // First meeting
        pq.offer(intervals[0][1]);

        // Remaining meetings
        for (int i = 1; i < intervals.length; i++) {

            // If current meeting starts after previous meeting ends
            if (intervals[i][0] >= pq.peek()) {
                pq.poll();
            }

            // Add current meeting end time
            pq.offer(intervals[i][1]);
        }

        return pq.size();
    }

    public static void main(String[] args) {

        int[][] meetings = {
                {0, 30},
                {5, 10},
                {15, 20}
        };

        System.out.println(minMeetingRooms(meetings));
    }
}
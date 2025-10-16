//! Topics: Hash Table, Design, Heap (Priority Queue), Ordered Set

//? Medium Difficulty

//* Better Solution: 304ms

import java.util.*;

class TaskManager {

    private Map<Integer, int[]> taskInfo; // taskId -> [userId, priority]
    private PriorityQueue<int[]> maxHeap; // [priority, taskId, userId]

    public TaskManager(List<List<Integer>> tasks) {
        taskInfo = new HashMap<>();
        maxHeap = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0]) return Integer.compare(b[0], a[0]); // higher priority first
            return Integer.compare(b[1], a[1]); // if tie, higher taskId first
        });

        for (List<Integer> t : tasks) {
            int userId = t.get(0), taskId = t.get(1), priority = t.get(2);
            taskInfo.put(taskId, new int[]{userId, priority});
            maxHeap.offer(new int[]{priority, taskId, userId});
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskInfo.put(taskId, new int[]{userId, priority});
        maxHeap.offer(new int[]{priority, taskId, userId});
    }

    public void edit(int taskId, int newPriority) {
        int[] info = taskInfo.get(taskId);
        int userId = info[0];
        taskInfo.put(taskId, new int[]{userId, newPriority});
        maxHeap.offer(new int[]{newPriority, taskId, userId}); // add new version
    }

    public void rmv(int taskId) {
        taskInfo.remove(taskId); // lazy removal (leave old entry in heap)
    }

    public int execTop() {
        while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int priority = top[0], taskId = top[1], userId = top[2];

            // validate against current taskInfo
            if (taskInfo.containsKey(taskId)) {
                int[] info = taskInfo.get(taskId);
                if (info[0] == userId && info[1] == priority) {
                    taskInfo.remove(taskId); // remove from system
                    return userId;
                }
            }
            // else skip outdated entry
        }
        return -1; // no tasks
    }
}

public class DesignTaskManager_3408 {
    public static void main(String[] args) {
        List<List<Integer>> tasks = Arrays.asList(
            Arrays.asList(1, 101, 10),
            Arrays.asList(2, 102, 20),
            Arrays.asList(3, 103, 15)
        );

        TaskManager tm = new TaskManager(tasks);

        tm.add(4, 104, 5);
        tm.edit(102, 8);
        System.out.println(tm.execTop()); // 3 (task 103)
        tm.rmv(101);
        tm.add(5, 105, 15);
        System.out.println(tm.execTop()); // 5 (task 105)
    }
}

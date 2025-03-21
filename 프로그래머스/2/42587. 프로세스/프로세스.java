import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Process> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(priorities[i], i));
        }

        while (!queue.isEmpty()) {
            Process current = queue.poll(); 
            boolean hasHigherPriority = false;

           
            for (Process process : queue) {
                if (process.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.add(current); 
            } else {
                answer++; 
                if (current.index == location) {
                    return answer; 
                }
            }
        }

        return answer;
    }

    private static class Process {
        int priority;
        int index;

        Process(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
}
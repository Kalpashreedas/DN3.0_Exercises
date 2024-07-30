package Task_Management_System;

public class TaskLinkedList {
        private TaskNode head;
    
        // Add a task
        public void addTask(Task task) {
            TaskNode newNode = new TaskNode(task);
            if (head == null) {
                head = newNode;
            } else {
                TaskNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    
        // Search for a task by taskId
        public Task searchTask(int taskId) {
            TaskNode current = head;
            while (current != null) {
                if (current.task.getTaskId() == taskId) {
                    return current.task;
                }
                current = current.next;
            }
            return null;
        }
    
        // Traverse and print all tasks
        public void traverseTasks() {
            TaskNode current = head;
            while (current != null) {
                System.out.println(current.task);
                current = current.next;
            }
        }
    
        // Delete a task by taskId
        public void deleteTask(int taskId) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
    
            // Special case if the node to delete is the head
            if (head.task.getTaskId() == taskId) {
                head = head.next;
                return;
            }
    
            // Find the node to delete
            TaskNode current = head;
            while (current.next != null && current.next.task.getTaskId() != taskId) {
                current = current.next;
            }
    
            // If the task was found, remove it
            if (current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Task not found.");
            }
        }    
    
}

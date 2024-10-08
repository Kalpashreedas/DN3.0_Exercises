package Task_Management_System;

public class Task {
        private int taskId;
        private String taskName;
        private String status;
    
        // Constructor
        public Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
        }
    
        // Getters
        public int getTaskId() {
            return taskId;
        }
    
        public String getTaskName() {
            return taskName;
        }
    
        public String getStatus() {
            return status;
        }
    
        @Override
        public String toString() {
            return "Task(id=" + taskId + ", name=" + taskName + ", status=" + status + ")";
        }
    
    
}

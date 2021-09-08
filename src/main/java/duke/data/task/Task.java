package duke.data.task;

import java.util.ArrayList;

/**
 * Class that represents a task.
 *
 * @author Wang Hong Yong
 */
public class Task {
    protected String description;
    protected boolean isDone;
    protected ArrayList<String> tags = new ArrayList<>();

    /**
     * Constructor for Task class.
     *
     * @param description Description of the task.
     */
    public Task(String description) {
        assert description != null : "Task description is empty";
        this.description = description;
        this.isDone = false;
    }

    /**
     * Retrieves the done status of the task.
     * @return string representation of the done status of the task.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Marks task as done.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Returns the string representation of the task.
     *
     * @return String representation of the task.
     */
    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "]" + " " + this.description + getTags();
    }

    /**
     * Formats the task to the desirable format.
     *
     * @return A string representing the task in the desirable format.
     */
    public String formatToWrite() {
        return String.format("%d | %s", (this.isDone ? 1 : 0), this.description);
    }

    /**
     * Returns the boolean representation of the completion of task.
     *
     * @return boolean representation of the task completion.
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * Returns the String containing all the tags.
     *
     * @return String representation of all tags.
     */
    public String getTags() {
        String allTags = "";
        for (String tag : tags) {
            allTags += String.format("#%s ", tag);
        }
        return allTags;
    }

    /**
     * Returns the String containing all the tags.
     *
     * @return String representation of all tags.
     */
    public void addTag(String tag) {
        this.tags.add(tag);
    }
}

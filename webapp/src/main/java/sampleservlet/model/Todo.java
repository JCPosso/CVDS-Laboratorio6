package sampleservlet.model;

public class Todo {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public Todo(){

    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setComplete(boolean completed) {
        this.completed = completed;
    }       
}

package tum.shuaiwei.randomchicken.user;

public class RandomSelectionEntity {
    private String name;
    private String description;
    private String[] options;

    public RandomSelectionEntity(String name, int capacity) {
        this.name = name;
        this.options = new String[capacity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}

public class Hazard {

    private String type;
    private String description;
    private int hazard_level;

    public Hazard(String type, String description, int hazard_level) {
        this.type = type;
        this.description = description;
        this.hazard_level = hazard_level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHazard_level() {
        return hazard_level;
    }

    public void setHazard_level(int hazard_level) {
        this.hazard_level = hazard_level;
    }
}

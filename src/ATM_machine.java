class ATM_machine{
    private int id;
    private String name;
    private String location;
    private String unit;

    public ATM_machine(int id, String name, String location, String unit) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ATM_machine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }

    public void add(){

    }

    public void verification(){

    }
}
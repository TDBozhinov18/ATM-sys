class Savings{
    private int id;
    private String name;
    private String details;
    private String data;
    private String amount;


    public Savings(int id, String name, String details, String data, String amount) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.data = data;
        this.amount = amount;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Savings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", data='" + data + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    public void add(){

    }
}
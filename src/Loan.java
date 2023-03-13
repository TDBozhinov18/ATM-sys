class Loan{
    private int id;
    private String name;
    private String details;
    private String amount;
    private String data;
    private String duedate;


    public Loan(int id, String name, String details, String amount, String data, String duedate) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.amount = amount;
        this.data = data;
        this.duedate = duedate;
    }

    public Loan() {

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Loan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", amount='" + amount + '\'' +
                ", data='" + data + '\'' +
                ", duedate='" + duedate + '\'' +
                '}';
    }

    public void add(){

    }

    public void update(){

    }
}
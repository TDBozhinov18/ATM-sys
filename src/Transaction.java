class Transaction extends Loan{
    protected int id;
    protected String client;
    protected String data;
    protected String details;



    public Transaction(int id, String client, String data, String details) {
        super();
        this.id = id;
        this.client = client;
        this.data = data;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Transaction{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", data='" + data + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public void secure(){

    }
}
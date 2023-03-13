class Credit{
    private int id;
    private String data;
    private String amount;


    public Credit(int id, String data, String amount) {
        this.id = id;
        this.data = data;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Credit{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    public void secureData(){

    }

}
class Bank{
    private String name;
    private String account;


    public Bank(String name, String account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

    public void updateAccount(){

    }

    public void verify(){

    }

    public void processTransaction(){

    }


}
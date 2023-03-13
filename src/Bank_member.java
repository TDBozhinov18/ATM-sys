class Bank_member{
    private int id;
    private String name;
    private String details;
    private String address;
    private String contactNumber;


    public Bank_member(int id, String name, String details, String address, String contactNumber) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.address = address;
        this.contactNumber = contactNumber;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bank_member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    public void processRequest(){

    }

    public void validateTransaction(){

    }
}
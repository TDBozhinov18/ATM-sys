class Cards{
    private int cardNumber;
    private int memberID;
    private int pin;
    private String type;

    public Cards(int cardNumber, int memberID, int pin, String type) {
        this.cardNumber = cardNumber;
        this.memberID = memberID;
        this.pin = pin;
        this.type = type;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cards{" +
                "cardNumber=" + cardNumber +
                ", memberID=" + memberID +
                ", pin=" + pin +
                ", type='" + type + '\'' +
                '}';
    }

    public void access(){

    }
}
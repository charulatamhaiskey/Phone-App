public interface Phone {
    boolean powerOn();
    void callNumber(String phoneNo);
    void receiveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();
}


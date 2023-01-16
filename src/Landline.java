public class Landline implements Phone {

    private String myPhNumber;
    private boolean isRinging;
    protected boolean isPowerOn;

    public Landline(String phNumber) {
        this.myPhNumber = phNumber;
        isRinging=false;
        isPowerOn=true;
    }

    public String getPhNumber() {
        return myPhNumber;
    }

    public void setPhNumber(String phNumber) {
        this.myPhNumber = phNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }



    @Override
    public boolean powerOn() {
        return isPowerOn;
    }



    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn==true){
            System.out.println("You are dialing the no."+phoneNo);
        }else{
            System.out.println("Your landline is off");
        }

    }




    @Override
    public void receiveCall(String phoneNo) {
         if(isPowerOn && myPhNumber.equals(phoneNo)){
             this.isRinging=true;
             System.out.println("Hey,"+myPhNumber+" You are receiving a call");
         }else
             System.out.println("Call not received");
    }




    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Call answered ");
            isRinging=false;
            return true;
        }
        return false;
    }



    @Override
    public boolean isRinging() {
           return isRinging;
    }
}

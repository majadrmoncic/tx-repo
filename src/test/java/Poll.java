public class Poll {

    private String pollTitle;
    private String pollLocation;
    private String pollNote;

    private String initiatorName;
    private String initiatorEmail;

    public Poll(String pollTitle, String pollLocation, String pollNote, String initiatorName, String initiatorEmail) {
        this.pollTitle = pollTitle;
        this.pollLocation = pollLocation;
        this.pollNote = pollNote;
        this.initiatorName = initiatorName;
        this.initiatorEmail = initiatorEmail;
    }

    public String getPollTitle() {
        return pollTitle;
    }

    public String getPollLocation() {
        return pollLocation;
    }

    public String getPollNote() {
        return pollNote;
    }

    public String getInitiatorName() {
        return initiatorName;
    }

    public String getInitiatorEmail() {
        return initiatorEmail;
    }

    public void setPollTitle(String pollTitle) {
        this.pollTitle = pollTitle;
    }

    public void setPollLocation(String pollLocation) {
        this.pollLocation = pollLocation;
    }

    public void setPollNote(String pollNote) {
        this.pollNote = pollNote;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    public void setInitiatorEmail(String initiatorEmail) {
        this.initiatorEmail = initiatorEmail;
    }
}

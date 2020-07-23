package practice11;

public enum State {
    addLeader(1), addMember(2);
    private int index;

    State(int i) {
        this.index = i;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

package behavior.responsibilitychain;

public abstract class Approver {
    private Approver successor;
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public Approver getSuccessor() {
        return successor;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

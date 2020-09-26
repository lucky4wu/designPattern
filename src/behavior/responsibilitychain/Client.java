package behavior.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        PurchaseRequest purchaseRequest1 = new PurchaseRequest(2, 3100, 2);
        PurchaseRequest purchaseRequest2 = new PurchaseRequest(1, 11000, 3);
        PurchaseRequest purchaseRequest3 = new PurchaseRequest(1, 5500, 4);
        Approver approver = new DepartmentApprover("系主任");
        Approver approver1 = new CollegeApprover("院长");
        Approver approver2 = new ViceSchoolMasterApprover("副校长");
        Approver approver3 = new SchoolMasterApprover("校长");

        approver.setSuccessor(approver1);
        approver1.setSuccessor(approver2);
        approver2.setSuccessor(approver3);

        approver.processRequest(purchaseRequest);
        approver.processRequest(purchaseRequest1);
        approver.processRequest(purchaseRequest2);
        approver.processRequest(purchaseRequest3);
    }
}

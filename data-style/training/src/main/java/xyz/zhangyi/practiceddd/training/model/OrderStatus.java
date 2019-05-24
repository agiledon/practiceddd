package xyz.zhangyi.practiceddd.training.model;

public enum OrderStatus {
    New("new"), Paid("paid"), Confirmed("confirmed"), Completed("completed");

    private String status;

    OrderStatus(String status) {
        this.status = status.toLowerCase();
    }

    @Override
    public String toString() {
        return status.toString();
    }
}

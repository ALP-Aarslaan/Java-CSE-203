package CT3;

public class CommissionEmployee {
    String name,id;
    private double commissionRate;
    public CommissionEmployee(String name,String id,double crate){
        this.name=name;
        this.id=id;
        this.commissionRate=crate;
    }
    public double getCommission(double sale){
        return sale*commissionRate;
    }
    public double getSalary(double sale){
        return getCommission(sale);
    }
}

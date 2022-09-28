package CT3;

public class BaseCommissionEmployee extends CommissionEmployee {
    public double salary;
    public BaseCommissionEmployee(String name, String id, double crate,double salary) {
        super(name, id, crate);
        this.salary=salary;
    }

    @Override
    public double getSalary(double sale) {
        return getCommission(sale);
    }
    public double calculateSalary(double salary){
        double totalSale=getSalary(salary);
        return salary+totalSale;
    }
    public double getSalary(){
        return salary;
    }
}

package CT3;

public class Test {
    public static void main(String[] args) {
        BaseCommissionEmployee emp1=new BaseCommissionEmployee("jonayed","19101019",2.5,4500);
        BaseCommissionEmployee bce=emp1;
        bce.getSalary();
    }
}

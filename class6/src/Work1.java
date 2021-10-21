class Employee{
    int id;
    String name;
    public double getPay(){
        return 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Regular_Employee extends Employee{
    float salary;
    int bonus;
    public double getPay(){
        return salary+bonus;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

class Contract_Employee extends Employee{
    float pay_per_hour;
    int contract_period;
    public double getPay(){
        return pay_per_hour*contract_period;
    }

    public void setContract_period(int contract_period) {
        this.contract_period = contract_period;
    }

    public void setPay_per_hour(float pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }
}

public class Work1 {
    public static void main(String[] args){
        Regular_Employee r = new Regular_Employee();
        Contract_Employee c = new Contract_Employee();
        r.setId(1);
        r.setName("Regular_Employee");
        r.setBonus(200);
        r.setSalary(2000);
        System.out.println(r.getPay());

        c.setId(2);
        c.setName("Contract_Employee");
        c.setPay_per_hour(20);
        c.setContract_period(200);
        System.out.println(c.getPay());
    }
}

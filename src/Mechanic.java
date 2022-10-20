public class Mechanic<T extends Car> {

    private String name;
    private String company;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void service() {
        System.out.println("Обсужено");
    }

    public void repair() {
        System.out.println("Починено");
    }
}

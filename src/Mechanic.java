import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}

package Entity;

public class TestTable {
    Integer id;
    Integer randomNumber;

    public TestTable(Integer id, Integer randomNumber) {
        this.id = id;
        this.randomNumber = randomNumber;
    }

    public TestTable(Integer randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(Integer randomNumber) {
        this.randomNumber = randomNumber;
    }

    @Override
    public String toString() {
        return "TestTable{" +
                "id=" + id +
                ", randomNumber=" + randomNumber +
                '}';
    }
}

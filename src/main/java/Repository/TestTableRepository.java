package Repository;

import Entity.TestTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTableRepository {
    private Connection connection = MyConnection.connection;
    public void save (TestTable testTable){
        String save = "insert into test4hw10 (randomNumber) values (?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(save);
            preparedStatement.setInt(1,testTable.getRandomNumber());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("failed to save");
        }
    }
}

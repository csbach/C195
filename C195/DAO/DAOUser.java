package C195.DAO;

import java.sql.Connection;

public interface DAOUser {

    public boolean login(Connection conn, String userName, String password);

}

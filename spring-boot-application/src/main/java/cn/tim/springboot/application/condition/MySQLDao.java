package cn.tim.springboot.application.condition;

/**
 * User: luolibing
 * Date: 2017/9/6 10:41
 */
public class MySQLDao extends DataDao {
    public MySQLDao(Database database) {
        super(database);
    }

    @Override
    public void save() {
        System.out.println("mysqlDao");
    }
}

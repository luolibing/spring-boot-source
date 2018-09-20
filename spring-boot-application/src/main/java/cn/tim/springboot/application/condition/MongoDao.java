package cn.tim.springboot.application.condition;

/**
 * User: luolibing
 * Date: 2017/9/6 10:42
 */
public class MongoDao extends DataDao {

    public MongoDao(Database database) {
        super(database);
    }

    @Override
    public void save() {
        System.out.println("mongoDao");
    }
}

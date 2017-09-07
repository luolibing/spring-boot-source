package cn.tim.springboot.application.condition;

/**
 * User: luolibing
 * Date: 2017/9/6 10:41
 */
public abstract class DataDao {

    protected Database database;

    public DataDao(Database database) {
        this.database = database;
    }

    public abstract void save();
}

package TeamWork.TW2022_03_08.dao;

/**
 * @author Wei
 * @create 2022/03/12  10:27
 * @Description 该类为dao接口的实现类
 */
public class TestDaoImpl implements TestDao {

    @Override
    public void save() {
        System.out.println("保存");

    }

    @Override
    public void modify() {
        System.out.println("修改");

    }

    @Override
    public void delete() {
        System.out.println("删除");

    }

}

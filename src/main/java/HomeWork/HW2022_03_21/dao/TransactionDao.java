package HomeWork.HW2022_03_21.dao;

/**
 * @author Wei
 * @create 2022/03/08  15:37
 * 该类为dao接口类
 */
public interface TransactionDao {
    public void delete(String sql,Object[] param);
    public void save(String sql,Object[] param);
}



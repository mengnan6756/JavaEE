package TeamWork.TW2022_03_15.vo;

/**
 * @author Wei
 *
 * 该类为author表对应的vo类：其属性要与表中的各字段相对应
 */


public class Author {

    int id;
    String au_name;
    String nation;

    public void setAu_name(String au_name) {
        this.au_name = au_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }


    public int getId() {
        return id;
    }

    public String getAu_name() {
        return au_name;
    }

    public String getNation() {
        return nation;
    }


    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", au_name='" + au_name + '\'' +
                ", nation='" + nation + '\'' +
                '}'+"\n";
    }
}

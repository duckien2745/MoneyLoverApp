package soict.kien.com.moneylover.object;


public class object {

    private String name;
    private String date;
    private String money;
    private String form_pay;
    private String category;
    private String note;
    private String sum_spend;
    private String sum_revenues;
    private String revenues;
    private String targets;

    public object() {

    }

    public object(String category, String sum_revenues, String sum_spend, String revenues, String date, String form_pay) {
        this.category = category;
        this.sum_revenues = sum_revenues;
        this.sum_spend = sum_spend;
        this.revenues = revenues;
        this.date = date;
        this.form_pay = form_pay;
    }

    public object(String name, String date, String money, String form_pay, String category, String note, String sum_spend, String sum_revenues, String revenues, String targets) {
        this.name = name;
        this.date = date;
        this.money = money;
        this.form_pay = form_pay;
        this.category = category;
        this.note = note;
        this.sum_spend = sum_spend;
        this.sum_revenues = sum_revenues;
        this.revenues = revenues;
        this.targets = targets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getForm_pay() {
        return form_pay;
    }

    public void setForm_pay(String form_pay) {
        this.form_pay = form_pay;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSum_spend() {
        return sum_spend;
    }

    public void setSum_spend(String sum_spend) {
        this.sum_spend = sum_spend;
    }

    public String getSum_revenues() {
        return sum_revenues;
    }

    public void setSum_revenues(String sum_recordsum_revenues) {
        this.sum_revenues = sum_revenues;
    }

    public String getRevenues() {
        return revenues;
    }

    public void setRevenues(String revenues) {
        this.revenues = revenues;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets;
    }
}

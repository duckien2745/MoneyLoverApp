package soict.kien.com.moneylover.object;


public class object {

    private String name;
    private String date;
    private Integer money;
    private String form_pay;
    private String category;
    private String note;
    private String sum_targets;
    private String sum_record;
    private String record;
    private String targets;

    public object() {

    }

    public object(String category, String sum_record, String sum_targets, String record, String date, String form_pay) {
        this.category = category;
        this.sum_record = sum_record;
        this.sum_targets = sum_targets;
        this.record = record;
        this.date = date;
        this.form_pay = form_pay;
    }

    public object(String name, String date, Integer money, String form_pay, String category, String note, String sum_targets, String sum_record, String record, String targets) {
        this.name = name;
        this.date = date;
        this.money = money;
        this.form_pay = form_pay;
        this.category = category;
        this.note = note;
        this.sum_targets = sum_targets;
        this.sum_record = sum_record;
        this.record = record;
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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
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

    public String getSum_targets() {
        return sum_targets;
    }

    public void setSum_targets(String sum_targets) {
        this.sum_targets = sum_targets;
    }

    public String getSum_record() {
        return sum_record;
    }

    public void setSum_record(String sum_record) {
        this.sum_record = sum_record;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets;
    }
}

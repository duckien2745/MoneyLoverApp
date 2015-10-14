package soict.kien.com.moneylover.object;

import java.util.ArrayList;

import soict.kien.com.moneylover.R;

/**
 * Created by DucKien2745 on 10/11/2015.
 */
public class CategoryList {

    public ArrayList<CategoryObj> listCategoryThu;
    public ArrayList<CategoryObj> listCategoryChi;
    private CategoryObj categoryObj;

    public CategoryList() {

        listCategoryChi = new ArrayList<>();
        listCategoryThu = new ArrayList<>();

        categoryObj = new CategoryObj(R.drawable.ic_muasam, "Mua sắm");
        listCategoryChi.add(categoryObj);
        categoryObj = new CategoryObj(R.drawable.ic_muasam, "Đi chơi");
        listCategoryChi.add(categoryObj);
        categoryObj = new CategoryObj(R.drawable.ic_thuong, "Tiền lương");
        listCategoryThu.add(categoryObj);
        categoryObj = new CategoryObj(R.drawable.ic_thuong, "Thưởng");
        listCategoryThu.add(categoryObj);
    }
}

package uz.mq.myday;

import java.util.ArrayList;

import uz.mq.myday.Models.CategoryModel;

public class Configs {

    public static ArrayList<CategoryModel> getCategorys(){
        ArrayList<CategoryModel> categoryModels = new ArrayList<>();
        categoryModels.add(new CategoryModel(0, "Family", R.drawable.ic_family));
        categoryModels.add(new CategoryModel(1, "Work", R.drawable.ic_work));
        categoryModels.add(new CategoryModel(2, "Hobby", R.drawable.ic_hobby));
        categoryModels.add(new CategoryModel(3, "Education", R.drawable.ic_education));
        categoryModels.add(new CategoryModel(4, "Sport & Health", R.drawable.ic_sport_health));
        categoryModels.add(new CategoryModel(5, "Entertainment", R.drawable.ic_entertainment));
        return categoryModels;
    }
}

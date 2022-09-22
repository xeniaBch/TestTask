package com.telran.task.tests;

import Model.CategoryObject;
import Model.FilterItem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchItemTest(){

        app.getSearch().selectMarket();
        app.getSearch().switchToNextTab(1);
        app.getSearch().selectExpressDepartment();
        app.getSearch().acceptCookies();
        app.getSearch().selectCategory(new CategoryObject()
                .setCategory("elektronika/23282330")
                .setSubcategory("smartfony-i-aksessuary/23282379"));
        app.getSearch().jumpDown();
        app.getSearch().filterItem(new FilterItem()
                .setValue1("20000")
                .setValue2("35000")
                .setBrand("Xiaomi"));
        app.getSearch().pause(10000);
        String itemName = app.getSearch().getItemNameByOrder(2);
        app.getSearch().typeInSearchInputField(itemName);
        app.getSearch().pause(10000);
        String foundName = app.getSearch().getItemNameByOrder(1);
        Assert.assertEquals(itemName, foundName);
    }


}

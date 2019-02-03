package com.practice.SalesTax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ItemCategoryMap
{
    Map<Category, Set<String>> itemListCategory;


    public ItemCategoryMap(  )
    {
        this.itemListCategory = new HashMap<>(  );
    }


    void addCategoryInMap( Category category, Set itemSet )
    {
        itemListCategory.put( category, itemSet );

    }


    boolean isCategoryMatchesItem( Category itemCategory, String itemName )
    {
        Set<String> itemNameSet = itemListCategory.get( itemCategory );
        if ( itemNameSet.contains( itemName ) )
            return true;
        return false;
    }


    Category getCategory( String itemName )
    {
        for ( Map.Entry<Category, Set<String>> entry : itemListCategory.entrySet() ) {

            if ( entry.getValue().contains( itemName ) )
                return entry.getKey();
        }
        return null;

    }


    public Map<Category, Set<String>> getItemListCategory()
    {
        return itemListCategory;
    }
   List<Item> setItemListCategory(List<Item> itemList){

        for(Item item:itemList){
            for(Map.Entry<Category,Set<String>> entry:itemListCategory.entrySet()){
                if(entry.getValue().contains( item.itemName )){
                    item.setItemCategory( entry.getKey() );
                }
            }
        }
        return itemList;
   }
}

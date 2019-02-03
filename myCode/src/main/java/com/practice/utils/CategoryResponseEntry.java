package com.practice.utils;

import java.util.Map;



    public class CategoryResponseEntry
    {
        private String language;
        private Map<String,Integer> categoryCount;

        public String getLanguage()
        {
            return language;
        }


        public void setLanguage( String language )
        {
            this.language = language;
        }


        public Map<String, Integer> getCategoryCount()
        {
            return categoryCount;
        }


        public void setCategoryCount( Map<String, Integer> categoryCount )
        {
            this.categoryCount = categoryCount;
        }
        public CategoryResponseEntry(String language,Map<String,Integer> categoryCount)
        {
            this.language =language;
            this.categoryCount = categoryCount;
        }


        @Override public String toString()
        {
            return "CategoryResponseEntry{" + "language='" + language + '\'' + ", categoryCount=" + categoryCount + '}';
        }
    }



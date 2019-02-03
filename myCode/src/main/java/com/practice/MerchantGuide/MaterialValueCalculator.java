package com.practice.MerchantGuide;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MaterialValueCalculator
{

    private static Map<String, Integer> conversionMap;
    private Map<String, String> materialRomanValueMap;
    private Map<String, Integer> materialArabicValueMap;

    static {
        conversionMap = new HashMap<>();
        conversionMap.put( "I", 1 );
        conversionMap.put( "V", 5 );
        conversionMap.put( "X", 10 );
        conversionMap.put( "L", 50 );
        conversionMap.put( "C", 100 );
        conversionMap.put( "D", 500 );
        conversionMap.put( "M", 1000 );

    }

    int getArabicFromRoman( String romanNumber )
    {
        int number = 0;
        for(int i=0;i<romanNumber.length()-1;i++){
            if(conversionMap.get( romanNumber.charAt( i ) )<conversionMap.get( romanNumber.charAt( i+1 ) )){
                number = number+conversionMap.get(romanNumber.charAt( i+1 ) )-conversionMap.get( romanNumber.charAt( i ) );

            }
            else{
                number = number+conversionMap.get( romanNumber.charAt( i ) );
            }
        }
        number=number+conversionMap.get( romanNumber.charAt( romanNumber.length()-1 ) );
        System.out.println(number);
        return number;
    }


    void addRomanValueOfMaterial( String materialName, String romanValue )
    {
        materialRomanValueMap.put( materialName, romanValue );

    }


    boolean parseMaterialList( List<String> materialNameList, int collectivePrice )
    {
        int currentValue = 0;
        int unKnowMaterialCount = 0;
        String unknownMaterialName=null;
        for(String materialName:materialNameList){

        }
        return true;
    }


    int addRomanValueOfFromMaterialList( List<String> materialNameList, int collectivePrice ) throws Exception
    {
        int currentValue = 0;
        int unknownMaterialCount = 0;
        for ( String materialName : materialNameList ) {
            if ( unknownMaterialCount > 1 ) {
                throw new Exception( "Cannt find the value from given materialNameList" );
            }
            if ( !materialRomanValueMap.containsKey( materialName ) ) {
                ++unknownMaterialCount;
            } else {
                currentValue = currentValue + getArabicFromRoman( materialRomanValueMap.get( materialName ) );
            }
        }

        return currentValue;
    }


}


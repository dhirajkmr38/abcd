import com.google.gson.Gson;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class GSONConverter
{
    public static void main( String arg[] ) throws FileNotFoundException
    {
        String jsonString = "[{ name:dhiraj , value :12 }]";
        // ObjectMapper obj = new ObjectMapper(  );
        Gson gson = new Gson();

        Map m = new LinkedHashMap( 4 );
        m.put( "street", "22 jump stree" );
        m.put( "pin", "9909019" );
        Map m1 = new HashMap();
        m1.put( "key", "value" );
        m.put( "additinal", m1 );
        m.put("detail",m1);
        String input = "[{\"address\":{\"street\":\"22 jump street\",\"pin\":\"9909019\",\"additinal\":{\"a\":\"b\"}},\"gender\":\"male\",\"name\":\"Dhiraj\",\"age\":\"25\"}]";
        List<Person> obj = gson.fromJson( input, List.class );
        System.out.println("_______________________________________________________");
        String output = gson.toJson( m );
        System.out.println(output);
        //  List<NameValuePojo> nm = gson.fromJson( jsonString, List<NameValuePojo>.class );


    }


}

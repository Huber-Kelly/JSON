

import com.google.gson.Gson;

public class JsonTest {

    public static void main(String args[]){
        Dog d1=new Dog();
        d1.getName();
        d1.getBreed();
        d1.getAge();
        d1.getColor();

        Gson json=new Gson();

        String response=json.toJson(d1);

        System.out.println(response);
    }
}

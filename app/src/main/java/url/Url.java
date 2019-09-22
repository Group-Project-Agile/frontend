package url;

import java.util.ArrayList;
import java.util.List;

import model.Bids;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {  public static final String BASE_URL ="http://10.0.2.2:3000/";
    // public static final String BASE_URL ="http://192.168.1.119:3000/";

    public static String Token, message;
    public static List<Bids> bidsList = new ArrayList<>();

    public static int userId;

    //Create an instance of Retrofit
    public static Retrofit getInstance()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Url.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
//192.168.1.119
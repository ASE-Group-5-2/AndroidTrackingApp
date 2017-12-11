package ase52.com.guestbook.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Drilon Blakqori on 11.12.17
 */

public class Network {

    private static final String BASE_URL = "";

    private static GuestBookService guestBookService;

    public static GuestBookService getGuestBookService() {
        if (guestBookService == null) {
            initGuestBookService();
        }
        return guestBookService;
    }

    private static void initGuestBookService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        guestBookService = retrofit.create(GuestBookService.class);
    }
}

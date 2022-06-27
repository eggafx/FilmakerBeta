package id.eggafx.beta.util;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Db {

    public DatabaseReference mainDb () {
        return FirebaseDatabase.getInstance().getReference(Data.MAIN_DB);
    }

}

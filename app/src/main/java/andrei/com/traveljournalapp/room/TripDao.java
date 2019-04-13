package andrei.com.traveljournalapp.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;

import andrei.com.traveljournalapp.models.Trip;


@Dao
public interface TripDao {

    @Insert
     void addTrip(Trip mTrip);

    @Delete
     void deleteTrip(Trip mTrip);
}

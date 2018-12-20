package com.fujiyama.pulp.mvvmpattern.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.fujiyama.pulp.mvvmpattern.data.local.db.dao.UserDao;
import com.fujiyama.pulp.mvvmpattern.data.model.db.User;

@Database(entities =  {
        User.class
}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    // list of daos

    public abstract UserDao userDao();
}

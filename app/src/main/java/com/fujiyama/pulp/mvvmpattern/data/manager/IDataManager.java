package com.fujiyama.pulp.mvvmpattern.data.manager;


import com.fujiyama.pulp.mvvmpattern.data.local.prefs.IPreferencesHelper;
import com.fujiyama.pulp.mvvmpattern.data.local.db.IDatabaseHelper;
import com.fujiyama.pulp.mvvmpattern.data.remote.IApiHelper;

public interface IDataManager extends IDatabaseHelper, IPreferencesHelper, IApiHelper {


}

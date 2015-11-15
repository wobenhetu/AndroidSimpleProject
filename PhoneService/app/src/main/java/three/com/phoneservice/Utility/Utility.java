package three.com.phoneservice.Utility;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import three.com.phoneservice.CallBack;
import three.com.phoneservice.Db.Db;
import three.com.phoneservice.Model.PeopleInfo;

/**
 * Created by Administrator on 2015/9/24.
 */
public class Utility {


    public synchronized static boolean handlePersonResponse(Db db, ArrayList<PeopleInfo> phoneInfos,CallBack callBack){

        boolean isover=false;
        if (TextUtils.isEmpty(HttpUtility.response))
            return isover;
        try{
            db.clear("Person");
            JSONObject jsonObject = new JSONObject(String.valueOf(HttpUtility.response));
            JSONArray jsonArray = jsonObject.getJSONArray("rows");
            Log.i("test","begin");
            db.savePerson(jsonArray,phoneInfos,callBack);
            Log.i("test","emd");
            isover=true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return isover;
    }

}

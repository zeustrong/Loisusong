package com.example.ztrong.loisusong.service.model.PostsChild;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import io.realm.RealmObject;

/**
 * Created by ztrong on 1/29/18.
 */
public class Info extends RealmObject {
    @SerializedName("href")
    public String href;
}

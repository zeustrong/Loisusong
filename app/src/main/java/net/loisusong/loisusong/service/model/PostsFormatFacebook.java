package net.loisusong.loisusong.service.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by android on 2/20/18.
 */


public class PostsFormatFacebook extends RealmObject {
    @SerializedName("height")
    public int height;

    @SerializedName("width")
    public int width;

    @SerializedName("picture")
    public String url;
}

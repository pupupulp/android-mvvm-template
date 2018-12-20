package com.fujiyama.pulp.mvvmpattern.data.remote;

import com.fujiyama.pulp.mvvmpattern.di.IApiInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApiHeader {

    private ProtectedApiHeader mProtectedApiHeader;
    private PublicApiHeader mPublicApiHeader;

    @Inject
    public ApiHeader(ProtectedApiHeader protectedApiHeader, PublicApiHeader publicApiHeader) {
        this.mProtectedApiHeader = protectedApiHeader;
        this.mPublicApiHeader = publicApiHeader;
    }

    public ProtectedApiHeader getProtectedApiHeader() {
        return mProtectedApiHeader;
    }

    public PublicApiHeader getPublicApiHeader() {
        return mPublicApiHeader;
    }

    public static final class ProtectedApiHeader {

        @Expose
        @SerializedName("access_toke")
        private String mAccessToken;

        @Expose
        @SerializedName("api_key")
        private String mApiKey;

        @Expose
        @SerializedName("user_id")
        private Long mUserId;

        public ProtectedApiHeader(/*String accessToken, String apiKey, Long userId*/) {
//            this.mAccessToken = accessToken;
//            this.mApiKey = apiKey;
//            this.mUserId = userId;
        }

        public String getmAccessToken() {
            return mAccessToken;
        }

        public void setmAccessToken(String mAccessToken) {
            this.mAccessToken = mAccessToken;
        }

        public String getmApiKey() {
            return mApiKey;
        }

        public void setmApiKey(String mApiKey) {
            this.mApiKey = mApiKey;
        }

        public Long getmUserId() {
            return mUserId;
        }

        public void setmUserId(Long mUserId) {
            this.mUserId = mUserId;
        }
    }

    public static final class PublicApiHeader {

        @Expose
        @SerializedName("api_key")
        private String mApiKey;

        @Inject
        public PublicApiHeader(@IApiInfo String apiKey) {
            this.mApiKey = apiKey;
        }

        public String getmApiKey() {
            return mApiKey;
        }

        public void setmApiKey(String mApiKey) {
            this.mApiKey = mApiKey;
        }
    }
}

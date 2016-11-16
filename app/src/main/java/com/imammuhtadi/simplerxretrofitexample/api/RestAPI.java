package com.imammuhtadi.simplerxretrofitexample.api;

import com.imammuhtadi.simplerxretrofitexample.model.DataResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by ADI on 28/09/2016.
 */

public interface RestAPI{

    @GET("Generators_Select_ByPopular?pageIndex=0&pageSize=12&days=7")
    Observable<DataResponse> loadListMeme();

}
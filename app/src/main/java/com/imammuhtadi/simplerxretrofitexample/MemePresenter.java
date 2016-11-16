package com.imammuhtadi.simplerxretrofitexample;

import com.imammuhtadi.simplerxretrofitexample.api.RestAPI;
import com.imammuhtadi.simplerxretrofitexample.api.RetrofitService;
import com.imammuhtadi.simplerxretrofitexample.model.DataResponse;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ADI on 16/11/2016.
 */

public class MemePresenter {

    private final MemeView view;
    private Subscription subscription;

    public MemePresenter(MemeView view){
        this.view = view;
    }

    public void getMeme(){
        final RestAPI service = RetrofitService.createRetrofitClient();
        subscription = service.loadListMeme()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DataResponse>() {
                    @Override
                    public void onCompleted() {
                        subscription.unsubscribe();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(DataResponse dataResponse) {
                        view.getMemeSuccess(dataResponse);
                    }
                });
    }
}

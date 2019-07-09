package com.chm.bledemo.bleutils.request;


public interface IRequestQueue<T> {
    void set(String key, T t);

    T get(String key);
}

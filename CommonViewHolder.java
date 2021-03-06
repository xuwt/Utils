package com.xuwt.framework.utils;

import android.support.v4.util.SparseArrayCompat;
import android.view.View;

/**
 * Created by xuwt on 2015/7/14.
 */
public class CommonViewHolder {

    /**
     * 用于获取ItemView中的控件
     *
     * @param view ItemView
     * @param id   要获取的控件的id
     * @param <T>  返回的控件的类型
     * @return 返回的控件
     */
    public static <T extends View> T get(View view, int id) {
        SparseArrayCompat<View> viewHolder = (SparseArrayCompat<View>) view.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArrayCompat<>();
            view.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView == null) {
            childView = view.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }
}

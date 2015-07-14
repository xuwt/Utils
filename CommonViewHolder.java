package com.xuwt.framework.utils;

import android.support.v4.util.SparseArrayCompat;
import android.view.View;

/**
 * Created by xuwt on 2015/7/14.
 */
public class CommonViewHolder {

    /**
     * ���ڻ�ȡItemView�еĿؼ�
     *
     * @param view ItemView
     * @param id   Ҫ��ȡ�Ŀؼ���id
     * @param <T>  ���صĿؼ�������
     * @return ���صĿؼ�
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

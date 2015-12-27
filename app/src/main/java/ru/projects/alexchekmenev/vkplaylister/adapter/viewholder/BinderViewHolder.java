package ru.projects.alexchekmenev.vkplaylister.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by creed on 15.10.15.
 */
public abstract class BinderViewHolder<T> extends RecyclerView.ViewHolder {
    public View root;

    public BinderViewHolder(View itemView) {
        super(itemView);
        root = itemView;
    }

    public abstract void bindItem(T item);
}

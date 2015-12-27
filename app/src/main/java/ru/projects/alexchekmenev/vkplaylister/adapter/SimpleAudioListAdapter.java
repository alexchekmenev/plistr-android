package ru.projects.alexchekmenev.vkplaylister.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.projects.alexchekmenev.vkplaylister.R;
import ru.projects.alexchekmenev.vkplaylister.adapter.viewholder.AudioViewHolder;
import ru.projects.alexchekmenev.vkplaylister.adapter.viewholder.BaseAudioViewHolder;

/**
 * Created by creed on 15.10.15.
 */
public class SimpleAudioListAdapter extends BaseAudioListAdapter {
    private static final String TAG = SimpleAudioListAdapter.class.getSimpleName();


    @Override
    protected BaseAudioViewHolder getAudioViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_audio, parent, false);
        return new AudioViewHolder(view);
    }
}

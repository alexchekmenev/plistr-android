package ru.projects.alexchekmenev.vkplaylister.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ru.projects.alexchekmenev.vkplaylister.R;
import ru.projects.alexchekmenev.vkplaylister.model.Audio;

/**
 * Created on 22.10.15.
 *
 * @author creed
 */
public abstract class BaseAudioViewHolder extends BinderViewHolder<Audio> {
    protected TextView artist;
    protected TextView title;
    public ImageView playButton;

    public BaseAudioViewHolder(View itemView) {
        super(itemView);
        artist = (TextView) itemView.findViewById(R.id.artist);
        title = (TextView) itemView.findViewById(R.id.title);
        playButton = (ImageView) itemView.findViewById(R.id.play_button);
    }

    @Override
    public void bindItem(Audio item) {
        artist.setText(item.getArtist());
        title.setText(item.getTitle());
    }
}

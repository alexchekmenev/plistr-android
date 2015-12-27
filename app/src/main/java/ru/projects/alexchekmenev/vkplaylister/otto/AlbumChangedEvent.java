package ru.projects.alexchekmenev.vkplaylister.otto;

import ru.projects.alexchekmenev.vkplaylister.model.Album;

/**
 * Created on 27.10.15.
 *
 * @author creed
 */
public class AlbumChangedEvent {
    private Album album;

    public AlbumChangedEvent(Album album) {
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }
}

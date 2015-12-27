package ru.projects.alexchekmenev.vkplaylister.otto;

import ru.projects.alexchekmenev.vkplaylister.model.Album;

/**
 * Created on 25.10.15.
 *
 * @author creed
 */
public class AlbumDeletedEvent {
    private Album album;

    public AlbumDeletedEvent(Album album) {
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }
}

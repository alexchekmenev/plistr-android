package ru.projects.alexchekmenev.vkplaylister.otto;

import ru.projects.alexchekmenev.vkplaylister.model.Album;

/**
 * Created on 26.10.15.
 *
 * @author creed
 */
public class AlbumCreatedEvent {
    private Album album;

    public AlbumCreatedEvent(Album album) {
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }
}

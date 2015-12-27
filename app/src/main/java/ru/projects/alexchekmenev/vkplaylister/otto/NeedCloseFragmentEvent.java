package ru.projects.alexchekmenev.vkplaylister.otto;

/**
 * Created on 26.10.15.
 *
 * @author creed
 */
public class NeedCloseFragmentEvent {
    private String tag;

    public NeedCloseFragmentEvent(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}

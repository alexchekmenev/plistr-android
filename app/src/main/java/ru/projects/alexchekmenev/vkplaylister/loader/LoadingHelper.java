package ru.projects.alexchekmenev.vkplaylister.loader;

/**
 * Created on 26.10.15.
 *
 * @author creed
 */
public abstract class LoadingHelper {
    public void onStartLoading() {
    }
    public boolean needLoading() {
        return true;
    }
}

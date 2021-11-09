package org.reactnative.maskedview;


import android.text.TextUtils;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNCMaskedViewManager extends ViewGroupManager<RNCMaskedView> {
    private static final String REACT_CLASS = "RNCMaskedView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected RNCMaskedView createViewInstance(ThemedReactContext themedReactContext) {
        return new RNCMaskedView(themedReactContext);
    }

    @ReactProp(name = "androidRenderingMode")
    public void setAndroidRenderingMode(RNCMaskedView view, String renderingMode) {
        if (renderingMode != null) {
            view.setRenderingMode(renderingMode);
        }
    }

    @ReactProp(name = "androidPorterDuffMode")
    public void setAndroidPorterDuffMode(RNCMaskedView view, String mode) {
        if (!TextUtils.isEmpty(mode)) {
            view.setPorterDuffMode(mode);
        }
    }
}

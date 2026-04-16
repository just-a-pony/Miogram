package net.ponyworkshop.miogram;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ViewSwitcher;

import org.telegram.ui.ActionBar.SimpleTextView;

public class SimpleTextViewSwitcher extends ViewSwitcher {

    public SimpleTextViewSwitcher(Context context) {
        super(context);
    }

    public void setText(CharSequence text, boolean animated) {
        if (!TextUtils.equals(text, getCurrentView().getText())) {
            if (animated) {
                getNextView().setText(text);
                showNext();
            } else {
                getCurrentView().setText(text);
            }
        }
    }

    @Override
    public SimpleTextView getCurrentView() {
        return (SimpleTextView) super.getCurrentView();
    }

    @Override
    public SimpleTextView getNextView() {
        return (SimpleTextView) super.getNextView();
    }

    public void setTextColor(int color) {
        getCurrentView().setTextColor(color);
        getNextView().setTextColor(color);
    }

    public float getExactWidth() {
        return getCurrentView().getExactWidth();
    }
}
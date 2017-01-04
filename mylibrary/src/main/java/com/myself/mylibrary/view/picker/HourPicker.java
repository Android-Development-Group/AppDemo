package com.myself.mylibrary.view.picker;

import android.app.Activity;

/**
 * 小时选择器
 * <p>
 * Created By guchenkai
 */
public class HourPicker extends OptionPicker {
    public enum Mode {
        //24小时
        HOUR_OF_DAY,
        //12小时
        HOUR
    }

    public HourPicker(Activity activity) {
        this(activity, Mode.HOUR_OF_DAY);
    }

    public HourPicker(Activity activity, Mode mode) {
        super(activity, new String[]{});
        if (mode.equals(Mode.HOUR)) {
            for (int i = 1; i <= 12; i++) {
                options.add(i < 10 ? "0" + i : "" + i);
            }
        } else {
            for (int i = 0; i < 24; i++) {
                options.add(i < 10 ? "0" + i : "" + i);
            }
        }
    }
}
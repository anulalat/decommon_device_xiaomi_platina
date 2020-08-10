package com.xiaomi.morphparts;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.Preference.OnPreferenceChangeListener;

public class Dimmer implements OnPreferenceChangeListener, Controller {

    private Context mContext;

    public Dimmer(Context context) {
        mContext = context;
    }

    public static String getFile() {
        if (FileUtils.fileWritable(BACKLIGHT_DIMMER_PATH)) {
            return BACKLIGHT_DIMMER_PATH;
        }
        return null;
    }

    public static boolean isCurrentlyEnabled(Context context) {
        return FileUtils.getFileValueAsBoolean(getFile(), false);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object value) {
        final String key = preference.getKey();
        switch (key) {
            case PREF_BACKLIGHT_DIMMER:
                FileUtils.setValue(BACKLIGHT_DIMMER_PATH, (boolean) value);
                break;

            default:
                break;
        }
        return true;
    }
}

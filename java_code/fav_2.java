/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAV
 */
public class fav_2
extends fat_1 {
    public static final String TAG = "widgetAppearanceStateEquals";
    public static final String a = "hasState";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.e == null) {
            return false;
        }
        String string = this.getStateRelated();
        return string != null && string.equalsIgnoreCase(String.valueOf(this.e));
    }
}


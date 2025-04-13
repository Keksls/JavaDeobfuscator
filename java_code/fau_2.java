/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAU
 */
public class fau_2
extends fat_1 {
    public static final String TAG = "widgetAppearanceStateContains";
    public static final String a = "stateContains";

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
        return string != null && string.toLowerCase().contains(String.valueOf(this.e).toLowerCase());
    }
}


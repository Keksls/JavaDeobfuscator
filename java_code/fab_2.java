/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAB
 */
public class fab_2
extends faq_2 {
    public static final String TAG = "isNotNull";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        return object != null;
    }

    public faq_2 a() {
        fab_2 fab_22 = new fab_2();
        this.copyElement(fab_22);
        return fab_22;
    }
}


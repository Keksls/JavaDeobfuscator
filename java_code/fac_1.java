/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAC
 */
public class fac_1
extends faq_2 {
    public static final String TAG = "isNull";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        return object == null;
    }

    public faq_2 a() {
        fac_1 fac_12 = new fac_1();
        this.copyElement(fac_12);
        return fac_12;
    }
}


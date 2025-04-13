/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAy
 */
public class fay_1
extends faj_1 {
    public static final String TAG = "Not";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        if (this.q != null) {
            return !this.q.isValid(object);
        }
        return false;
    }

    public faq_2 a() {
        fay_1 fay_12 = new fay_1();
        this.copyElement(fay_12);
        return fay_12;
    }
}


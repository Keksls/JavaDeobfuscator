/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAE
 */
public class fae_2
extends fax_1 {
    public static final String TAG = "Or";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        for (faq_2 faq_22 : this.a) {
            if (!faq_22.isValid(object)) continue;
            return true;
        }
        return false;
    }

    public faq_2 a() {
        fae_2 fae_22 = new fae_2();
        this.copyElement(fae_22);
        return fae_22;
    }
}


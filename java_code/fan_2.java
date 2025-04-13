/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAn
 */
public class fan_2
extends fax_1 {
    public static final String TAG = "And";

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
            if (faq_22.isValid(object)) continue;
            return false;
        }
        return true;
    }

    public faq_2 a() {
        fan_2 fan_22 = new fan_2();
        this.copyElement(fan_22);
        return fan_22;
    }

    public Object getEncapsulatedObject() {
        return null;
    }
}


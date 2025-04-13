/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAA
 */
public class faa_2
extends faq_2 {
    public static final String TAG = "isNotEqual";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        if (object == null && (this.e == null || this.e.equals("null"))) {
            return false;
        }
        if (object instanceof String) {
            String string = (String)object;
            return !string.equalsIgnoreCase((String)this.e);
        }
        if (object instanceof Integer) {
            return Co.c(object) != Co.c(this.e);
        }
        if (object instanceof Float) {
            return Co.e(object) != Co.e(this.e);
        }
        if (object instanceof Double) {
            return Co.d(object) != Co.d(this.e);
        }
        if (object instanceof Short) {
            return Co.h(object) != Co.h(this.e);
        }
        if (object instanceof Long) {
            return Co.f(object) != Co.f(this.e);
        }
        if (object instanceof Byte) {
            return Co.g(object) != Co.g(this.e);
        }
        return object != this.e;
    }
}


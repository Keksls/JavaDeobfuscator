/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAo
 */
public class fao_2
extends faj_1 {
    public static final String TAG = "BitwiseOperation";
    public static final String a = "and";
    public static final String b = "or";
    public static final String c = "not";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        Number number = null;
        if (this.d != null) {
            if (this.d.equalsIgnoreCase(a)) {
                if (object instanceof Integer) {
                    number = Co.c(object) & Co.c(this.e);
                } else if (object instanceof Short) {
                    number = Co.h(object) & Co.h(this.e);
                } else if (object instanceof Long) {
                    number = Co.f(object) & Co.f(this.e);
                }
            }
            if (this.d.equalsIgnoreCase(b)) {
                if (object instanceof Integer) {
                    number = Co.c(object) | Co.c(this.e);
                } else if (object instanceof Short) {
                    number = Co.h(object) | Co.h(this.e);
                } else if (object instanceof Long) {
                    number = Co.f(object) | Co.f(this.e);
                }
            }
        }
        return this.q.isValid(number);
    }
}


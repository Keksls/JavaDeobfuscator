/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAH
 */
public class fah_1
extends faj_1 {
    public static final String TAG = "StringCondition";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        if (!(object instanceof String) || this.d == null) {
            return false;
        }
        String string = (String)object;
        if (this.d.equalsIgnoreCase("length")) {
            return this.q != null && this.q.isValid(string.length());
        }
        if (this.d.equalsIgnoreCase("startsWith")) {
            if (!(this.e instanceof String)) {
                return false;
            }
            boolean bl = string.startsWith((String)this.e);
            return this.q == null ? bl : this.q.isValid(bl);
        }
        if (this.d.equalsIgnoreCase("endsWith")) {
            if (!(this.e instanceof String)) {
                return false;
            }
            boolean bl = string.endsWith((String)this.e);
            return this.q == null ? bl : this.q.isValid(bl);
        }
        return false;
    }

    public faq_2 a() {
        fah_1 fah_12 = new fah_1();
        this.copyElement(fah_12);
        return fah_12;
    }
}


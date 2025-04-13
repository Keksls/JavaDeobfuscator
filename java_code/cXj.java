/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

class cXj
implements ajh_1 {
    public static final String a = "bufferingDesc";
    public static final String b = "modulationColor";
    float d = -1.0f;
    String e;
    String f;
    private final cXk g = new cXk(this);

    cXj() {
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            if (this.d < 0.0f || this.d == 100.0f) {
                return null;
            }
            return this.e;
        }
        if (b.equals(string)) {
            return this.f;
        }
        return null;
    }

    public cXk a() {
        return this.g;
    }
}


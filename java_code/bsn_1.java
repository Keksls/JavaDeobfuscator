/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bsn
 */
public class bsn_1
implements ajh_1 {
    public static final String a = "id";
    public static final String b = "name";
    private final long e;
    private final String f;
    final /* synthetic */ bsm_1 d;

    public bsn_1(bsm_1 bsm_12, long l, String string) {
        this.d = bsm_12;
        this.e = l;
        this.f = string;
    }

    public long a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e;
        }
        if (string.equals(b)) {
            return this.f;
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bsn_1 bsn_12 = (bsn_1)object;
        return this.e == bsn_12.e;
    }

    public int hashCode() {
        return (int)(this.e ^ this.e >>> 32);
    }
}


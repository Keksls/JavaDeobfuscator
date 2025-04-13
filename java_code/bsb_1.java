/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from bsB
 */
class bsb_1
implements ajh_1 {
    public static final String a = "id";
    public static final String b = "name";
    public static final String d = "granted";
    private final long f;
    private final String g;
    private final String[] h = new String[]{"id", "name", "granted"};
    final /* synthetic */ bsa_1 e;

    bsb_1(bsa_1 bsa_12, ffm ffm2) {
        this.e = bsa_12;
        this.g = ffm2.b();
        this.f = ffm2.a();
    }

    @Override
    public String[] d() {
        return this.h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(d)) {
            return this.e.j.a(this.f).a(ffk.a(this.e.h));
        }
        return null;
    }

    public void a() {
        fis_1.a().a((ajf_1)this, d);
    }

    public String toString() {
        return "IndividualPermissionView{m_id=" + this.f + ", m_name='" + this.g + "', FIELDS=" + Arrays.toString(this.h) + "}";
    }
}


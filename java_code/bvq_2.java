/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvq
 */
public class bvq_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "id";
    private long d;
    private String e;

    public bvq_2(long l, String string) {
        this.d = l;
        this.e = string;
    }

    public String a() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public long b() {
        return this.d;
    }

    public void a(long l) {
        this.d = l;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e;
        }
        if (string.equals(b)) {
            return this.d;
        }
        return null;
    }

    @Override
    public String[] d() {
        return null;
    }
}


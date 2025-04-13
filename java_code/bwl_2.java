/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwL
 */
public class bwl_2
implements ajh_1 {
    public static final String a = "xp";
    public static final String b = "level";
    public static final String d = "percentageInLevel";
    public static final String e = "previousPercentageInLevel";
    public static final String f = "premiumPercentageInLevel";
    public static final String[] g = new String[]{"xp", "level", "percentageInLevel", "previousPercentageInLevel", "premiumPercentageInLevel"};
    private final oj_0 h;
    private final short i;
    private final short j;
    private final String k;
    private final float l;
    private final float m;
    private final float n;

    public bwl_2(oj_0 oj_02, short s2, long l, Long l2, int n) {
        this(oj_02, s2, s2, l, l2, -1L, n);
    }

    public bwl_2(oj_0 oj_02, short s2, long l, Long l2, long l3, int n) {
        this(oj_02, s2, s2, l, l2, l3, n);
    }

    public bwl_2(oj_0 oj_02, short s2, short s3, long l, Long l2, int n) {
        this(oj_02, s2, s3, l, l2, -1L, n);
    }

    public bwl_2(oj_0 oj_02, short s2, short s3, long l, Long l2, long l3, int n) {
        this.h = oj_02;
        this.i = s2;
        this.j = s3;
        this.k = this.a(s2, l);
        this.l = this.b(s2, l);
        if (l3 != -1L && l2 != null) {
            long l4 = l - l2 + l3;
            short s4 = this.h.a(l4);
            long l5 = s4 > s2 ? this.h.a((int)s4) : l4;
            this.n = this.b(s2, l5);
        } else {
            this.n = 0.0f;
        }
        this.m = l2 == null ? this.l : (l2 < 0L ? this.l : (l2 == -1L || n > 0 ? -1.0f : this.b(s2, l - l2)));
    }

    private String a(short s2, long l) {
        long l2 = this.h.b(s2);
        short s3 = this.h.a(l);
        long l3 = s3 > s2 ? l2 : this.h.c(l);
        return bae.h().a(l3) + "/" + bae.h().a(l2);
    }

    private float b(short s2, long l) {
        return this.h.a(s2, l);
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (a.equals(string)) {
            return this.k;
        }
        if (b.equals(string)) {
            return this.j;
        }
        if (d.equals(string)) {
            return Float.valueOf(this.l);
        }
        if (e.equals(string)) {
            return Float.valueOf(this.m);
        }
        if (f.equals(string)) {
            return Float.valueOf(this.n);
        }
        return null;
    }

    public short a() {
        return this.i;
    }
}


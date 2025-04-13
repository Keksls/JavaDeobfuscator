/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHO
 */
public class bho_0
implements ajh_1 {
    public static final String a = "duration";
    public static final String b = "selected";
    public static final String d = "taxFactor";
    private final feu_0 f;
    private boolean g;
    public final String[] e = new String[]{"duration", "selected", "taxFactor"};

    public bho_0(feu_0 feu_02, boolean bl) {
        this.f = feu_02;
        this.g = bl;
    }

    public String a() {
        long l = this.f.e / 3600000L;
        long l2 = l / 24L;
        long l3 = l % 24L;
        return bae.h().a("remainingDurationShortMonthDayHour", 0, l2, l3);
    }

    public feu_0 b() {
        return this.f;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    @Override
    public String[] d() {
        return this.e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return bae.h().a("desc.taxFactor", (int)(this.f.g * 100.0));
        }
        return null;
    }

    public String toString() {
        return this.a();
    }
}


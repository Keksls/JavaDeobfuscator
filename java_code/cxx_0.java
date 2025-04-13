/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXx
 */
final class cxx_0
implements ajh_1,
Runnable {
    private long e = 120000L;
    private final long f = 1000L;
    public static final long a = 120000L;
    public static final String b = "remainingTimeField";
    public final String[] d = new String[]{"remainingTimeField"};

    public void a() {
        ado_1.a().a(this, 1000L, -1);
    }

    public void b() {
        fpm_0.b().o("sessionTimerDialog");
        ado_1.a().b(this);
    }

    @Override
    public void run() {
        if (this.e <= 0L) {
            return;
        }
        this.e -= 1000L;
        fsM fsM2 = (fsM)fpm_0.b().h().d("sessionTimerDialog").a("text");
        if (this.e <= 30000L) {
            fsM2.setColor(azf_2.h, "text");
        } else if (this.e <= 60000L) {
            fsM2.setColor(new azf_2(1.0f, 0.5f, 0.0f, 1.0f), "text");
        }
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public String[] d() {
        return this.d;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.e > 0L ? this.a(this.e / 1000L) : null;
        }
        return null;
    }

    private String a(long l) {
        long l2 = l / 60L;
        if (l2 > 0L) {
            long l3 = l - 60L * l2;
            return String.format("%d:%s", l2, l3 > 9L ? Long.valueOf(l3) : "0" + l3);
        }
        return String.valueOf(l > 9L ? Long.valueOf(l) : "0" + l);
    }
}


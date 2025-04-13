/*
 * Decompiled with CFR 0.152.
 */
class bUJ
implements ajh_1 {
    public static final String a = "lastTimerChange";
    public static final String b = "formatedLastTimerChange";
    public static final String d = "iconUrl";
    public static final String e = "remainingTime";
    public static final String f = "description";
    public final String[] g = new String[]{"description", "iconUrl", "remainingTime"};
    private long i;
    private boolean j = true;
    final /* synthetic */ bUI h;

    bUJ(bUI bUI2) {
        this.h = bUI2;
    }

    @Override
    public String[] d() {
        return this.g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i;
        }
        if (string.equals(b)) {
            if (this.i == 0L) {
                return null;
            }
            boolean bl = this.i < 0L;
            String string2 = (bl ? "-" : "") + wa_0.c(ww_0.a(Math.abs(this.i) / 1000L));
            bUI.b.info((Object)("Formated last timer : " + string2));
            return string2;
        }
        if (string.equals(d)) {
            return azs_0.a().m(-1);
        }
        if (string.equals(f)) {
            return bae.h().a("nation.pvp.prisonerOf", this.a());
        }
        if (string.equals(e)) {
            if (this.j) {
                return "-";
            }
            ww_0 ww_02 = ww_0.a(this.h.g() / 1000L);
            return wa_0.c(ww_02);
        }
        return null;
    }

    private String a() {
        return bae.h().a(39, (long)bUI.a(this.h).B(), new Object[0]);
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void a(long l) {
        this.i = l;
        bUI.b.info((Object)("LastTimerChange : " + l));
        fis_1.a().a((ajf_1)this, a, b);
    }
}


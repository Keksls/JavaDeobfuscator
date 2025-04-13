/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bRz
implements ajh_1 {
    private static final String b = "name";
    private static final String d = "familyIconUrl";
    private static final String e = "familyIconStyle";
    private static final String f = "gaugeColor";
    private static final String g = "currentValue";
    private static final String h = "currentValuePerc";
    private static final String i = "currentValueText";
    private static final String j = "isOnOverflow";
    private static final String k = "protectorInterval";
    private static final String l = "isProtector";
    private static final String m = "maxValueText";
    private static final String n = "wakfuGaugeStyle";
    private static final String o = "numberInZoneText";
    private static final String p = "intervalText";
    private static final String[] q = new String[]{"name", "gaugeColor", "currentValue", "familyIconUrl", "currentValueText", "protectorInterval", "maxValueText", "isProtector", "wakfuGaugeStyle", "numberInZoneText", "intervalText"};
    protected static final Logger a = Logger.getLogger(bRz.class);
    private final bRw r;
    private final int s;
    private final int t;
    private final int u;
    private bRx v;
    private boolean w = false;

    public bRz(bRw bRw2, int n, aeo_2 aeo_22, int n2, int n3) {
        this.r = bRw2;
        this.s = n;
        this.t = n2;
        this.u = n3;
        if (aeo_22 == null && bwa_2.X.b() != -1) {
            aeo_22 = bwa_2.X.b(n);
        }
        this.v = aeo_22 == null ? null : new bRx(aeo_22, this.u);
    }

    @Override
    public String[] d() {
        return q;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.b();
        }
        if (string.equals(k)) {
            return this.v;
        }
        if (string.equals(g)) {
            return Float.valueOf(this.a());
        }
        if (string.equals(h)) {
            return new fjv_1(this.a() * 100.0f);
        }
        if (string.equals(i)) {
            return this.t > 100 ? bRy.a(this.t) : this.t;
        }
        if (string.equals(m)) {
            return this.u;
        }
        if (string.equals(j)) {
            return this.t > this.u;
        }
        if (string.equals(e)) {
            if (this.r.b()) {
                return null;
            }
            switch (this.s) {
                case 10: {
                    return "PlantsIcon";
                }
                case 1: {
                    return "TreesIcon";
                }
                case 2: {
                    return "FarmingIcon";
                }
            }
            return "";
        }
        if (string.equals(d)) {
            if (!this.r.b()) {
                return null;
            }
            try {
                return String.format(azs_0.a().a("monstersFamily"), this.s);
            }
            catch (gm_0 gm_02) {
                a.error((Object)"PropertyException during getFieldValue for FAMILY_ICON_URL_FIELD", (Throwable)gm_02);
            }
        } else {
            if (string.equals(l)) {
                return this.e();
            }
            if (string.equals(n)) {
                float f2 = this.a();
                if ((double)f2 > 0.65) {
                    return "CurrentWakfuBig";
                }
                if ((double)f2 > 0.35) {
                    return "CurrentStasisBig";
                }
                return "CurrentStasisBig";
            }
            if (string.equals(o)) {
                return bae.h().a("wakfu.currentResourceValueInZone", this.b());
            }
            if (string.equals(p)) {
                if (this.v == null) {
                    return null;
                }
                return bae.h().a("wakfu.protectorInterval", this.b(), this.v.a(), this.v.b());
            }
        }
        return null;
    }

    public float a() {
        return (float)Math.min(this.t, this.u) / (float)this.u;
    }

    public String b() {
        String string = this.r.b() ? bae.h().a(38, (long)this.s, new Object[0]) : bae.h().a(37, (long)this.s, new Object[0]);
        if (string != null && !string.isEmpty()) {
            return string;
        }
        return "Famille inconnue";
    }

    public boolean c() {
        return this.v != null;
    }

    public void a(aeo_2 aeo_22) {
        this.v = new bRx(aeo_22, this.u);
        fis_1.a().a((ajf_1)this, q);
    }

    public boolean e() {
        return this.v != null && this.v.a(this.t);
    }

    public int f() {
        return this.v == null ? -1 : this.t - this.v.b();
    }

    public bRw g() {
        return this.r;
    }

    public int h() {
        return this.s;
    }

    public void a(boolean bl) {
        this.w = bl;
    }

    public boolean i() {
        return this.w;
    }

    public int j() {
        return this.t;
    }

    public String toString() {
        return "(familyId=" + this.s + ", currentValue=" + this.t + ")";
    }
}


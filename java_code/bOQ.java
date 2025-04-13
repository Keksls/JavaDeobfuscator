/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bOQ
implements ajh_1 {
    private static final Logger h = Logger.getLogger(bOQ.class);
    private erp_2 i;
    private static final bOQ j = new bOQ(null);
    public static final String a = "capturedCreatures";
    public static final String b = "maxSize";
    public static final String d = "selectedCreature";
    public static final String e = "selectedCreatureIndex";
    public static final String f = "currentLeadershipCapacity";
    public static final String[] g = new String[]{"capturedCreatures", "maxSize", "selectedCreature", "selectedCreatureIndex", "currentLeadershipCapacity"};

    public static bOQ a() {
        return j;
    }

    public void a(erp_2 erp_22) {
        this.i = erp_22;
    }

    public bOQ(erp_2 erp_22) {
        this.i = erp_22;
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (this.i == null) {
            return null;
        }
        if (string.equals(a)) {
            eqy_1[] eqy_1Array = new eqy_1[10];
            int n = 0;
            for (byte by = 0; by < (byte)eqy_1Array.length; by = (byte)(by + 1)) {
                eqy_1Array[n++] = this.i.a((int)by);
            }
            return eqy_1Array;
        }
        if (string.equals(b)) {
            return 10;
        }
        if (string.equals(d)) {
            return this.i.a();
        }
        if (string.equals(e)) {
            return this.i.c();
        }
        if (string.equals(f)) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12.bz() != null) {
                blx_1 blx_12 = bmr_12.bz().A().H();
                if (blx_12 == null) {
                    return Math.max(0, bmr_12.a_(eps_0.k).a() - bmr_12.D_());
                }
                if (blx_12.bp() && blx_12.gO() == epn_2.d.s()) {
                    return Math.max(0, blx_12.a_(eps_0.k).a() - blx_12.D_());
                }
            }
            return Math.max(0, bmr_12.a_(eps_0.k).a() - bmr_12.D_());
        }
        return null;
    }

    public void b() {
        fis_1.a().a((ajf_1)this, a);
    }

    public void c() {
        try {
            fis_1.a().a((ajf_1)this, d, e);
        }
        catch (Exception exception) {
            h.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void e() {
        fis_1.a().a((ajf_1)this, f);
    }

    public void f() {
        if (!fpm_0.b().q("osamodasSymbiotDialog")) {
            cxu_0.a().e();
        }
        fis_1.a().a("osamodasSymbiotCreatureCapturedState", true);
    }
}


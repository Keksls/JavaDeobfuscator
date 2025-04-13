/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eMj
 */
public class emj_2 {
    private static final Logger b = Logger.getLogger(emj_2.class);
    private static final aff_1 c = new aff_1();
    private static final aff_1 d = new aff_1();
    private static final int e = 6;
    public static final float a = 0.8f;

    public static boolean a(apq_2 apq_22, elm_0 elm_02, int n, int n2, short s2) {
        return emj_2.a(apq_22, elm_02.g(), n, n2, s2, elm_02.a(n, n2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(apq_2 apq_22, tg_0 tg_02, int n, int n2, short s2, apq_2 apq_23) {
        boolean bl;
        if (apq_22 == null) {
            return false;
        }
        int n3 = apq_22.G();
        int n4 = apq_22.H();
        short s3 = apq_22.I();
        int n5 = 6;
        if (apq_23 != null) {
            n5 = (short)((float)apq_23.W() * 0.8f);
        }
        if (apq_22 instanceof ti_0) {
            tg_02.d((ti_0)((Object)apq_22));
        }
        try {
            bl = emj_2.a(n3, n4, s3, apq_22.W(), n, n2, s2, n5, tg_02);
        }
        catch (Exception exception) {
            b.error((Object)"Exception levee", (Throwable)exception);
            bl = false;
        }
        finally {
            tg_02.l();
        }
        return bl;
    }

    public static boolean a(int n, int n2, short s2, int n3, int n4, int n5, short s3, yy_0 yy_02) {
        return emj_2.a(n, n2, s2, n3, n4, n5, s3, 6, yy_02);
    }

    public static boolean a(int n, int n2, short s2, int n3, int n4, int n5, short s3, int n6, yy_0 yy_02) {
        short s4 = (short)((float)n3 * 0.8f);
        if (s4 < 0) {
            return true;
        }
        c.c(n, n2, s2);
        c.a((short)(c.f() + s4));
        d.c(n4, n5, s3);
        d.a((short)(d.f() + n6));
        ui_0 ui_02 = ui_0.a();
        ui_02.a(yy_02);
        ui_02.a(c.d(), c.e(), c.f());
        ui_02.b(n4, n5, s3);
        boolean bl = ui_02.b();
        if (bl) {
            ui_02.release();
            return true;
        }
        if (n6 == 0) {
            ui_02.release();
            return false;
        }
        ui_02.b(d.d(), d.e(), d.f());
        boolean bl2 = ui_02.b();
        ui_02.release();
        return bl2;
    }
}


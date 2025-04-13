/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;

/*
 * Renamed from bea
 */
class bea_1
implements asb_2<aRm> {
    final /* synthetic */ bdz_1 a;

    bea_1(bdz_1 bdz_12) {
        this.a = bdz_12;
    }

    public void a(aRm aRm2) {
        Sd sd = new Sd(aRm2.c());
        String string = aRm2.e();
        String string2 = aRm2.d();
        if (!Strings.isNullOrEmpty((String)string)) {
            sd.a(string);
        }
        if (!Strings.isNullOrEmpty((String)string2)) {
            sd.b(string2);
        }
        Sf.a.a(sd);
        for (arn_0 arn_02 : aRm2.g()) {
            apc_2 apc_22;
            int n = arn_02.a();
            try {
                apc_22 = eyS.c(arn_02.b());
            }
            catch (Exception exception) {
                bdz_1.a.error((Object)("[LD] Impossible de compiler le crit\u00e8re " + arn_02.b() + " sur la r\u00e9ponse " + n + " du dialog " + aRm2.c()), (Throwable)exception);
                continue;
            }
            Se se = new Se(n, apc_22, (byte)arn_02.c(), arn_02.d());
            sd.a(se);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRm)asu_22);
    }
}


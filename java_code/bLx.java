/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class bLx {
    private static final Logger a = Logger.getLogger(bLx.class);
    static final float[] b = azf_2.e.v();
    private static final int c = 93606;

    bLx() {
    }

    static void a(ccy_2 ccy_22, ArrayList<fjg_1> arrayList) {
        ccy_22.a(new bLy(arrayList, ccy_22));
    }

    static String a(etz_2 etz_22) {
        String string = bae.h().a(126, (long)etz_22.a(), new Object[0]);
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)string);
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = eta_2.f(eta_2.c(etz_22));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        etz_22.a(new bLz(arrayList));
        if (!arrayList.isEmpty()) {
            boolean bl;
            boolean bl2 = bl = eta_2.e(etz_22) == etf_2.c;
            if (!bl) {
                ani_22.i().a(bmi_0.b);
            }
            for (String string2 : arrayList) {
                ani_22.m().a((CharSequence)string2);
            }
        }
        return ani_22.r();
    }

    static fjh_1 b(etz_2 etz_22) {
        etf_2 etf_22 = eta_2.e(etz_22);
        switch (etf_22) {
            case a: {
                return bLs.l;
            }
            case b: {
                return bLs.m;
            }
            case c: {
                return bLs.n;
            }
        }
        a.error((Object)("etat du batiement incorrect " + etf_22));
        return null;
    }

    static void a(ccy_2 ccy_22, fsS fsS2) {
        blk_0 blk_02 = new blk_0();
        fsS2.setMapId(ccy_22.o());
        fsS2.setMapDisplayer(blk_02);
        bLx.a(ccy_22, blk_02.b());
        bLx.a(blk_02);
        bLx.b(ccy_22, fsS2);
    }

    private static void a(ccy_2 ccy_22, EntityGroup entityGroup) {
        cco_1 cco_12 = cco_1.a;
        cks_2 cks_22 = new cks_2();
        cks_22.onCheckOut();
        cks_22.a(ccy_22, cco_12);
        cks_22.setCurrentLayer(fks_0.d);
        cks_22.getEntities(entityGroup);
        bLx.a(entityGroup, cks_22);
        cks_22.release();
    }

    private static void a(blk_0 blk_02) {
        ays_2 ays_22 = aca_0.a().a(93606);
        ayo_2 ayo_22 = new ayo_2(ays_22, 0, 0, ays_22.a(0).a(), ays_22.a(0).b());
        azf_2 azf_22 = new azf_2(0, 0, 1, 1);
        blk_02.a(ayo_22, azf_22);
    }

    private static void a(EntityGroup entityGroup, cks_2 cks_22) {
        afq_2 afq_22 = cks_22.getScreenCenter();
        ayx_2 ayx_22 = new ayx_2();
        ayx_22.a(afq_22.a(), afq_22.b(), 0.0f);
        entityGroup.D().a(0, ayx_22);
    }

    private static void b(ccy_2 ccy_22, fsS fsS2) {
        int n = ccy_22.j() * 9;
        int n2 = ccy_22.k() * 9;
        int n3 = n / 2 + ccy_22.h() * 9;
        int n4 = n2 / 2 + (ccy_22.i() - 3) * 9;
        fsS2.setForceDisplayEntity(true);
        int n5 = -((int)ahg_0.b(n3, n4));
        int n6 = -((int)ahg_0.c(n3, n4));
        int n7 = Math.max(n, n2);
        int n8 = (int)((float)n7 * 86.0f);
        fsS2.setMapRect(n5, n6, n8, n8 / 2);
    }
}


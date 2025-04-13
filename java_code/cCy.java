/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cCy
implements adx_1<cxv_2> {
    private static final Logger a = Logger.getLogger(cCy.class);

    @Override
    public boolean a(cxv_2 cxv_22) {
        zk_2 zk_22 = cxv_22.b();
        for (zg_2 zg_22 : zk_22.f()) {
            if (bNT.f().d(zg_22.e(), zg_22.g())) {
                a.error((Object)("Resource " + zg_22.c() + " at " + zg_22.e() + ":" + zg_22.g() + ":" + zg_22.i() + " already exist"));
                continue;
            }
            bNI bNI2 = (bNI)bNJ.a().a(zg_22.c());
            bNK bNK2 = bNI2 instanceof bNF ? bNG.a(zg_22.e(), zg_22.g(), (short)zg_22.i(), zg_22.c(), (byte)zg_22.k(), false, zg_22.m(), zg_22.o(), zg_22.q()) : bNK.b(zg_22.e(), zg_22.g(), (short)zg_22.i(), zg_22.c(), (byte)zg_22.k(), false, zg_22.m(), zg_22.o(), zg_22.q());
            if (bNK2 == null) continue;
            bNT.f().a(bNK2);
            bNK2.Q();
        }
        return false;
    }

    @Override
    public int a() {
        return 12493;
    }
}


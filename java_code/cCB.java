/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cCB
implements adx_1<cxy_1> {
    private static final Logger a = Logger.getLogger(cCB.class);

    @Override
    public boolean a(cxy_1 cxy_12) {
        zg_2 zg_22 = cxy_12.b();
        if (bNT.f().d(zg_22.e(), zg_22.g())) {
            a.error((Object)("Resource " + zg_22.c() + " at " + zg_22.e() + ":" + zg_22.g() + ":" + zg_22.i() + " already exist on client"));
        } else {
            bNK bNK2;
            bNI bNI2 = (bNI)bNJ.a().a(zg_22.c());
            bNK bNK3 = bNK2 = bNI2 instanceof bNF ? bNG.a(zg_22.e(), zg_22.g(), (short)zg_22.i(), zg_22.c(), (byte)zg_22.k(), true, zg_22.m(), zg_22.o(), zg_22.q()) : bNK.b(zg_22.e(), zg_22.g(), (short)zg_22.i(), zg_22.c(), (byte)zg_22.k(), true, zg_22.m(), zg_22.o(), zg_22.q());
            if (bNK2 != null) {
                bNT.f().a(bNK2);
                bNK2.Q();
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 13793;
    }
}


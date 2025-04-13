/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;

/*
 * Renamed from cgN
 */
public class cgn_2
implements adx_1<cAm> {
    @Override
    public boolean a(cAm cAm2) {
        if (!fpm_0.b().q("dungeonDialog")) {
            return false;
        }
        byte[] byArray = cAm2.b();
        byte[] byArray2 = cAm2.c();
        bsZ bsZ2 = cYb.a().c();
        if (bsZ2.i() != eEC.b) {
            bsZ2.a(eEC.b);
        }
        try {
            hy_1 hy_12 = hy_1.a(byArray2);
            bsZ2.a(hy_12);
            hy_1 hy_13 = hy_1.a(byArray);
            bsZ2.b(hy_13);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            invalidProtocolBufferException.printStackTrace();
        }
        return false;
    }

    @Override
    public int a() {
        return 14820;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;

/*
 * Renamed from cgO
 */
public class cgo_1
implements adx_1<cAn> {
    @Override
    public boolean a(cAn cAn2) {
        if (!fpm_0.b().q("dungeonDialog")) {
            return false;
        }
        long l = cAn2.d();
        byte[] byArray = cAn2.b();
        byte[] byArray2 = cAn2.c();
        bsZ bsZ2 = cYb.a().c();
        if (bsZ2.i() != eEC.a) {
            bsZ2.a(eEC.a);
        }
        try {
            hy_1 hy_12 = hy_1.a(byArray2);
            bsZ2.a(hy_12);
            hy_1 hy_13 = hy_1.a(byArray);
            bsZ2.a(hy_13, l);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            invalidProtocolBufferException.printStackTrace();
        }
        return false;
    }

    @Override
    public int a() {
        return 15795;
    }
}


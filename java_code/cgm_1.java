/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.log4j.Logger;

/*
 * Renamed from cgM
 */
public class cgm_1
implements adx_1<cAl> {
    private static final Logger a = Logger.getLogger(cgm_1.class);

    @Override
    public boolean a(cAl cAl2) {
        if (!fpm_0.b().q("dungeonDialog")) {
            return false;
        }
        byte[] byArray = cAl2.b();
        byte[] byArray2 = cAl2.c();
        bsZ bsZ2 = cYb.a().c();
        if (bsZ2.i() != eEC.a) {
            bsZ2.a(eEC.a);
        }
        try {
            hy_1 hy_12 = hy_1.a(byArray2);
            bsZ2.a(hy_12);
            hy_1 hy_13 = hy_1.a(byArray);
            bsZ2.b(hy_13);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)"Error parsing ladder result", (Throwable)invalidProtocolBufferException);
        }
        return false;
    }

    @Override
    public int a() {
        return 14910;
    }
}


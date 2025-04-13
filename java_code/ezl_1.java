/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ezL
 */
public final class ezl_1 {
    private static final Logger a = Logger.getLogger(ezl_1.class);

    private ezl_1() {
    }

    public static byte[] a(ezm_1 ezm_12) {
        eQ eQ2 = eO.j();
        eQ2.c(ezm_12.e());
        eQ2.g(ezm_12.f());
        for (ezj_1 ezj_12 : ezm_12.a().values()) {
            eQ2.a(ezl_1.b(ezj_12));
        }
        return eQ2.k().toByteArray();
    }

    public static byte[] a(ezj_1 ezj_12) {
        eM eM2 = ezl_1.b(ezj_12);
        return eM2.o().toByteArray();
    }

    public static byte[] a(ezj_1 ezj_12, int n) {
        eM eM2 = ezl_1.b(ezj_12);
        eM2.a(n);
        return eM2.o().toByteArray();
    }

    public static ezm_1 a(byte[] byArray) {
        eO eO2;
        try {
            eO2 = eO.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.fatal((Object)"Unable to unserialize build sheet set from protobuf... new BuildSheetSet provided");
            return new ezm_1();
        }
        ezm_1 ezm_12 = new ezm_1();
        ezm_12.d(eO2.h());
        List<eK> list = eO2.d();
        for (eK eK2 : list) {
            ezj_1 ezj_12 = ezl_1.a(eK2);
            ezm_12.a(ezj_12);
        }
        ezm_12.b(eO2.c());
        return ezm_12;
    }

    public static ezj_1 b(byte[] byArray) {
        eK eK2;
        try {
            eK2 = eK.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.fatal((Object)("Unable to unserialize build sheet set from protobuf: " + Arrays.toString(byArray)));
            throw new IllegalArgumentException(invalidProtocolBufferException);
        }
        return ezl_1.a(eK2);
    }

    @NotNull
    private static eM b(ezj_1 ezj_12) {
        eM eM2 = eK.n();
        String string = ezj_12.b();
        eM2.a(string == null ? "Default name" : string).b(ezj_12.c()).a(ezj_12.e()).c(ezj_12.d()).a(ezj_12.f());
        return eM2;
    }

    @NotNull
    private static ezj_1 a(eK eK2) {
        ezj_1 ezj_12 = new ezj_1(eK2.e(), eK2.h(), eK2.c(), eK2.l());
        ezj_12.b(eK2.j());
        return ezj_12;
    }
}


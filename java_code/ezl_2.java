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
 * Renamed from ezl
 */
public final class ezl_2 {
    private static final Logger a = Logger.getLogger(ezl_2.class);

    private ezl_2() {
    }

    public static byte[] a(ezx_2 ezx_22) {
        return ezl_2.c(ezx_22).l().i().toByteArray();
    }

    public static byte[] b(ezx_2 ezx_22) {
        return ezl_2.c(ezx_22).i().toByteArray();
    }

    @NotNull
    private static en_0 c(ezx_2 ezx_22) {
        en_0 en_02 = el_0.h().c(ezx_22.e());
        ezx_22.a((n, s2) -> en_02.a(eh.g().a((int)n).b(s2.shortValue())));
        return en_02;
    }

    public static ezu_1 a(byte[] byArray) {
        el_0 el_02;
        try {
            el_02 = el_0.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)("[Build] Unable to unserialize sheet set from protobuf, " + (String)(byArray == null ? "data is null" : "data length: " + byArray.length)), (Throwable)invalidProtocolBufferException);
            return new ezu_1();
        }
        return ezl_2.a(el_02);
    }

    @NotNull
    private static ezu_1 a(el_0 el_02) {
        ezu_1 ezu_12 = new ezu_1();
        if (el_02.b()) {
            ezu_12.b((short)el_02.c());
        }
        List<eh> list = el_02.d();
        for (eh eh2 : list) {
            if (ezh_2.a.a(eh2.c()) == null) continue;
            ezu_12.a(eh2.c(), (short)eh2.e());
        }
        return ezu_12;
    }

    public static byte[] a(ezy_2 ezy_22) {
        er_0 er_02 = ep_0.f();
        ezy_22.b().forEach((n, ezx_22) -> er_02.b((int)n, ezl_2.c(ezx_22).i()));
        return er_02.g().toByteArray();
    }

    public static ezy_2 b(byte[] byArray) {
        ep_0 ep_02;
        try {
            ep_02 = ep_0.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)("[Build] Unable to parse data into aptitude sheet set, new SheetSet provided ; data = " + Arrays.toString(byArray)));
            return new ezy_2();
        }
        ezy_2 ezy_22 = new ezy_2();
        ep_02.d().forEach((n, el_02) -> ezy_22.a((int)n, ezl_2.a(el_02)));
        return ezy_22;
    }
}


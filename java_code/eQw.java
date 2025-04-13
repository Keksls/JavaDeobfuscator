/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public final class eQw {
    private eQw() {
    }

    public static byte[] a(erg_1 erg_12) {
        ka_0 ka_02 = eQw.b(erg_12);
        return ka_02.L().toByteArray();
    }

    public static erg_1 a(ByteBuffer byteBuffer) {
        eqq_0 eqq_02 = new eqq_0();
        eQw.a(byteBuffer, (erg_1)eqq_02);
        return eqq_02;
    }

    public static void a(ByteBuffer byteBuffer, erg_1 erg_12) {
        jy_0 jy_02;
        try {
            jy_02 = jy_0.a(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild model info from protobuf.");
        }
        eQw.a(jy_02, erg_12);
    }

    public static byte[] a(ern_1 ern_12) {
        ke_0 ke_02 = eQw.b(ern_12);
        return ke_02.m().toByteArray();
    }

    public static ern_1 b(ByteBuffer byteBuffer) {
        kc_0 kc_02;
        try {
            kc_02 = kc_0.a(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild rank info from protobuf.");
        }
        return eQw.a(kc_02);
    }

    public static byte[] a(erh_1 erh_12) {
        js_0 js_02 = eQw.b(erh_12);
        return js_02.j().toByteArray();
    }

    public static erh_1 c(ByteBuffer byteBuffer) {
        jq_0 jq_02;
        try {
            jq_02 = jq_0.a(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild bonus info from protobuf.");
        }
        return eQw.a(jq_02);
    }

    public static byte[] a(erl_1 erl_12) {
        jw_0 jw_02 = eQw.b(erl_12);
        return jw_02.G().toByteArray();
    }

    public static erl_1 d(ByteBuffer byteBuffer) {
        ju_0 ju_02;
        try {
            ju_02 = ju_0.a(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild member info from protobuf.", invalidProtocolBufferException);
        }
        return eQw.a(ju_02);
    }

    @NotNull
    private static ka_0 b(erg_1 erg_12) {
        ka_0 ka_02 = jy_0.K();
        ka_02.a(erg_12.a()).g(erg_12.i()).b(erg_12.f()).a(erg_12.e()).b(erg_12.g()).c(erg_12.h()).h(erg_12.j()).i(erg_12.k()).j(erg_12.r()).k(erg_12.s()).l(erg_12.t());
        erg_12.b(new eqx_0(ka_02));
        ArrayList arrayList = new ArrayList();
        erg_12.a(new eQy(arrayList, erg_12));
        for (int k = 0; k < arrayList.size(); ++k) {
            ka_02.a((jw_0)arrayList.get(k));
        }
        erg_12.c(new eQz(ka_02));
        return ka_02;
    }

    @NotNull
    private static erg_1 a(jy_0 jy_02, erg_1 erg_12) {
        eqq_0 eqq_02 = erg_12 == null ? new eqq_0() : (eqq_0)erg_12;
        eqq_02.d(jy_02.c());
        eqq_02.a((short)jy_02.e());
        eqq_02.e(jy_02.g());
        eqq_02.a(jy_02.i());
        eqq_02.b(jy_02.l());
        eqq_02.c(jy_02.o());
        eqq_02.c(jy_02.r());
        eqq_02.b(jy_02.t());
        eqq_02.d(jy_02.v());
        eqq_02.e(jy_02.x());
        eqq_02.f(jy_02.z());
        for (kc_0 generatedMessageV3 : jy_02.A()) {
            eqq_02.a(eQw.a(generatedMessageV3));
        }
        for (ju_0 ju_02 : jy_02.D()) {
            eqq_02.a(eQw.a(ju_02));
        }
        for (jq_0 jq_02 : jy_02.G()) {
            eqq_02.a(eQw.a(jq_02));
        }
        return eqq_02;
    }

    @NotNull
    static ke_0 b(ern_1 ern_12) {
        ke_0 ke_02 = kc_0.l();
        ke_02.a(ern_12.a()).a(ern_12.b()).b(ern_12.c()).a(ern_12.d());
        return ke_02;
    }

    @NotNull
    private static ern_1 a(kc_0 kc_02) {
        eQv eQv2 = new eQv(kc_02.c());
        eQv2.a(kc_02.e());
        eQv2.b(kc_02.h());
        eQv2.a((short)kc_02.j());
        return eQv2;
    }

    @NotNull
    static jw_0 b(erl_1 erl_12) {
        jw_0 jw_02 = ju_0.F();
        jw_02.a(erl_12.a()).b(erl_12.b()).a(erl_12.c()).c(erl_12.d()).d(erl_12.e()).a(erl_12.g()).a(ByteString.copyFrom((byte[])new byte[]{erl_12.h()})).b(ByteString.copyFrom((byte[])new byte[]{erl_12.i()})).b(erl_12.j()).c(erl_12.k()).a(erl_12.f()).e(erl_12.l()).d(ByteString.copyFrom((byte[])new byte[]{erl_12.n()})).e(ByteString.copyFrom((byte[])new byte[]{erl_12.p()}));
        return jw_02;
    }

    @NotNull
    private static erl_1 a(ju_0 ju_02) {
        eQp eQp2 = new eQp(ju_02.c());
        eQp2.c(ju_02.e());
        eQp2.a(ju_02.g());
        eQp2.a(ju_02.i());
        eQp2.b(ju_02.k());
        eQp2.a(ju_02.m());
        eQp2.a(ju_02.o().byteAt(0));
        eQp2.b(ju_02.q().byteAt(0));
        eQp2.a((short)ju_02.s());
        eQp2.b(ju_02.u());
        eQp2.a(ju_02.w());
        eQp2.d(ju_02.z());
        eQp2.a(Ow.c(ju_02.B().byteAt(0)));
        eQp2.a(xz_0.a(ju_02.D().byteAt(0)));
        return eQp2;
    }

    @NotNull
    static js_0 b(erh_1 erh_12) {
        js_0 js_02 = jq_0.i();
        js_02.a(erh_12.a()).a(erh_12.c().h()).b(erh_12.b().h());
        return js_02;
    }

    @NotNull
    private static erh_1 a(jq_0 jq_02) {
        return new eQi().a(jq_02.c()).a(wt_0.b(jq_02.g())).b(wt_0.b(jq_02.e())).a();
    }
}


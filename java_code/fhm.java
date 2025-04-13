/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class fhm {
    private fhm() {
    }

    public static byte[] a(fhe_0 fhe_02) {
        os_1 os_12 = fhm.b(fhe_02);
        return os_12.D().toByteArray();
    }

    public static fhe_0 a(ByteBuffer byteBuffer) {
        oq_1 oq_12;
        try {
            oq_12 = oq_1.a(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize battleground info from protobuf.", invalidProtocolBufferException);
        }
        return fhm.a(oq_12);
    }

    public static byte[] a(List<fhe_0> list) {
        ov_2 ov_22 = fhm.b(list);
        return ov_22.g().toByteArray();
    }

    public static ArrayList<fhe_0> b(ByteBuffer byteBuffer) {
        ot_1 ot_12;
        try {
            ot_12 = ot_1.a(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize battleground list from protobuf.", invalidProtocolBufferException);
        }
        ArrayList<fhe_0> arrayList = new ArrayList<fhe_0>();
        for (oq_1 oq_12 : ot_12.b()) {
            arrayList.add(fhm.a(oq_12));
        }
        return arrayList;
    }

    public static byte[] a(TIntArrayList tIntArrayList, int n) {
        oa_1 oa_12 = fhm.b(tIntArrayList, n);
        return oa_12.h().toByteArray();
    }

    public static oy_2 a(byte[] byArray) {
        oy_2 oy_22;
        try {
            oy_22 = oy_2.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize battleground team info from protobuf.", invalidProtocolBufferException);
        }
        return oy_22;
    }

    private static os_1 b(fhe_0 fhe_02) {
        os_1 os_12 = oq_1.C();
        os_12.a(fhe_02.a()).b(fhe_02.d().a()).e(fhe_02.e().a()).c(fhe_02.f()).a(fhe_02.g().h()).b(fhe_02.h() != null ? fhe_02.h().h() : 0L).d(fhe_02.q()).f(fhe_02.r()).g(fhe_02.n()).h(fhe_02.o());
        os_12.a(fhm.b(fhe_02.i(), fhe_02.l()));
        os_12.b(fhm.b(fhe_02.j(), fhe_02.m()));
        return os_12;
    }

    private static ov_2 b(List<fhe_0> list) {
        ov_2 ov_22 = ot_1.f();
        for (fhe_0 fhe_02 : list) {
            ov_22.a(fhm.b(fhe_02));
        }
        return ov_22;
    }

    private static oa_1 b(TIntArrayList tIntArrayList, int n) {
        oa_1 oa_12 = oy_2.g();
        oa_12.c(n);
        tIntArrayList.forEach((TIntProcedure)new fhn(oa_12));
        return oa_12;
    }

    @NotNull
    private static fhe_0 a(oq_1 oq_12) {
        oy_2 oy_22;
        fhe_0 fhe_02 = new fhe_0(oq_12.c(), fho.a(oq_12.e()), fhi.a(oq_12.s()), oq_12.g(), wt_0.b(oq_12.o()));
        if (oq_12.v()) {
            fhe_02.a(wt_0.b(oq_12.w()));
        }
        if (oq_12.h()) {
            oy_22 = oq_12.i();
            fhe_02.i().addAll(oy_22.b());
            fhe_02.b(oy_22.e());
        }
        if (oq_12.k()) {
            oy_22 = oq_12.l();
            fhe_02.j().addAll(oy_22.b());
            fhe_02.d(oy_22.e());
        }
        fhe_02.f(oq_12.q());
        fhe_02.g(oq_12.u());
        fhe_02.a((short)oq_12.y());
        fhe_02.b((short)oq_12.A());
        return fhe_02;
    }
}


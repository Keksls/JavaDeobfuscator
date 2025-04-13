/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eNs
 */
public final class ens_0 {
    public static byte[] a(enr_0 enr_02) {
        abx_2 abx_22 = new abx_2();
        abx_22.a(enr_02.d().b());
        abx_22.a(enr_02.e());
        abx_22.a(enr_02.f());
        abx_22.a((byte)(enr_02.g() ? 1 : 0));
        abx_22.a(enr_02.i());
        abx_22.a((byte)(enr_02.h() ? 1 : 0));
        abx_22.a(enr_02.j());
        return abx_22.c();
    }

    public static enr_0 a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte by = byteBuffer.get();
        byte by2 = byteBuffer.get();
        byte by3 = byteBuffer.get();
        boolean bl = byteBuffer.get() == 1;
        long l = byteBuffer.getLong();
        boolean bl2 = byteBuffer.get() == 1;
        long l2 = byteBuffer.getLong();
        enr_0 enr_02 = new enr_0(by3, bl2, bl, l);
        enr_02.b(enq_0.a(by));
        enr_02.a(l2, by2);
        return enr_02;
    }
}


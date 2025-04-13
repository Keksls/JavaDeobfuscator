/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eNV
 */
public final class env_1 {
    private static final int a = 0;

    public static byte[] a(ekk_0 ekk_02) {
        abx_2 abx_22 = new abx_2();
        abx_22.a(ekk_02.a_());
        abx_22.a(ekk_02.G());
        abx_22.a(ekk_02.H());
        abx_22.a(ekk_02.I());
        Su su = ekk_02.v();
        abx_22.a(su != null ? su.a_() : 0L);
        abx_22.a(ekk_02.c());
        abx_22.a(ekk_02.F().a());
        abx_22.a(ekk_02.Z());
        return abx_22.c();
    }

    public static elb_0 a(ByteBuffer byteBuffer, els_0 els_02) {
        long l = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        long l2 = byteBuffer.getLong();
        Su su = els_02.f_(l2);
        short s3 = byteBuffer.getShort();
        int n3 = byteBuffer.getInt();
        byte by = byteBuffer.get();
        elb_0 elb_02 = new elb_0(l, n, n2, s2, els_02.h(), l2, su, s3, aej_2.a(n3));
        elb_02.a(by);
        return elb_02;
    }

    public static byte[] b(ekk_0 ekk_02) {
        return ekk_02.I_();
    }

    public static void a(ekk_0 ekk_02, ByteBuffer byteBuffer) {
        ekk_02.b(byteBuffer);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class eBv {
    public static int a(eBt eBt2) {
        byte[] byArray = Cz.a(eBt2.e());
        qg_1 qg_12 = new qg_1();
        eBt2.h().a(qg_12.c);
        return 30 + byArray.length + qg_12.b() + 1 + 4 + 4 + 4;
    }

    public static byte[] b(eBt eBt2) {
        abx_2 abx_22 = eBv.c(eBt2);
        ByteBuffer byteBuffer = eBv.d(eBt2);
        abx_22.b(byteBuffer.array());
        return abx_22.c();
    }

    public static abx_2 c(eBt eBt2) {
        abx_2 abx_22 = new abx_2();
        abx_22.a(eBt2.b());
        abx_22.a(eBt2.a());
        abx_22.a(eBt2.f());
        abx_22.a(eBt2.c());
        byte[] byArray = Cz.a(eBt2.e());
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a((byte)(eBt2.i() ? 1 : 0));
        abx_22.a(eBt2.k());
        abx_22.a(eBt2.j());
        abx_22.a(eBt2.l());
        return abx_22;
    }

    public static ByteBuffer d(eBt eBt2) {
        exq_2 exq_22 = eBt2.h();
        return eBv.a(exq_22);
    }

    public static ByteBuffer a(exq_2 exq_22) {
        qg_1 qg_12 = new qg_1();
        exq_22.a(qg_12.c);
        ByteBuffer byteBuffer = ByteBuffer.allocate(qg_12.b());
        qg_12.a(byteBuffer);
        return byteBuffer;
    }

    public static eBt a(ByteBuffer byteBuffer) {
        eBt eBt2 = eBv.c(byteBuffer);
        return eBv.a(byteBuffer, eBt2, epj.k);
    }

    public static eBt b(ByteBuffer byteBuffer) {
        eBt eBt2 = eBv.c(byteBuffer);
        int n = eBt2.l();
        return eBv.a(byteBuffer, eBt2, n);
    }

    public static eBt a(ByteBuffer byteBuffer, eBt eBt2, int n) {
        qg_1 qg_12 = new qg_1();
        qg_12.a(byteBuffer, n);
        eBt2.h().a(new eBz(eBt2));
        eBt2.h().b(qg_12.c);
        return eBt2;
    }

    public static eBt c(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        short s2 = byteBuffer.getShort();
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = Cz.a(byArray);
        boolean bl = byteBuffer.get() == 1;
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        int n3 = byteBuffer.getInt();
        eBt eBt2 = new eBt(s2);
        eBt2.a(l);
        eBt2.d(l2);
        eBt2.b(l3);
        eBt2.a(string);
        eBt2.a(bl);
        eBt2.b(n);
        eBt2.a(n2);
        eBt2.c(n3);
        return eBt2;
    }
}


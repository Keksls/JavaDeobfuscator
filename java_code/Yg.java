/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.nio.ByteBuffer;

public final class Yg {
    final Yj a;
    private wy_0 b;
    private wt_0 c;
    private static final int d = 5;
    private final byte[] e = new byte[68];

    public Yg(Yj yj) {
        this.a = yj;
    }

    void a(wy_0 wy_02) {
        if (this.b != null && this.b == wy_02) {
            return;
        }
        this.b = wy_02;
    }

    void a(wu_0 wu_02) {
        if (this.c != null && wu_02.f(this.c) == 0) {
            return;
        }
        this.c = new wt_0(wu_02);
    }

    public byte[] a() {
        return this.e;
    }

    void b() {
        wu_0 wu_02 = new wt_0(this.c);
        THashSet tHashSet = new THashSet(4);
        ByteBuffer byteBuffer = ByteBuffer.wrap(this.e);
        byteBuffer.put((byte)5);
        for (int k = 0; k < 5; ++k) {
            Ye ye = this.a.a(wu_02);
            wy_0 wy_02 = wy_0.a(wu_02);
            tHashSet.add((Object)wy_02);
            byte by = (byte)ye.d();
            byte by2 = (byte)ye.e();
            byte by3 = (byte)ye.j();
            short s2 = (short)Math.floor(ye.c() * 65535.0f);
            short s3 = (short)Math.floor(ye.i() * 32767.0f);
            byteBuffer.put((byte)wy_02.ordinal());
            byteBuffer.put(by);
            byteBuffer.put(by2);
            byteBuffer.putShort(s2);
            byteBuffer.putInt(ye.f().a());
            byteBuffer.put(by3);
            byteBuffer.putShort(s3);
            wu_02 = wu_02.u();
        }
        byteBuffer.put((byte)tHashSet.size());
        tHashSet.forEach((TObjectProcedure)new Yh(this, byteBuffer));
    }
}


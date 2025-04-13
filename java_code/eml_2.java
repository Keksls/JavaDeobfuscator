/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eMl
 */
public final class eml_2 {
    static final Logger b = Logger.getLogger(eml_2.class);
    private final tg_0 c;

    public eml_2(tg_0 tg_02) {
        this.c = tg_02;
    }

    public byte[] a() {
        return this.a(false);
    }

    public byte[] a(boolean bl) {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.c.p());
        abx_22.a(this.c.q());
        abx_22.a(this.c.z());
        abx_22.a(this.c.A());
        abx_22.a(this.c.B());
        abx_22.a(this.c.C());
        abx_22.a(this.c.m());
        abx_22.a(this.c.n());
        abx_22.a((short)this.c.b());
        short[] sArray = this.c.a();
        for (int k = 0; k < this.c.b(); ++k) {
            abx_22.a(sArray[k]);
        }
        abx_22.a(this.c.f() ? (byte)1 : 0);
        if (this.c.f()) {
            abx_22.b(this.c.g());
        }
        if (bl) {
            abx_22.a((byte)1);
            new emq_2(this.c).a(abx_22);
        } else {
            abx_22.a((byte)0);
        }
        abx_22.a(this.c.d());
        abx_22.a(this.c.e());
        byte[] byArray = this.c.i();
        abx_22.a((byte)byArray.length);
        for (int k = 0; k < byArray.length; ++k) {
            byte by = byArray[k];
            abx_22.a(by);
            abx_22.a(this.c.b(by));
        }
        return abx_22.c();
    }

    public void a(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.position();
        short s2 = byteBuffer.getShort();
        this.c.a(s2);
        short s3 = byteBuffer.getShort();
        this.c.b(s3);
        int n3 = byteBuffer.getInt();
        this.c.c(n3);
        int n4 = byteBuffer.getInt();
        this.c.d(n4);
        int n5 = byteBuffer.getInt();
        this.c.f(n5);
        int n6 = byteBuffer.getInt();
        this.c.g(n6);
        this.c.d(byteBuffer.getShort());
        this.c.c(byteBuffer.getShort());
        int n7 = byteBuffer.getShort();
        this.c.e(n7);
        assert (byteBuffer.remaining() > n7 * 2);
        short[] sArray = new short[n7];
        for (n = 0; n < n7; n += 1) {
            sArray[n] = byteBuffer.getShort();
        }
        this.c.a(sArray);
        n = byteBuffer.get() == 1 ? 1 : 0;
        this.c.b(n != 0);
        byte[] byArray = new byte[n7];
        if (n) {
            byteBuffer.get(byArray);
        }
        this.c.a(byArray);
        this.b(byteBuffer);
        this.c.d(byteBuffer.get());
        this.c.e(byteBuffer.get());
        int n8 = byteBuffer.get();
        for (int k = 0; k < n8; ++k) {
            this.c.a(byteBuffer.get(), byteBuffer.getInt());
        }
    }

    static afk_2 a(tg_0 tg_02) {
        return XY.a(tg_02.z(), tg_02.A(), tg_02.B(), tg_02.C());
    }

    private void b(ByteBuffer byteBuffer) {
        afk_2 afk_22 = eml_2.a(this.c);
        emp_1 emp_12 = eml_2.a(this.c, byteBuffer);
        for (int k = afk_22.d; k < afk_22.e; ++k) {
            for (int i2 = afk_22.b; i2 < afk_22.c; ++i2) {
                yx_0 yx_02 = emp_12.a((short)i2, (short)k);
                if (yx_02 == null) continue;
                this.c.a(yx_02);
            }
        }
    }

    private static emp_1 a(tg_0 tg_02, ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() != 0;
        if (yz_0.c()) {
            assert (!bl);
            return new emm_2();
        }
        short s2 = tg_02.p();
        short s3 = tg_02.q();
        if (bl) {
            new emq_2(tg_02).a(byteBuffer);
            return new emn_1(s2, s3);
        }
        return new emo_2(s2, s3);
    }
}


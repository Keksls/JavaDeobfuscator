/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from VC
 */
public class vc_0 {
    long a;
    short b;

    vc_0() {
    }

    long a() {
        return this.a;
    }

    void a(long l) {
        this.a = l;
    }

    public void b() {
        this.b = (short)(this.b + 1);
    }

    public short c() {
        return this.b;
    }

    public int d() {
        return 2;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.b);
    }

    protected void a(vz_0 vz_02, ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
    }

    public static vc_0 b(vz_0 vz_02, ByteBuffer byteBuffer) {
        vc_0 vc_02 = new vc_0();
        vc_02.a(vz_02, byteBuffer);
        return vc_02;
    }

    public vc_0(long l, short s2) {
        this();
        this.b = s2;
        this.a = l;
    }
}


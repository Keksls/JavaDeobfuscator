/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from OO
 */
public class oo_0 {
    public static final short a = -1;
    public final short b;
    public final boolean c;
    public final float d;
    public final float e;
    public final float f;

    public oo_0() {
        this(-1);
    }

    public oo_0(short s2) {
        this(s2, true, 0.01f, 1.0f, 0.01f);
    }

    public oo_0(short s2, boolean bl, float f2, float f3, float f4) {
        this.b = s2;
        this.c = bl;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public oo_0 a(short s2) {
        return new oo_0(s2, this.c, this.d, this.e, this.f);
    }

    public oo_0(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.get() != 0;
        this.d = byteBuffer.getFloat();
        this.e = byteBuffer.getFloat();
        this.f = byteBuffer.getFloat();
    }

    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c ? (byte)1 : 0);
        gk_02.a(this.d);
        gk_02.a(this.e);
        gk_02.a(this.f);
    }
}


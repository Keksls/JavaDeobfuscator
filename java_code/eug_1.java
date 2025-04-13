/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eUG
 */
public final class eug_1
implements eui_1 {
    public long a;
    public byte b;

    eug_1() {
    }

    public eug_1(long l, byte by) {
        this.a = l;
        this.b = by;
    }

    @Override
    public byte[] a() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return abx_22.c();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    @Override
    public short d() {
        return 1;
    }
}


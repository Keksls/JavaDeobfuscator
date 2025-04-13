/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eUH
 */
public final class euh_1
implements eui_1 {
    private long c;
    public static final int a = 647;
    public static final int b = 646;

    euh_1() {
    }

    public euh_1(long l) {
        this.c = l;
    }

    @Override
    public byte[] a() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.c);
        return abx_22.c();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
    }

    @Override
    public short d() {
        return 2;
    }

    public long b() {
        return this.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxl
 */
public class cxl_1
extends ps_0 {
    private byte a;
    private boolean b;
    private long c;
    private byte d;

    public byte b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public byte e() {
        return this.d;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.a = byteBuffer.get();
        this.b = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13775;
    }
}


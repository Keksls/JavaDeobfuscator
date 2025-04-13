/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxm
 */
public class cxm_1
extends ps_0 {
    private boolean a;
    private boolean b;
    private byte c;
    private byte d;

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public byte e() {
        return this.d;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        this.b = byteBuffer.get() == 1;
        this.c = byteBuffer.get();
        this.d = byteBuffer.get();
        return true;
    }

    @Override
    public int a() {
        return 13748;
    }
}


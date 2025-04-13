/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cym
 */
public class cym_1
extends ps_0 {
    private int a;
    private byte b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get();
        this.c = byteBuffer.get() == 1;
        return true;
    }

    public int b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    @Override
    public int a() {
        return 13866;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyq
 */
public class cyq_2
extends ps_0 {
    private int a;
    private byte b;
    private int c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12778;
    }

    public int b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }
}


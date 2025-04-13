/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwQ
 */
public class cwq_1
extends ps_0 {
    private int a;
    private int b;
    private short c;
    private byte[] d;

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public short d() {
        return this.c;
    }

    public byte[] e() {
        return this.d;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        this.d = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(this.d);
        return true;
    }

    @Override
    public int a() {
        return 13306;
    }
}


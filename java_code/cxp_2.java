/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxP
 */
public class cxp_2
extends ps_0 {
    private int a;
    private int b;
    private int c;
    private short d;
    private short e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getShort();
        return true;
    }

    @Override
    public int a() {
        return 12975;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }
}


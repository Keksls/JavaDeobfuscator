/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyb
 */
public class cyb_2
extends ps_0 {
    private long a;
    private int b;
    private short c;
    private boolean d;
    private long e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.get() != 0;
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12634;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public short d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public long f() {
        return this.e;
    }
}


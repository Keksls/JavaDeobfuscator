/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyr
 */
public class cyr_2
extends ps_0 {
    private boolean a;
    private int b;
    private int c;
    private long[] d;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length < 10) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = new long[byteBuffer.get()];
        for (int k = 0; k < this.d.length; ++k) {
            this.d[k] = byteBuffer.getLong();
        }
        return true;
    }

    @Override
    public int a() {
        return 12362;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public long[] d() {
        return this.d;
    }

    public boolean e() {
        return this.a;
    }
}


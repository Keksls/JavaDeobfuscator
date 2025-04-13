/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwj
 */
public class cwj_1
extends ps_0 {
    private long a;
    private int b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 12820;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}


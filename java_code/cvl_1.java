/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvl
 */
public class cvl_1
extends ps_0 {
    private int a;
    private int b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13650;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}


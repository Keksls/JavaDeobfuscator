/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvs
 */
public class cvs_1
extends ps_0 {
    private long a;
    private int b;
    private eyq_2 c;
    private boolean d;
    private eZw e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.d = byteBuffer.get() == 1;
        this.c = eyq_2.values()[byteBuffer.get()];
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.e = eZy.a(byArray2);
        return true;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public eZw d() {
        return this.e;
    }

    public eyq_2 e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    @Override
    public int a() {
        return 13745;
    }
}


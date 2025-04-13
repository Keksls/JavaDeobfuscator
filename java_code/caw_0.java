/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAw
 */
public class caw_0
extends ps_0 {
    private long a;
    private String b;
    private String c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray3);
        this.c = Cz.a(byArray3);
        return true;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        return this.a;
    }

    @Override
    public int a() {
        return 1038;
    }
}


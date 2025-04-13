/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

public final class QN
extends ps_0 {
    private final int a;
    private long b;
    private String c;
    private List<Ow> d;
    private xz_0 e;
    private String f;

    public QN(int n) {
        this.a = n;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.c = Cz.a(byArray2);
        this.d = Ow.c(byteBuffer.get());
        this.e = xz_0.a(byteBuffer.get());
        byte[] byArray3 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray3);
        this.f = Cz.a(byArray3);
        return true;
    }

    @Override
    public int a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public List<Ow> d() {
        return this.d;
    }

    public xz_0 e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }
}


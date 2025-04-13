/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwu
 */
public class cwu_2
extends ps_0 {
    private boolean a;
    private long b;
    private String c;
    private long d;
    private String e;
    private int f;
    private int g;

    public boolean b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = this.a = byteBuffer.get() != 0;
        if (this.a) {
            this.g = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.b = byteBuffer.getLong();
            byte by = byteBuffer.get();
            byte[] byArray2 = new byte[by];
            byteBuffer.get(byArray2);
            this.c = Cz.a(byArray2);
            this.d = byteBuffer.getLong();
            byte by2 = byteBuffer.get();
            byArray2 = new byte[by2];
            byteBuffer.get(byArray2);
            this.e = Cz.a(byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 14318;
    }
}


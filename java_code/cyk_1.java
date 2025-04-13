/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyk
 */
public class cyk_1
extends ps_0 {
    private int a;
    private int b;
    private String c;
    private int d;
    private short e;
    private int f;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        byte by = byteBuffer.get();
        if (by > 0) {
            byte[] byArray2 = new byte[by];
            byteBuffer.get(byArray2);
            this.c = Cz.a(byArray2);
        }
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13469;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public short d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.b;
    }
}


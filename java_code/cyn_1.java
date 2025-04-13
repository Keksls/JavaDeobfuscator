/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyn
 */
public class cyn_1
extends ps_0 {
    private int a;
    private int b;
    private String c;
    private int d;

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
        return true;
    }

    @Override
    public int a() {
        return 13964;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }
}


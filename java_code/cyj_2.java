/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyj
 */
public class cyj_2
extends ps_0 {
    private byte a;
    private int b;
    private int c;
    private wt_0 d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = wt_0.b(byteBuffer.getLong());
        return true;
    }

    @Override
    public int a() {
        return 12045;
    }

    public byte b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public wt_0 e() {
        return this.d;
    }
}


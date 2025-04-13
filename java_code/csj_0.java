/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csJ
 */
public class csj_0
extends ps_0 {
    private int a;
    private int b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12347;
    }
}


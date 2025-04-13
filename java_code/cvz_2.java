/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvZ
 */
public class cvz_2
extends ps_0 {
    private long a;
    private float b;
    private float c;
    private final wh_2 d = new wh_2();

    public long b() {
        return this.a;
    }

    public wh_2 c() {
        return this.d;
    }

    public float d() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getFloat();
        this.c = byteBuffer.getFloat();
        this.d.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 12779;
    }
}


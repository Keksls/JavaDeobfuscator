/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvO
 */
public class cvo_1
extends ps_0 {
    private fhy a;
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fhy.a(byteBuffer.get());
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13282;
    }

    public int b() {
        return this.b;
    }

    public fhy c() {
        return this.a;
    }
}


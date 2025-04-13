/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crp
 */
public class crp_0
extends ps_0 {
    private wt_0 a;
    private boolean b;
    private float c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = wt_0.b(byteBuffer.getLong());
        this.b = byteBuffer.get() == 1;
        this.c = byteBuffer.getFloat();
        return true;
    }

    @Override
    public int a() {
        return 12959;
    }

    public wt_0 b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }
}


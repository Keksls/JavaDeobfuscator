/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxN
 */
public class cxn_2
extends ps_0 {
    private int a;
    private int b;
    private fgY c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = fgY.a(byteBuffer.get());
        return true;
    }

    @Override
    public int a() {
        return 14197;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public fgY d() {
        return this.c;
    }
}


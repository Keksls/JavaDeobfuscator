/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyS
 */
public class cys_1
extends ps_0 {
    private boolean a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get(0) == 1;
        this.b = byteBuffer.get(1) == 1;
        return true;
    }

    @Override
    public int a() {
        return 12197;
    }

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}


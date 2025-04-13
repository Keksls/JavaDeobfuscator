/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwq
 */
public class cwq_2
extends ps_0 {
    private fcf a;
    private int b;
    private int c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fcf.c(byteBuffer);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        return true;
    }

    public fcf b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    @Override
    public int a() {
        return 12968;
    }
}


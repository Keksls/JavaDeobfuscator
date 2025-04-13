/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwt
 */
public class cwt_2
extends ps_0 {
    private int a;

    public int b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13602;
    }
}


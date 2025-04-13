/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cww
 */
public class cww_2
extends ps_0 {
    private fcq_0 a;

    public fcq_0 b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fcq_0.b(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 15226;
    }
}


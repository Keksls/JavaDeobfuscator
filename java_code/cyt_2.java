/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyt
 */
public class cyt_2
extends ps_0 {
    private int a;
    private aff_1 b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = apb_2.a(byteBuffer.getLong());
        this.a = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.a;
    }

    public aff_1 c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13364;
    }
}


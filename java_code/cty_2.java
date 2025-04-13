/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctY
 */
public class cty_2
extends csy_2 {
    private long b;
    private aff_1 c;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 22, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        this.c = new aff_1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        return true;
    }

    @Override
    public int a() {
        return 13407;
    }

    public long b() {
        return this.b;
    }

    public aff_1 c() {
        return this.c;
    }
}


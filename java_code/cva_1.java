/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvA
 */
public class cva_1
extends ps_0 {
    private eAW a;
    private String b;
    private String c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eAW.a(byteBuffer.get());
        if (this.a != eAW.a) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray3);
        this.c = Cz.a(byArray3);
        return true;
    }

    public eAW b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    @Override
    public int a() {
        return 12211;
    }
}


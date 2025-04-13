/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvx
 */
public class cvx_1
extends ps_0 {
    private eAW a;
    private String b;
    private le_0 c;
    private int d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eAW.a(byteBuffer.get());
        if (this.a != eAW.a) {
            return true;
        }
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        int n2 = byteBuffer.getInt();
        byte[] byArray3 = new byte[n2];
        byteBuffer.get(byArray3);
        this.c = le_0.a(byArray3);
        this.d = byteBuffer.getInt();
        return true;
    }

    public eAW b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public le_0 d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    @Override
    public int a() {
        return 13288;
    }
}


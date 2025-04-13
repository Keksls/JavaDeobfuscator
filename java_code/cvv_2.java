/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvv
 */
public class cvv_2
extends ps_0 {
    private eAW a;
    private String b;
    private le_0 c;
    private short d;
    private int e;

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
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getInt();
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

    public short e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    @Override
    public int a() {
        return 13257;
    }
}


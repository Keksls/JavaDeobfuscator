/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvw
 */
public class cvw_1
extends ps_0 {
    private eAW a;
    private String b;
    private String c;
    private le_0 d;
    private short e;
    private int f;
    private int g;

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
        this.c = Cz.a(byArray3);
        int n3 = byteBuffer.getInt();
        byte[] byArray4 = new byte[n3];
        byteBuffer.get(byArray4);
        this.d = le_0.a(byArray4);
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
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

    public le_0 e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    @Override
    public int a() {
        return 12110;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bMF
 */
public class bmf_0
extends fgv_0<bMm> {
    private String b;
    private xd_0 c;
    private short d;
    private short e;

    public bmf_0() {
        super(-1, -1L);
        this.b = null;
        this.c = null;
        this.a(new bMm(this));
    }

    public bmf_0(int n, String string, xd_0 xd_02, short s2, short s3, long l) {
        super(n, l);
        this.b = string;
        this.c = xd_02;
        this.d = s2;
        this.e = s3;
        this.a(new bMm(this));
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a(byteBuffer.getInt());
        byte[] byArray = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray);
        this.b = Cz.a(byArray);
        this.c = new xd_0();
        this.c.a(byteBuffer);
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getShort();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.e());
        byte[] byArray = Cz.a(this.b);
        gk_02.a((short)byArray.length);
        gk_02.a(byArray);
        this.c.a(gk_02);
        gk_02.a(this.d);
        gk_02.a(this.e);
    }

    public String a() {
        return this.b;
    }

    public xd_0 b() {
        return this.c;
    }

    public short c() {
        return this.d;
    }

    public short d() {
        return this.e;
    }

    public boolean a(int n, int n2) {
        int n3 = XZ.a(n);
        int n4 = XZ.b(n2);
        return this.c.b(n3, n4);
    }
}


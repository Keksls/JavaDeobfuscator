/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBS
 */
public class cbs_0
extends ps_0 {
    private String a;
    private String b;
    private boolean c;
    private boolean d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.b = Cz.a(byArray3);
        this.c = byteBuffer.get() == 0;
        this.d = byteBuffer.get() == 0;
        return true;
    }

    @Override
    public int a() {
        return 13075;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }
}


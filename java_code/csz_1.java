/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csz
 */
public class csz_1
extends ps_0 {
    private int a;
    private int b;
    private boolean c;
    private String d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() != 0;
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.d = Cz.a(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 13208;
    }

    public ect_0 b() {
        return ecn_0.a.a(this.a);
    }

    public eco_0 c() {
        return this.b().a(this.b);
    }

    public boolean d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }
}


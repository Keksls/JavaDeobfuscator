/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czP
 */
public class czp_2
extends Pw {
    private String a;
    private String b;
    private String c;

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        byte[] byArray2 = Cz.a(this.b);
        byte[] byArray3 = Cz.a(this.c);
        int n = byArray.length;
        int n2 = byArray2.length;
        int n3 = byArray3.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + n + 4 + n2 + 4 + n3);
        byteBuffer.putInt(n);
        byteBuffer.put(byArray);
        byteBuffer.putInt(n2);
        byteBuffer.put(byArray2);
        byteBuffer.putInt(n3);
        byteBuffer.put(byArray3);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 1111;
    }

    public void a(String string) {
        this.a = string;
    }

    public void b(String string) {
        this.b = string;
    }

    public void c(String string) {
        this.c = string;
    }
}


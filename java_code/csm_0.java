/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csM
 */
public class csm_0
extends ps_0 {
    private int a;
    private byte[] b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        this.b = new byte[n];
        byteBuffer.get(this.b);
        int n2 = byteBuffer.getInt();
        this.c = new byte[n2];
        byteBuffer.get(this.c);
        return true;
    }

    @Override
    public int a() {
        return 13887;
    }

    public byte[] b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    public int d() {
        return this.a;
    }
}


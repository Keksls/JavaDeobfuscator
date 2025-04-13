/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class crb
extends ps_0 {
    private byte[] a;
    private final ArrayList<byte[]> b = new ArrayList();
    private final ArrayList<fem_0> c = new ArrayList();
    private byte[] d;

    @Override
    public boolean a(byte[] byArray) {
        Object object;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(this.a);
        byte[] byArray2 = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray2);
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(byArray2);
        int n = byteBuffer2.getShort();
        for (int k = 0; k < n; ++k) {
            object = new byte[byteBuffer2.getShort() & 0xFFFF];
            byteBuffer2.get((byte[])object);
            this.b.add((byte[])object);
        }
        byte[] byArray3 = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray3);
        object = ByteBuffer.wrap(byArray3);
        int n2 = ((ByteBuffer)object).getShort();
        for (int k = 0; k < n2; ++k) {
            this.c.add(fem_0.a((ByteBuffer)object));
        }
        this.d = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(this.d);
        return true;
    }

    @Override
    public int a() {
        return 12985;
    }

    public byte[] b() {
        return this.a;
    }

    public ArrayList<byte[]> c() {
        return this.b;
    }

    public ArrayList<fem_0> d() {
        return this.c;
    }

    public byte[] e() {
        return this.d;
    }
}


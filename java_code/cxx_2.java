/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cxx
 */
public class cxx_2
extends ps_0 {
    private final ArrayList<byte[]> a = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray2);
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(byArray2);
        int n = byteBuffer2.getShort();
        for (int k = 0; k < n; ++k) {
            byte[] byArray3 = new byte[byteBuffer2.getShort() & 0xFFFF];
            byteBuffer2.get(byArray3);
            this.a.add(byArray3);
        }
        return true;
    }

    @Override
    public int a() {
        return 12954;
    }

    public ArrayList<byte[]> b() {
        return this.a;
    }
}


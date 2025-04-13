/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cBH
 */
public class cbh_0
extends ps_0 {
    private final ArrayList<byte[]> a = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        for (int k = 0; k < n; ++k) {
            short s2 = byteBuffer.getShort();
            byte[] byArray2 = new byte[s2];
            byteBuffer.get(byArray2);
            this.a.add(byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 23686;
    }

    public ArrayList<byte[]> b() {
        return this.a;
    }
}


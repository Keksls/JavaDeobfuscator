/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cvj
 */
public class cvj_1
extends ps_0 {
    private final ArrayList<byte[]> a = new ArrayList();
    private final ArrayList<double[]> b = new ArrayList();
    private boolean c = false;
    private final ArrayList<Long[]> d = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            short s2 = byteBuffer.getShort();
            byte[] byArray2 = new byte[s2];
            byteBuffer.position(byteBuffer.position() - 2);
            byteBuffer.get(byArray2);
            this.a.add(byArray2);
            double d2 = byteBuffer.getDouble();
            double d3 = byteBuffer.getDouble();
            double d4 = byteBuffer.getDouble();
            this.b.add(new double[]{d2, d3, d4});
            this.c = byteBuffer.getShort() != 0;
            int n2 = byteBuffer.getInt();
            Long[] longArray = new Long[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                longArray[k] = byteBuffer.getLong();
            }
            this.d.add(longArray);
        }
        return true;
    }

    @Override
    public int a() {
        return 13810;
    }

    public ArrayList<byte[]> b() {
        return this.a;
    }

    public ArrayList<double[]> c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public ArrayList<Long[]> e() {
        return this.d;
    }
}


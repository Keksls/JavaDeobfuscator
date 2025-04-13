/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cur
 */
public class cur_2
extends ps_0 {
    private final ArrayList<uz_1> a = new ArrayList();
    private boolean b;

    public ArrayList<uz_1> b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort() & 0xFFFF;
        for (int k = 0; k < n; ++k) {
            uz_1 uz_12 = new uz_1();
            uz_12.b(byteBuffer);
            this.a.add(uz_12);
        }
        this.b = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 12147;
    }
}


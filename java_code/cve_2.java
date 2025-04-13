/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cve
 */
public class cve_2
extends ps_0 {
    private final ArrayList<Long> a = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            this.a.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int a() {
        return 13501;
    }

    public ArrayList<Long> b() {
        return this.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class cBk
extends ps_0 {
    private final Set<fhB> a = new HashSet<fhB>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            fhB fhB2 = new fhB(byteBuffer.getLong());
            fhB2.a(fha_0.a(byteBuffer.get()));
            fhB2.a(byteBuffer.getLong());
            this.a.add(fhB2);
        }
        return false;
    }

    public Set<fhB> b() {
        return this.a;
    }

    @Override
    public int a() {
        return 15396;
    }
}


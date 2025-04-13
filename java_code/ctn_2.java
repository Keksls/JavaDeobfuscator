/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ctN
 */
public class ctn_2
extends ctj_2 {
    private final List<Long> c = new ArrayList<Long>();
    private final List<Long> d = new ArrayList<Long>();
    private final List<Long> e = new ArrayList<Long>();
    private boolean f;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 13, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        boolean bl = this.f = byteBuffer.get() == 1;
        if (!this.f) {
            long l;
            int n;
            int n2 = byteBuffer.get();
            for (n = 0; n < n2; ++n) {
                l = byteBuffer.getLong();
                this.c.add(l);
            }
            n2 = byteBuffer.get();
            for (n = 0; n < n2; ++n) {
                l = byteBuffer.getLong();
                this.d.add(l);
            }
            n2 = byteBuffer.get();
            for (n = 0; n < n2; ++n) {
                l = byteBuffer.getLong();
                this.e.add(l);
            }
        }
        return true;
    }

    @Override
    public int a() {
        return 12029;
    }

    public List<Long> g() {
        return this.c;
    }

    public List<Long> h() {
        return this.d;
    }

    public List<Long> i() {
        return this.e;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.g;
    }

    public boolean j() {
        return this.f;
    }
}


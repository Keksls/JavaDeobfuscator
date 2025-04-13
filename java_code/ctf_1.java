/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.set.hash.THashSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ctF
 */
public final class ctf_1
extends csy_2 {
    private byte b;
    private int c;
    private long d;
    private byte[] e;
    private final THashSet<enu_1> f = new THashSet();
    private final List<byte[]> g = new ArrayList<byte[]>();
    private byte[] h;
    private byte[] i;

    @Override
    public boolean a(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.get();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getLong();
        this.e = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.e);
        int n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            this.f.add((Object)new enu_1(byteBuffer.getLong(), byteBuffer.getLong(), byteBuffer.getInt()));
        }
        n = byteBuffer.getInt();
        this.h = new byte[n];
        byteBuffer.get(this.h);
        int n3 = byteBuffer.getInt();
        this.i = new byte[n3];
        byteBuffer.get(this.i);
        return false;
    }

    public byte[] b() {
        return this.e;
    }

    public byte c() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public long f() {
        return this.d;
    }

    public THashSet<enu_1> g() {
        return this.f;
    }

    public List<byte[]> h() {
        return this.g;
    }

    public byte[] i() {
        return this.h;
    }

    public byte[] j() {
        return this.i;
    }

    @Override
    public int a() {
        return 12170;
    }
}


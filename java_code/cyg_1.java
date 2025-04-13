/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from cyg
 */
public class cyg_1
extends ps_0 {
    private int a;
    private int b;
    private int c;
    private int d;
    private wu_0 e;
    private final TIntArrayList f = new TIntArrayList();
    private byte g;
    private int h;
    private boolean i;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.g = byteBuffer.get();
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.e = wt_0.b(byteBuffer.getLong());
        this.h = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        boolean bl = this.i = byteBuffer.get() == 1;
        while (byteBuffer.hasRemaining()) {
            this.f.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int a() {
        return 12868;
    }

    public TIntArrayList b() {
        return this.f;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public wu_0 f() {
        return this.e;
    }

    public byte g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.d;
    }

    public boolean j() {
        return this.i;
    }
}


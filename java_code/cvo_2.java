/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvo
 */
public class cvo_2
extends ps_0 {
    private eym_2 a;
    private long b;
    private eyj_1 c;
    private eZw d;
    private boolean e;

    @Override
    public boolean a(byte[] byArray) {
        int n;
        Object object;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eym_2.values()[byteBuffer.getInt()];
        this.b = byteBuffer.getLong();
        this.e = byteBuffer.get() == 0;
        int n2 = byteBuffer.getInt();
        if (n2 > 0) {
            byte[] byArray2 = new byte[n2];
            byteBuffer.get(byArray2);
            object = new wn_2();
            ((wn_2)object).b(ByteBuffer.wrap(byArray2));
            this.c = eyj_1.b((wn_2)object);
        }
        if ((n = byteBuffer.getInt()) > 0) {
            object = new byte[n];
            byteBuffer.get((byte[])object);
            this.d = eZy.a((byte[])object);
        }
        return true;
    }

    public eyj_1 b() {
        return this.c;
    }

    public long c() {
        return this.b;
    }

    public boolean d() {
        return this.e;
    }

    public eZw e() {
        return this.d;
    }

    public eym_2 f() {
        return this.a;
    }

    @Override
    public int a() {
        return 12764;
    }
}


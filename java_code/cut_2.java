/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cut
 */
public class cut_2
extends ps_0 {
    private esl_1 a;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = byteBuffer.get() == 1;
        this.a = bl ? esw_2.a(byteBuffer) : null;
        return true;
    }

    public String b() {
        return this.a == null ? null : this.a.i();
    }

    public long c() {
        return this.a == null ? 0L : this.a.j();
    }

    public ArrayList<ese_1> d() {
        return this.a == null ? new ArrayList<ese_1>() : new ArrayList(this.a.l().valueCollection());
    }

    public long e() {
        return this.a == null ? 0L : this.a.a();
    }

    public boolean f() {
        return this.a == null || this.a.k();
    }

    public boolean g() {
        return this.a != null;
    }

    @Override
    public int a() {
        return 14493;
    }
}


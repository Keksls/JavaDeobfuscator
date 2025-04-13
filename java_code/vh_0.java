/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.TLongCollection
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.TLongCollection;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from VH
 */
public class vh_0
implements vg_0 {
    protected static final Logger a = Logger.getLogger(vh_0.class);
    final TLongObjectHashMap<vc_0> b = new TLongObjectHashMap();
    vb_0 c;
    byte d = (byte)-1;
    private TLongArrayList e;

    @Override
    public void a(vb_0 vb_02) {
        this.c = vb_02;
    }

    public vh_0(vd_0 vd_02) {
        this.c = new vb_0(vd_02);
        this.e = new TLongArrayList((TLongCollection)this.c.d());
    }

    @Override
    public void a(long l, short s2, vw_0 vw_02) {
        TLongArrayList tLongArrayList = this.c.d();
        int n = tLongArrayList.size() + 1;
        int n2 = vw_02.b() + this.a(vw_02);
        int n3 = Math.floorMod(n2, n);
        if (this.e != null && n3 != tLongArrayList.size()) {
            long l2 = tLongArrayList.get(n3);
            int n4 = this.e.indexOf(l2);
            int n5 = this.e.indexOf(l);
            if (l2 != 0L && n4 != -1 && n5 != -1 && n5 > n4) {
                ++n3;
            }
        }
        if (n3 <= this.a()) {
            this.d = (byte)(this.d + 1);
            this.b(l, (short)(s2 + 1));
        } else {
            this.b(l, s2);
        }
        this.c.a(l, n3);
        this.c.c();
    }

    private int a(vw_0 vw_02) {
        int n = 0;
        switch (vw_02.a()) {
            case a: {
                n = this.o() ? this.d : (byte)0;
                break;
            }
            case b: {
                n = 0;
                break;
            }
            case c: {
                n = this.c.e().indexOf(vw_02.c());
            }
        }
        return n;
    }

    @Override
    public void a(long l, short s2) {
        this.b(l, (short)(s2 + 1));
    }

    @Override
    public void a(long l, short s2, boolean bl, int n) {
        int n2 = this.c.d().size() + 1;
        int n3 = n + (bl && this.o() ? (int)this.d : 0);
        int n4 = Math.floorMod(n3, n2);
        this.c.a(l, n4);
        this.c.c();
    }

    @Override
    public boolean b(long l) {
        return this.b.containsKey(l);
    }

    private void b(long l, short s2) {
        vc_0 vc_02 = new vc_0(l, s2);
        this.b.put(l, (Object)vc_02);
        this.c.a(l);
    }

    @Override
    public void a(long l) {
        if (!this.b(l)) {
            a.error((Object)("On tente de retirer un fighter absent de la timeline (" + l + ")"));
            return;
        }
        TLongArrayList tLongArrayList = this.i();
        int n = Math.min(this.d + 1, tLongArrayList.size());
        for (int k = 0; k < n; ++k) {
            if (tLongArrayList.getQuick(k) != l) continue;
            this.d = (byte)(this.d - 1);
        }
        this.c.b(l);
        this.b.remove(l);
    }

    @Override
    public void f() {
        this.c.a();
        this.e = new TLongArrayList((TLongCollection)this.c.d());
    }

    @Override
    public void g() {
        this.r();
        this.s();
    }

    private void r() {
        this.c.b();
    }

    @Override
    public void h() {
        this.c.c();
    }

    private void s() {
        this.d = (byte)-1;
    }

    @Override
    public TLongArrayList i() {
        return this.c.d();
    }

    @Override
    public TLongArrayList j() {
        return this.c.e();
    }

    @Override
    @Nullable
    public TLongArrayList k() {
        return this.e;
    }

    @Override
    public boolean o() {
        return this.d >= 0 && this.d < this.i().size();
    }

    @Override
    public long b() {
        if (!this.o()) {
            this.q();
            throw new IllegalStateException("currentFighter() sans hasCurrentFighter()");
        }
        return this.i().get((int)this.d);
    }

    @Override
    public boolean f(long l) {
        return this.o() && this.b() == l;
    }

    vc_0 p() {
        if (!this.o()) {
            this.q();
            throw new IllegalStateException("currentNode() sans hasCurrentFighter()");
        }
        return (vc_0)this.b.get(this.b());
    }

    @Override
    public byte a() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.d + 1 < this.i().size();
    }

    @Override
    public void d() {
        if (!this.c()) {
            return;
        }
        this.d = (byte)(this.d + 1);
    }

    @Override
    public long e() {
        if (!this.c()) {
            throw new IllegalStateException("peekAtNextFighter() sans hasNextFighter()");
        }
        return this.i().get(this.d + 1);
    }

    @Override
    public void m() {
        if (this.o()) {
            this.p().b();
        }
    }

    void q() {
        String string = this.toString();
        a.error((Object)(string + aho_2.a(1, 5)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[Timeline] ");
        stringBuilder.append("P:").append(this.d).append(' ');
        stringBuilder.append("T:[");
        TLongArrayList tLongArrayList = this.i();
        int n = tLongArrayList.size();
        for (int k = 0; k < n; ++k) {
            stringBuilder.append(tLongArrayList.get(k)).append(',');
        }
        if (n > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append("] D:[");
        TLongArrayList tLongArrayList2 = this.c.e();
        int n2 = tLongArrayList2.size();
        for (int k = 0; k < n2; ++k) {
            stringBuilder.append(tLongArrayList2.get(k)).append(',');
        }
        if (n2 > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append(']');
        long[] lArray = this.b.keys();
        int n3 = lArray.length;
        stringBuilder.append(" N:[");
        for (int k = 0; k < n3; ++k) {
            long l = lArray[k];
            if (this.b.get(l) == null) {
                stringBuilder.append('!');
            }
            stringBuilder.append(l).append(',');
        }
        if (n3 > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public boolean a(VW vW, short s2) {
        long l = vW.c();
        vc_0 vc_02 = (vc_0)this.b.get(l);
        if (vc_02 == null) {
            return vW.e() < s2;
        }
        int n = vW.e() - vc_02.c();
        if (!vW.d() && this.f(l)) {
            --n;
        }
        return n < 0;
    }

    @Override
    public short a(VW vW) {
        long l = vW.c();
        vc_0 vc_02 = (vc_0)this.b.get(l);
        if (vc_02 == null) {
            return -1;
        }
        int n = vW.e() - vc_02.c();
        if (vW.d() && !this.f(l)) {
            ++n;
        }
        return (short)n;
    }

    @Override
    public short e(long l) {
        if (!this.b(l)) {
            return -1;
        }
        return (short)(((vc_0)this.b.get(l)).c() - 1);
    }

    @Override
    public boolean c(long l) {
        return this.c() && this.e() == l;
    }

    @Override
    public boolean d(long l) {
        return this.o() && this.b() == l;
    }

    @Override
    public int n() {
        int n = 1 + this.c.f() + 1 + 8 * this.b.size();
        for (long l : this.b.keys()) {
            n += ((vc_0)this.b.get(l)).d();
        }
        return n;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.c.a(byteBuffer);
        byteBuffer.put((byte)this.b.size());
        for (int k = 0; k < this.b.keys().length; ++k) {
            long l = this.b.keys()[k];
            byteBuffer.putLong(l);
            ((vc_0)this.b.get(l)).a(byteBuffer);
        }
        byteBuffer.put(this.d);
    }

    @Override
    public void a(vz_0 vz_02, ByteBuffer byteBuffer) {
        this.c.b(byteBuffer);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            vc_0 vc_02 = vc_0.b(vz_02, byteBuffer);
            vc_02.a(l);
            this.b.put(l, (Object)vc_02);
        }
        this.d = byteBuffer.get();
    }

    public static vh_0 b(vz_0 vz_02, ByteBuffer byteBuffer) {
        vh_0 vh_02 = new vh_0(vz_02.a());
        vh_02.a(vz_02, byteBuffer);
        return vh_02;
    }

    @Override
    public void l() {
        this.b.clear();
        if (this.c != null) {
            this.c.g();
        }
        this.s();
    }
}


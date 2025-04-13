/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class faC
extends faB {
    public static final int b = -1;
    @NotNull
    private Set<Short> a = new HashSet<Short>();
    @Nullable
    private String c = null;
    private boolean d = false;
    @Nullable
    private Ow e = null;
    private short f = (short)-1;
    private short g = (short)-1;
    private boolean h = false;
    private long i = -1L;
    private long j = -1L;
    private boolean k = false;
    private int l = -1;
    private int m = -1;
    @NotNull
    private List<exw_1> n = new ArrayList<exw_1>();
    @NotNull
    private List<faL> o = new ArrayList<faL>();
    private boolean p = false;
    private int q = -1;
    private int r = -1;

    public abstract void a();

    public abstract byte[] b();

    public void b(abx_2 abx_22) {
        this.a(abx_22);
        abx_22.a((short)this.a.size());
        this.a.forEach(abx_22::a);
        byte[] byArray = Cz.a(this.c);
        byte by = Hw.b((long)byArray.length);
        abx_22.a(by);
        abx_22.a(byArray, by);
        abx_22.a(this.d);
        abx_22.a(this.e == null ? (byte)-1 : this.e.c());
        abx_22.a(this.f);
        abx_22.a(this.g);
        abx_22.a(this.h);
        abx_22.a(this.i);
        abx_22.a(this.j);
        abx_22.a(this.k);
        abx_22.a(this.l);
        abx_22.a(this.m);
        abx_22.a((byte)this.n.size());
        this.n.forEach(exw_12 -> abx_22.a(exw_12.a()));
        abx_22.a((byte)this.o.size());
        this.o.forEach(faL2 -> abx_22.a((byte)faL2.a()));
        abx_22.a(this.p);
        abx_22.a(this.q);
        abx_22.a(this.r);
    }

    public void c(ByteBuffer byteBuffer) {
        int n;
        int n2;
        this.b(byteBuffer);
        int n3 = byteBuffer.getShort();
        HashSet<Short> hashSet = new HashSet<Short>(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            hashSet.add(byteBuffer.getShort());
        }
        this.a(hashSet);
        this.a(Cz.b(byteBuffer));
        this.b(byteBuffer.get() == 1);
        this.a((Ow)Ow.b(byteBuffer.get()).orElse(null));
        this.a(byteBuffer.getShort());
        this.b(byteBuffer.getShort());
        this.c(byteBuffer.get() == 1);
        this.a(byteBuffer.getLong());
        this.b(byteBuffer.getLong());
        this.d(byteBuffer.get() == 1);
        this.e(byteBuffer.getInt());
        this.f(byteBuffer.getInt());
        n2 = byteBuffer.get();
        ArrayList<exw_1> arrayList = new ArrayList<exw_1>(n2);
        for (n = 0; n < n2; ++n) {
            arrayList.add(exw_1.a(byteBuffer.get()));
        }
        this.b(arrayList);
        n = byteBuffer.get();
        ArrayList<faL> arrayList2 = new ArrayList<faL>(n);
        for (int k = 0; k < n; ++k) {
            arrayList2.add(faL.a(byteBuffer.get()));
        }
        this.c(arrayList2);
        this.e(byteBuffer.get() > 0);
        this.g(byteBuffer.getInt());
        this.h(byteBuffer.getInt());
    }

    protected int a(byte[] byArray) {
        return faC.i() + 2 + this.a.size() * 2 + 1 + byArray.length + 1 + 1 + 2 + 2 + 1 + 8 + 8 + 1 + 4 + 4 + 1 + this.n.size() * 1 + 1 + this.o.size() * 1 + 1 + 4 + 4;
    }

    public abstract faC b(int var1);

    @NotNull
    public Set<Short> e() {
        return this.a;
    }

    @Nullable
    public String f() {
        return this.c;
    }

    public boolean g() {
        return this.d;
    }

    @Nullable
    public Ow h() {
        return this.e;
    }

    public short n() {
        return this.f;
    }

    public short o() {
        return this.g;
    }

    public boolean p() {
        return this.h;
    }

    public long q() {
        return this.i;
    }

    public long r() {
        return this.j;
    }

    public boolean s() {
        return this.k;
    }

    public int t() {
        return this.l;
    }

    public int u() {
        return this.m;
    }

    @NotNull
    public List<exw_1> v() {
        return this.n;
    }

    @NotNull
    public List<faL> w() {
        return this.o;
    }

    public boolean x() {
        return this.p;
    }

    public int y() {
        return this.q;
    }

    public int z() {
        return this.r;
    }

    public faC a(@NotNull Set<Short> set) {
        if (set == null) {
            throw new NullPointerException("m_itemTypes is marked non-null but is null");
        }
        this.a = set;
        return this;
    }

    public faC a(@Nullable String string) {
        this.c = string;
        return this;
    }

    public faC b(boolean bl) {
        this.d = bl;
        return this;
    }

    public faC a(@Nullable Ow ow) {
        this.e = ow;
        return this;
    }

    public faC a(short s2) {
        this.f = s2;
        return this;
    }

    public faC b(short s2) {
        this.g = s2;
        return this;
    }

    public faC c(boolean bl) {
        this.h = bl;
        return this;
    }

    public faC a(long l) {
        this.i = l;
        return this;
    }

    public faC b(long l) {
        this.j = l;
        return this;
    }

    public faC d(boolean bl) {
        this.k = bl;
        return this;
    }

    public faC e(int n) {
        this.l = n;
        return this;
    }

    public faC f(int n) {
        this.m = n;
        return this;
    }

    public faC b(@NotNull List<exw_1> list) {
        if (list == null) {
            throw new NullPointerException("m_itemRarities is marked non-null but is null");
        }
        this.n = list;
        return this;
    }

    public faC c(@NotNull List<faL> list) {
        if (list == null) {
            throw new NullPointerException("m_slotColors is marked non-null but is null");
        }
        this.o = list;
        return this;
    }

    public faC e(boolean bl) {
        this.p = bl;
        return this;
    }

    public faC g(int n) {
        this.q = n;
        return this;
    }

    public faC h(int n) {
        this.r = n;
        return this;
    }

    @Override
    public String toString() {
        return "ClientSearchParameters(m_itemTypes=" + this.e() + ", m_name=" + this.f() + ", m_exactNameMatch=" + this.g() + ", m_language=" + this.h() + ", m_minLevel=" + this.n() + ", m_maxLevel=" + this.o() + ", m_onlyExtremePrice=" + this.p() + ", m_minPrice=" + this.q() + ", m_maxPrice=" + this.r() + ", m_onlyIfValid=" + this.s() + ", m_minQuantity=" + this.t() + ", m_maxQuantity=" + this.u() + ", m_itemRarities=" + this.v() + ", m_slotColors=" + this.w() + ", m_slotFixedOrder=" + this.x() + ", m_sublimationId=" + this.y() + ", m_specialSublimationId=" + this.z() + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof faC)) {
            return false;
        }
        faC faC2 = (faC)object;
        if (!faC2.a(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.g() != faC2.g()) {
            return false;
        }
        if (this.n() != faC2.n()) {
            return false;
        }
        if (this.o() != faC2.o()) {
            return false;
        }
        if (this.p() != faC2.p()) {
            return false;
        }
        if (this.q() != faC2.q()) {
            return false;
        }
        if (this.r() != faC2.r()) {
            return false;
        }
        if (this.s() != faC2.s()) {
            return false;
        }
        if (this.t() != faC2.t()) {
            return false;
        }
        if (this.u() != faC2.u()) {
            return false;
        }
        if (this.x() != faC2.x()) {
            return false;
        }
        if (this.y() != faC2.y()) {
            return false;
        }
        if (this.z() != faC2.z()) {
            return false;
        }
        Set<Short> set = this.e();
        Set<Short> set2 = faC2.e();
        if (set == null ? set2 != null : !((Object)set).equals(set2)) {
            return false;
        }
        String string = this.f();
        String string2 = faC2.f();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        Ow ow = this.h();
        Ow ow2 = faC2.h();
        if (ow == null ? ow2 != null : !((Object)((Object)ow)).equals((Object)ow2)) {
            return false;
        }
        List<exw_1> list = this.v();
        List<exw_1> list2 = faC2.v();
        if (list == null ? list2 != null : !((Object)list).equals(list2)) {
            return false;
        }
        List<faL> list3 = this.w();
        List<faL> list4 = faC2.w();
        return !(list3 == null ? list4 != null : !((Object)list3).equals(list4));
    }

    @Override
    protected boolean a(Object object) {
        return object instanceof faC;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + (this.g() ? 79 : 97);
        n2 = n2 * 59 + this.n();
        n2 = n2 * 59 + this.o();
        n2 = n2 * 59 + (this.p() ? 79 : 97);
        long l = this.q();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        long l2 = this.r();
        n2 = n2 * 59 + (int)(l2 >>> 32 ^ l2);
        n2 = n2 * 59 + (this.s() ? 79 : 97);
        n2 = n2 * 59 + this.t();
        n2 = n2 * 59 + this.u();
        n2 = n2 * 59 + (this.x() ? 79 : 97);
        n2 = n2 * 59 + this.y();
        n2 = n2 * 59 + this.z();
        Set<Short> set = this.e();
        n2 = n2 * 59 + (set == null ? 43 : ((Object)set).hashCode());
        String string = this.f();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        Ow ow = this.h();
        n2 = n2 * 59 + (ow == null ? 43 : ((Object)((Object)ow)).hashCode());
        List<exw_1> list = this.v();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        List<faL> list2 = this.w();
        n2 = n2 * 59 + (list2 == null ? 43 : ((Object)list2).hashCode());
        return n2;
    }
}


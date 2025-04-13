/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eXq
 */
public abstract class exq_1<ItemType extends exq_1> {
    private static final exh_2[] a = new exh_2[0];
    private boolean b = true;
    private final short c;
    private ItemType d;
    private final short e;
    private final abc_2<ItemType> f = new abc_2();
    private exh_2[] g;
    private exh_2[] h = null;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private short l = (short)-1;

    protected exq_1(short s2, short s3, exh_2[] exh_2Array) {
        this.c = s2;
        this.e = s3;
        this.g = exh_2Array;
        if (s2 == 611) {
            this.g = (exh_2[])ArrayUtils.add((Object[])this.g, (Object)exh_2.y);
        }
    }

    public short d() {
        return this.c;
    }

    public short e() {
        return this.e;
    }

    public ItemType f() {
        return this.d;
    }

    public exq_1<ItemType> g() {
        return this.e() == 0 ? this : ((exq_1)this.f()).g();
    }

    public void a(ItemType ItemType) {
        this.d = ItemType;
    }

    protected boolean b() {
        return this.f.a() != 0;
    }

    protected abc_2<ItemType> c() {
        return this.f;
    }

    public void b(ItemType ItemType) {
        this.f.a(ItemType);
    }

    public boolean c(exq_1<ItemType> exq_12) {
        if (this == exq_12) {
            return true;
        }
        for (ItemType ItemType = this.d; ItemType != null; ItemType = ((exq_1)ItemType).f()) {
            if (ItemType != exq_12) continue;
            return true;
        }
        return false;
    }

    @NotNull
    public exh_2[] h() {
        if (!this.i() && this.f() != null) {
            return ((exq_1)this.f()).h();
        }
        return this.g != null ? this.g : a;
    }

    public boolean i() {
        return this.g != null && this.g.length > 0;
    }

    public void a(exh_2[] exh_2Array) {
        this.g = exh_2Array;
        if (this.c == 611) {
            this.g = (exh_2[])ArrayUtils.add((Object[])this.g, (Object)exh_2.y);
        }
    }

    public boolean a(exh_2 exh_22) {
        exh_2[] exh_2Array = this.h();
        for (int k = exh_2Array.length - 1; k >= 0; --k) {
            if (exh_2Array[k] != exh_22) continue;
            return true;
        }
        return false;
    }

    public exh_2[] j() {
        return this.h != null ? this.h : a;
    }

    public void b(exh_2[] exh_2Array) {
        this.h = exh_2Array;
    }

    public boolean k() {
        return this.i;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public boolean d(exq_1 exq_12) {
        return exq_12.d() == this.c || this.d != null && ((exq_1)this.d).d(exq_12);
    }

    public boolean l() {
        exq_1<ItemType> exq_12 = this;
        while (!exq_12.i()) {
            if ((exq_12 = exq_12.f()) != null) continue;
            return false;
        }
        return exq_12.j;
    }

    public void c(boolean bl) {
        this.j = bl;
    }

    public boolean m() {
        return this.b;
    }

    public void d(boolean bl) {
        this.b = bl;
    }

    public boolean n() {
        return this.k;
    }

    public void e(boolean bl) {
        this.k = bl;
    }

    public short o() {
        return this.l;
    }

    public void a(short s2) {
        this.l = s2;
    }
}


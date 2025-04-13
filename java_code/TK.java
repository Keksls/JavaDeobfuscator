/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongShortHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongShortHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TK<C extends ts_0, R>
extends tr_0<C>
implements UF {
    private static final Logger e = Logger.getLogger(TK.class);
    protected C[] a;
    protected final TLongShortHashMap b;
    protected final tv_0<C, R> c;
    protected tt_0<C> d;

    public TK(tv_0<C, R> tv_02, tt_0<C> tt_02, short s2, boolean bl) {
        super(bl, s2);
        this.a = new ts_0[s2];
        this.b = new TLongShortHashMap((int)s2, 0.5f, -1L, -1);
        this.c = tv_02;
        this.d = tt_02;
    }

    @Override
    public boolean a(short s2) {
        if (s2 < this.g) {
            e.error((Object)"Can't decrease the size of an ArrayInventory");
            return false;
        }
        if (this.a != null && s2 == this.g) {
            return true;
        }
        if (!super.a(s2)) {
            return false;
        }
        ts_0[] ts_0Array = new ts_0[s2];
        System.arraycopy(this.a, 0, ts_0Array, 0, this.a.length);
        this.a = ts_0Array;
        this.b.ensureCapacity((int)s2);
        return true;
    }

    @Override
    public boolean a(C c2) {
        short s2;
        short s3;
        if (c2 == null) {
            return false;
        }
        if (c2.e() <= 0) {
            e.error((Object)("On essaye d'ajouter un item avec une quantit\u00e9 de " + c2.e()), (Throwable)new Exception());
            return false;
        }
        if (this.b.containsKey(c2.a())) {
            throw new Uy("Item with uniqueID " + c2.a() + " is already present in the inventory");
        }
        if (this.d != null && this.d.a(this, c2) < 0) {
            return false;
        }
        short s4 = -1;
        short s5 = -1;
        short s6 = (short)this.a.length;
        for (s3 = 0; s3 < s6; s3 = (short)(s3 + 1)) {
            if (this.a[s3] != null && c2.a((ts_0)this.a[s3])) {
                short s7 = s2 = c2.aR_() > 1 ? (short)1 : 0;
                if (s4 != -1 && this.a[s4].e() < this.a[s3].e()) {
                    s2 = 0;
                }
                if (s2 != 0) {
                    s4 = s3;
                }
            }
            if (this.a[s3] != null || s5 != -1) continue;
            s5 = s3;
        }
        if (this.l() && s4 == -1) {
            throw new uz_0("Cannot add item : maximum size of inventory is reached (" + this.k() + ")");
        }
        if (s4 >= 0 && c2.e() + this.a[s4].e() > c2.aR_() && s5 == -1) {
            throw new uz_0("Cannot add item : There is a possible stack, but his maxSize will be reached, and there is no free place for the rest.  MaxSize : " + this.k());
        }
        s3 = 0;
        if (s4 != -1) {
            s6 = this.a[s4].aR_() - this.a[s4].e();
            s3 = s6 < (s2 = c2.e()) ? s6 : s2;
            this.a[s4].b(s3);
            this.a(um_0.a(this.i, this.a[s4], s4, s3));
        }
        if (c2.e() - s3 > 0) {
            c2.b(-s3);
            if (c2.e() > 0 && s5 != -1) {
                this.a[s5] = c2;
                this.b.put(c2.a(), s5);
                this.a(um_0.a(this.i, c2, s5));
            }
        }
        return true;
    }

    @Override
    public boolean a(long l, short s2) {
        C c2 = this.e(l);
        if (c2 == null) {
            return false;
        }
        if (c2.e() + s2 <= 0) {
            return this.c(c2);
        }
        c2.b(s2);
        this.a(um_0.b(this.i, c2, s2));
        return true;
    }

    @Override
    public short a(long l) {
        C c2 = this.e(l);
        if (c2 == null) {
            return 0;
        }
        return c2.e();
    }

    public boolean a(C c2, short s2) {
        if (c2 == null) {
            e.error((Object)"Impossible d'ajouter un item null");
            return false;
        }
        if (s2 < 0 || s2 >= this.g) {
            e.error((Object)("Impossible d'ajouter un item : position en dehors des limites : " + s2), (Throwable)new Exception());
            return false;
        }
        if (this.d != null && this.d.a((tr_0<C>)this, c2, (C)s2) < 0) {
            e.error((Object)("Position refus\u00e9e par le checker, item=" + c2), (Throwable)new Exception("for stacktrace"));
            return false;
        }
        if (this.b.containsKey(c2.a())) {
            throw new Uy("Item with uniqueID " + c2.a() + " is already present in the inventory");
        }
        C c3 = this.a[s2];
        if (c3 == null) {
            this.a[s2] = c2;
            this.b.put(c2.a(), s2);
            this.a(um_0.a(this.i, c2, s2));
            return true;
        }
        if (!c2.a((ts_0)c3)) {
            throw new uc_0("Cannot add item " + c2 + " at position " + s2 + " item " + this.a[s2] + "already present");
        }
        if (c3.aR_() - c3.e() < c2.e()) {
            throw new uc_0("Cannot add item " + c2 + " at position " + s2 + " item " + this.a[s2] + "already present");
        }
        return this.a(c3.a(), c2.e());
    }

    @Override
    public boolean b(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.b.contains(c2.a())) {
            short s2 = this.b.get(c2.a());
            if (this.a[s2] == null || this.a[s2].a() != c2.a()) {
                e.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s2 + " : " + c2 + " item trouv\u00e9 : " + this.a[s2]));
                return false;
            }
            if (!this.l(c2)) {
                return false;
            }
            this.a(um_0.e(this.i, c2, s2));
            return true;
        }
        return false;
    }

    @Override
    public boolean c(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.b.contains(c2.a())) {
            short s2 = this.b.get(c2.a());
            if (this.a[s2] == null || this.a[s2].a() != c2.a()) {
                e.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s2 + " : " + c2 + " item trouv\u00e9 : " + this.a[s2]));
                return false;
            }
            if (!this.l(c2)) {
                return false;
            }
            this.a(um_0.e(this.i, c2, s2));
            c2.release();
            return true;
        }
        return false;
    }

    @Nullable
    public C b(short s2) {
        C c2 = this.a[s2];
        if (c2 == null) {
            return null;
        }
        if (!this.l(c2)) {
            return null;
        }
        this.a(um_0.e(this.i, c2, s2));
        return c2;
    }

    @Override
    public boolean c(short s2) {
        if (s2 < 0 || s2 >= this.g) {
            return false;
        }
        C c2 = this.a[s2];
        if (c2 == null) {
            return false;
        }
        if (!this.l(c2)) {
            return false;
        }
        this.a(um_0.e(this.i, c2, s2));
        c2.release();
        return true;
    }

    public short b(long l) {
        if (!this.b.containsKey(l)) {
            return -1;
        }
        return this.b.get(l);
    }

    @Deprecated
    public short d(C c2) {
        if (c2 == null) {
            return -1;
        }
        return this.b(c2.a());
    }

    @Override
    @Nullable
    public C c(long l) {
        if (this.b.contains(l)) {
            short s2 = this.b.remove(l);
            if (this.a[s2] == null || this.a[s2].a() != l) {
                e.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s2 + " : id " + l + ". item trouv\u00e9 : " + this.a[s2] + (String)(this.a[s2] == null ? "" : "(id : " + this.a[s2].a() + ")")));
                this.a[s2] = null;
                return null;
            }
            C c2 = this.a[s2];
            if (this.d != null && this.d.b(this, c2) < 0) {
                return null;
            }
            this.a[s2] = null;
            this.a(um_0.e(this.i, c2, s2));
            return c2;
        }
        return null;
    }

    @Override
    public void a(tw_0<C> tw_02) {
        for (C c2 : this.a) {
            if (c2 == null || tw_02 != null && !tw_02.isValid(c2)) continue;
            this.c(c2);
        }
    }

    @Override
    public int a(int n) {
        int n2 = 0;
        for (C c2 : this.a) {
            if (c2 == null || c2.aT_() != n) continue;
            n2 += c2.e();
            this.c(c2);
        }
        return n2;
    }

    @Override
    public int a(int n, int n2) {
        int n3 = 0;
        for (C c2 : this.a) {
            if (c2 != null && c2.aT_() == n) {
                short s2 = c2.e();
                if (s2 <= n2 - n3) {
                    if (this.c(c2)) {
                        n3 += s2;
                    }
                } else {
                    this.a(c2.a(), (short)(n3 - n2));
                    return n2;
                }
            }
            if (n3 < n2) continue;
            return n3;
        }
        return n3;
    }

    @Override
    @NotNull
    public Iterator<C> iterator() {
        return this.a(false);
    }

    public Iterator<C> a(boolean bl) {
        return new aby_1<C>(this.a, bl);
    }

    public C[] a(C ... CArray) {
        System.arraycopy(this.a, 0, CArray, 0, this.a.length);
        return CArray;
    }

    @Override
    public boolean e(C c2) {
        return c2 != null && this.b.containsKey(c2.a());
    }

    @Override
    public boolean d(long l) {
        return this.b.containsKey(l);
    }

    @Override
    public boolean b(int n) {
        for (C c2 : this.a) {
            if (c2 == null || c2.aT_() != n) continue;
            return true;
        }
        return false;
    }

    public boolean d(short s2) {
        return s2 >= 0 && s2 < this.g && this.a[s2] == null;
    }

    @Nullable
    public C e(short s2) {
        if (s2 < 0 || s2 >= this.g) {
            return null;
        }
        return this.a[s2];
    }

    @Override
    @Nullable
    public C e(long l) {
        if (!this.b.contains(l)) {
            return null;
        }
        short s2 = this.b.get(l);
        return this.a[s2];
    }

    @Override
    @Nullable
    public C c(int n) {
        for (C c2 : this.a) {
            if (c2 == null || c2.aT_() != n) continue;
            return c2;
        }
        return null;
    }

    @Override
    @Nullable
    public C a(int n, tw_0<C> tw_02) {
        for (C c2 : this.a) {
            if (c2 == null || c2.aT_() != n || !tw_02.isValid(c2)) continue;
            return c2;
        }
        return null;
    }

    public short f(C c2) {
        short s2 = 0;
        for (C c3 : this.a) {
            if (c2.a((ts_0)c3) && c3.e() + c2.e() <= c3.aR_()) {
                return s2;
            }
            s2 = (short)(s2 + 1);
        }
        return -1;
    }

    public short g(C c2) {
        short s2 = 0;
        for (C c3 : this.a) {
            if (c3 == null || c2.a((ts_0)c3) && c3.e() + c2.e() <= c3.aR_()) {
                return s2;
            }
            s2 = (short)(s2 + 1);
        }
        return -1;
    }

    public short a() {
        short s2 = 0;
        for (C c2 : this.a) {
            if (c2 == null) {
                return s2;
            }
            s2 = (short)(s2 + 1);
        }
        return -1;
    }

    @Override
    public ArrayList<C> d(int n) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.a) {
            if (c2 == null || c2.aT_() != n) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(int n, tw_0<C> tw_02) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.a) {
            if (c2 == null || c2.aT_() != n || !tw_02.isValid(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(tw_0<C> tw_02) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.a) {
            if (c2 == null || !tw_02.isValid(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    public List<C> a(Predicate<C> predicate) {
        return Arrays.stream(this.a).filter(predicate).collect(Collectors.toList());
    }

    @Override
    public int b() {
        return this.b.size();
    }

    @Override
    public int c() {
        int n = this.b();
        if (n == 0) {
            return 0;
        }
        for (int k = this.a.length - 1; k >= 0; --k) {
            this.a[k] = null;
        }
        this.b.clear();
        this.a(um_0.a(this.i));
        return n;
    }

    @Override
    public int aO_() {
        int n = this.b();
        if (n == 0) {
            return 0;
        }
        for (int k = this.a.length - 1; k >= 0; --k) {
            if (this.a[k] != null) {
                this.a[k].release();
            }
            this.a[k] = null;
        }
        this.b.clear();
        this.a(um_0.a(this.i));
        return n;
    }

    @Override
    public tt_0<C> e() {
        return this.d;
    }

    @Override
    public void a(@NotNull tt_0<C> tt_02) {
        this.d = tt_02;
    }

    public boolean h(C c2) {
        if (c2 == null) {
            return false;
        }
        if (c2.e() <= 0) {
            e.error((Object)("On essaye de simuler l'ajout d'un item avec une quantit\u00e9 de " + c2.e()), (Throwable)new Exception());
            return false;
        }
        if (this.e(c2.a()) != null) {
            e.error((Object)("Simulation : Item with uniqueID " + c2.a() + " is already present in the inventory"), (Throwable)new Uy());
            return false;
        }
        if (this.d != null && this.d.a(this, c2) < 0) {
            return false;
        }
        if (!this.l()) {
            return true;
        }
        if (!this.h) {
            return false;
        }
        short s2 = c2.e();
        int n = this.a.length;
        for (int k = 0; k < n && s2 > 0; ++k) {
            C c3 = this.a[k];
            if (!c2.a((ts_0)c3)) continue;
            int n2 = c3.aR_() - c3.e();
            s2 = (short)(s2 - n2);
        }
        return s2 <= 0;
    }

    public boolean b(C c2, short s2) {
        if (c2 == null) {
            return false;
        }
        if (c2.e() <= 0) {
            e.error((Object)("On essaye de simuler l'ajout d'un item avec une quantit\u00e9 de " + c2.e()), (Throwable)new Exception());
            return false;
        }
        if (this.e(c2.a()) != null) {
            e.error((Object)("Simulation : Item with uniqueID " + c2.a() + " is already present in the inventory"), (Throwable)new Uy());
            return false;
        }
        if (s2 < 0 || s2 > this.g - 1) {
            return false;
        }
        if (this.d != null && this.d.a((tr_0<C>)this, c2, (C)s2) < 0) {
            return false;
        }
        C c3 = this.a[s2];
        if (c3 == null) {
            return true;
        }
        boolean bl = c3.aR_() - c3.e() >= c2.e();
        return this.h && c2.a((ts_0)c3) && bl;
    }

    public boolean i(C c2) {
        return c2 != null && !this.m() && this.d(c2.a()) && this.e(c2) && (this.d == null || this.d.b(this, c2) >= 0);
    }

    public boolean b(long l, short s2) {
        C c2 = this.e(l);
        if (c2 == null) {
            return false;
        }
        if (s2 > c2.e()) {
            return false;
        }
        return this.d == null || this.d.b(this, c2) >= 0;
    }

    @Deprecated
    public boolean j(C c2) {
        int n;
        short s2;
        if (c2 == null) {
            return false;
        }
        if (c2.e() <= 0) {
            e.error((Object)("On essaye de simuler l'ajout d'un item avec une quantit\u00e9 de " + c2.e()), (Throwable)new Exception());
            return false;
        }
        if (this.b.containsKey(c2.a())) {
            throw new Uy("Simulation : Item with uniqueID " + c2.a() + " is already present in the inventory");
        }
        if (this.d != null && this.d.a(this, c2) < 0) {
            return false;
        }
        short s3 = -1;
        short s4 = -1;
        short s5 = (short)this.a.length;
        for (s2 = 0; s2 < s5; s2 = (short)((short)(s2 + 1))) {
            if (this.a[s2] != null && this.a[s2] != null && c2.a((ts_0)this.a[s2])) {
                n = 1;
                if (s3 != -1 && this.a[s3].e() < this.a[s2].e()) {
                    n = 0;
                }
                if (n != 0) {
                    s3 = s2;
                }
            }
            if (this.a[s2] != null || s4 != -1) continue;
            s4 = s2;
        }
        if (this.l() && s3 == -1) {
            return false;
        }
        if (s3 >= 0 && c2.e() + this.a[s3].e() > c2.aR_() && s4 == -1) {
            return false;
        }
        s2 = 0;
        s5 = -1;
        if (s3 != -1) {
            short s6;
            n = this.a[s3].aR_() - this.a[s3].e();
            s2 = (short)(n < (s6 = c2.e()) ? n : (int)s6);
            s5 = this.a[s3].e();
            this.a[s3].b(s2);
        }
        if (c2.e() - s2 > 0) {
            if (s3 != -1) {
                this.a[s3].b(-s2);
            }
            if (c2.e() > 0 && s4 != -1) {
                this.a[s4] = c2;
                this.b.put(c2.a(), s4);
                this.a[s4] = null;
                this.b.remove(c2.a());
                return true;
            }
        } else if (s5 != -1) {
            this.a[s3].a(s5);
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean c(C c2, short s2) {
        Object object = this.e(c2.a());
        if (object == null) {
            for (ts_0 ts_02 : this.d(c2.aT_())) {
                if (ts_02.e() <= 1) continue;
                object = ts_02;
            }
        }
        if (object == null) {
            return false;
        }
        if (object.e() + s2 <= 0) {
            this.l(object);
        } else {
            object.b(s2);
        }
        return true;
    }

    @Deprecated
    public boolean c(long l, short s2) {
        C c2 = this.e(l);
        if (c2 == null) {
            return false;
        }
        if (c2.e() + s2 <= 0) {
            this.l(c2);
        } else {
            c2.b(s2);
        }
        return true;
    }

    public tv_0<C, R> f() {
        return this.c;
    }

    private boolean l(@NotNull C c2) {
        if (this.d != null && this.d.b(this, c2) < 0) {
            return false;
        }
        short s2 = this.b.remove(c2.a());
        if (s2 == this.b.getNoEntryValue() && (this.a[s2] == null || this.a[s2].a() != c2.a())) {
            return false;
        }
        this.a[s2] = null;
        return true;
    }

    @Override
    public boolean a(TObjectProcedure<C> tObjectProcedure) {
        for (C c2 : this.a) {
            if (c2 == null || tObjectProcedure.execute(c2)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.getClass().getSimpleName());
        int n = this.a.length;
        for (int k = 0; k < n; ++k) {
            C c2 = this.a[k];
            stringBuilder.append(' ').append(k).append(": ");
            if (c2 != null) {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.append("{}");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public String g() {
        return "arrayInventory";
    }

    public short k(C c2) {
        if (c2 == null) {
            return -1;
        }
        int n = -1;
        short s2 = (short)this.a.length;
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            boolean bl;
            if (this.a[s3] == null || !c2.a((ts_0)this.a[s3])) continue;
            boolean bl2 = bl = c2.aR_() > 1;
            if (n != -1 && this.a[n].e() < this.a[s3].e()) {
                bl = false;
            }
            if (!bl) continue;
            n = s3;
        }
        return n == -1 ? (short)-1 : this.a[n].e();
    }
}


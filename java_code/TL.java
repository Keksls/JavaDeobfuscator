/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TLongShortHashMap
 *  gnu.trove.procedure.TLongShortProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TLongShortHashMap;
import gnu.trove.procedure.TLongShortProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TL<C extends ts_0, R>
extends tr_0<C> {
    private static final Logger k = Logger.getLogger(TL.class);
    private tt_0<C> l;
    protected final Class<C> a;
    protected C[] b;
    protected final TLongShortHashMap c = new TLongShortHashMap();
    protected final tv_0<C, R> d;
    protected final boolean e;

    @Override
    public tt_0<C> e() {
        return this.l;
    }

    @Override
    public void a(tt_0<C> tt_02) {
        this.l = tt_02;
    }

    public TL(Class<C> clazz, tv_0<C, R> tv_02, tt_0<C> tt_02, short s2, boolean bl, boolean bl2) {
        super(bl, s2);
        this.a = clazz;
        this.l = tt_02;
        if (!bl && bl2) {
            throw new IllegalArgumentException("Impossible de cr\u00e9er un inventaire \u00e0 la fois non stackable (donc sans quantit\u00e9) et pour lequel on veut s\u00e9rialiser une quantit\u00e9.");
        }
        this.a(s2);
        this.d = tv_02;
        this.e = bl2;
    }

    @Override
    public final boolean a(short s2) {
        if (s2 < this.k()) {
            k.error((Object)"Can't decrease the size of an ArrayInventory");
            return false;
        }
        if (this.b != null && s2 == this.k()) {
            return true;
        }
        super.a(s2);
        if (this.b == null) {
            this.b = (ts_0[])Array.newInstance(this.a, (int)s2);
        } else {
            ts_0[] ts_0Array = (ts_0[])Array.newInstance(this.a, (int)s2);
            System.arraycopy(this.b, 0, ts_0Array, 0, this.b.length);
            this.b = ts_0Array;
        }
        this.c.ensureCapacity((int)s2);
        return true;
    }

    public boolean d(C c2) {
        return this.l.a(this, c2) >= 0;
    }

    public boolean a(C c2, short s2) {
        return this.l.a((tr_0<C>)this, c2, (C)s2) >= 0;
    }

    @Override
    public boolean b(long l) {
        return this.l.b(this, this.e(l)) >= 0;
    }

    public boolean f(C c2) {
        return this.l.b(this, c2) >= 0;
    }

    public boolean a(C c2, C c3) {
        return this.l.a(this, c2, c3) >= 0;
    }

    @Override
    public boolean a(C c2) {
        if (c2 == null) {
            return false;
        }
        if (c2.e() <= 0) {
            k.error((Object)("On essaye d'ajouter un item avec une quantit\u00e9 de " + c2.e()), (Throwable)new Exception());
            return false;
        }
        if (this.l()) {
            throw new uz_0("Cannot add item : maximum size of inventory is reached (" + this.k() + ")");
        }
        if (this.c.containsKey(c2.a())) {
            throw new Uy("Item with uniqueID " + c2.a() + " is already present in the inventory");
        }
        short s2 = -1;
        short s3 = (short)this.b.length;
        for (short s4 = 0; s4 < s3; s4 = (short)(s4 + 1)) {
            if (this.b[s4] != null) continue;
            s2 = s4;
            break;
        }
        if (s2 == -1) {
            throw new uz_0("Cannot add item : no left space for it (strange, should have said Inventory is full before. Size : " + this.b() + " MaxSize : " + this.k());
        }
        this.b[s2] = c2;
        this.c.put(c2.a(), s2);
        this.a(um_0.a(this.i, c2, s2));
        return true;
    }

    @Override
    public boolean a(long l, short s2) {
        C c2;
        if (!this.h) {
            k.error((Object)"Cannot update quantity of a not stackable inventory");
            return false;
        }
        short s3 = this.c.get(l);
        if (s3 != -1 && (c2 = this.b[s3]) != null) {
            if (c2.e() + s2 <= 0) {
                return this.c(c2);
            }
            if (c2.e() + s2 > c2.aR_()) {
                return false;
            }
            c2.b(s2);
            this.a(um_0.b(this.i, c2, s2));
            return true;
        }
        k.error((Object)"Item Not found");
        return false;
    }

    @Override
    public short a(long l) {
        C c2 = this.e(l);
        if (c2 == null) {
            return 0;
        }
        return c2.e();
    }

    public boolean b(C c2, short s2) {
        if (c2 == null) {
            k.info((Object)"Impossible d'ajouter un item null");
            return false;
        }
        if (s2 < 0 || s2 >= this.g) {
            k.info((Object)("Impossible d'ajouter un item : position en dehors des limites : " + s2));
            return false;
        }
        if (this.b[s2] != null) {
            if (c2.a((ts_0)this.b[s2]) && c2.e() + this.b[s2].e() < c2.aR_()) {
                this.a(this.b[s2].a(), c2.e());
                return true;
            }
            throw new uc_0("Cannot add item " + c2 + " at position " + s2 + " item " + this.b[s2] + "already present");
        }
        if (this.c.containsKey(c2.a())) {
            throw new Uy("Item with uniqueID " + c2.a() + " is already present in the inventory");
        }
        this.b[s2] = c2;
        this.c.put(c2.a(), s2);
        this.a(um_0.a(this.i, c2, s2));
        return true;
    }

    @Override
    public boolean b(C c2) {
        if (c2 == null) {
            return false;
        }
        if (this.c.contains(c2.a())) {
            short s2 = this.c.get(c2.a());
            if (this.b[s2] != c2) {
                k.error((Object)("Probl\u00e8me de logique : table d'index et tableau incoh\u00e9rents. Item attendu \u00e0 la position " + s2 + " : " + c2 + " item trouv\u00e9 : " + this.b[s2]));
                return false;
            }
            this.b[s2] = null;
            this.c.remove(c2.a());
            this.a(um_0.e(this.i, c2, s2));
            return true;
        }
        return false;
    }

    @Override
    public void a(tw_0<C> tw_02) {
        for (C c2 : this.b) {
            if (c2 == null || tw_02 != null && !tw_02.isValid(c2)) continue;
            this.c(c2);
        }
    }

    @Override
    public boolean c(C c2) {
        boolean bl = this.b(c2);
        c2.release();
        return bl;
    }

    public C b(short s2) {
        if (s2 < 0 || s2 >= this.g) {
            return null;
        }
        C c2 = this.b[s2];
        if (c2 == null) {
            return null;
        }
        this.b[s2] = null;
        this.c.remove(c2.a());
        this.a(um_0.e(this.i, c2, s2));
        return c2;
    }

    @Override
    public boolean c(short s2) {
        C c2 = this.b(s2);
        c2.release();
        return true;
    }

    public short f(long l) {
        if (!this.c.containsKey(l)) {
            return -1;
        }
        return this.c.get(l);
    }

    @Deprecated
    public short g(C c2) {
        if (c2 == null) {
            return -1;
        }
        return this.f(c2.a());
    }

    @Override
    @Nullable
    public C c(long l) {
        if (this.c.contains(l)) {
            short s2 = this.c.get(l);
            return this.b(s2);
        }
        return null;
    }

    public TShortArrayList e(int n) {
        TShortArrayList tShortArrayList = null;
        for (C c2 : this.b) {
            short s2;
            if (c2 == null || c2.aT_() != n || !this.c(s2 = this.f(c2.a()))) continue;
            if (tShortArrayList == null) {
                tShortArrayList = new TShortArrayList();
            }
            tShortArrayList.add(s2);
        }
        return tShortArrayList;
    }

    public TShortArrayList b(int n, int n2) {
        TShortArrayList tShortArrayList = null;
        for (C c2 : this.b) {
            short s2;
            if (c2 == null || c2.aT_() != n || !this.c(s2 = this.f(c2.a()))) continue;
            if (tShortArrayList == null) {
                tShortArrayList = new TShortArrayList();
            }
            tShortArrayList.add(s2);
            if (n2 == 1) {
                return tShortArrayList;
            }
            --n2;
        }
        return tShortArrayList;
    }

    @Override
    public int a(int n) {
        return 0;
    }

    @Override
    public int a(int n, int n2) {
        return 0;
    }

    @Override
    @NotNull
    public Iterator<C> iterator() {
        return new aby_1<C>(this.b, false);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        stringBuilder.append(this.getClass().getSimpleName()).append(' ');
        if (this.b == null) {
            stringBuilder.append("contents=null");
        } else {
            int n = this.b.length;
            for (int k = 0; k < n; ++k) {
                stringBuilder.append(k).append(':');
                C c2 = this.b[k];
                if (c2 == null) {
                    stringBuilder.append("<null>");
                } else {
                    stringBuilder.append(c2.getClass().getSimpleName()).append(",ref=").append(c2.aT_()).append(",unique=").append(c2.a());
                }
                stringBuilder.append(' ');
            }
        }
        stringBuilder.append(" / idxByUid={ ");
        if (this.c != null && !this.c.isEmpty()) {
            this.c.forEachEntry((TLongShortProcedure)new TM(this, stringBuilder));
        }
        stringBuilder.append("} ]");
        return stringBuilder.toString();
    }

    @Override
    public boolean e(C c2) {
        return c2 != null && this.c.containsKey(c2.a());
    }

    @Override
    public boolean d(long l) {
        return this.c.containsKey(l);
    }

    @Override
    public boolean b(int n) {
        for (C c2 : this.b) {
            if (c2 == null || c2.aT_() != n) continue;
            return true;
        }
        return false;
    }

    public boolean d(short s2) {
        return s2 >= 0 && s2 < this.g && this.b[s2] == null;
    }

    @Nullable
    public C e(short s2) {
        if (s2 < 0 || s2 >= this.g) {
            return null;
        }
        return this.b[s2];
    }

    @Override
    @Nullable
    public C e(long l) {
        if (!this.c.contains(l)) {
            return null;
        }
        short s2 = this.c.get(l);
        return this.b[s2];
    }

    @Override
    @Nullable
    public C c(int n) {
        for (C c2 : this.b) {
            if (c2 == null || c2.aT_() != n) continue;
            return c2;
        }
        return null;
    }

    @Override
    public C a(int n, tw_0<C> tw_02) {
        for (C c2 : this.b) {
            if (c2 == null || c2.aT_() != n || !tw_02.isValid(c2)) continue;
            return c2;
        }
        return null;
    }

    @Override
    public ArrayList<C> d(int n) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.b) {
            if (c2 == null || c2.aT_() != n) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(int n, tw_0<C> tw_02) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.b) {
            if (c2 == null || c2.aT_() != n || !tw_02.isValid(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public ArrayList<C> b(tw_0<C> tw_02) {
        ArrayList<C> arrayList = new ArrayList<C>();
        for (C c2 : this.b) {
            if (c2 == null || !tw_02.isValid(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    @Override
    public int b() {
        return this.c.size();
    }

    @Override
    public int c() {
        int n = this.b();
        for (int k = this.b.length - 1; k >= 0; --k) {
            this.b[k] = null;
        }
        this.c.clear();
        return n;
    }

    @Override
    public int aO_() {
        int n = this.b();
        for (int k = this.b.length - 1; k >= 0; --k) {
            if (this.b[k] != null) {
                this.b[k].release();
            }
            this.b[k] = null;
        }
        this.c.clear();
        return n;
    }

    @Override
    public boolean a(TObjectProcedure<C> tObjectProcedure) {
        for (C c2 : this.b) {
            if (c2 == null || tObjectProcedure.execute(c2)) continue;
            return false;
        }
        return true;
    }

    public void a(BiConsumer<C, Integer> biConsumer) {
        for (int k = 0; k < this.b.length; ++k) {
            if (this.b[k] == null) continue;
            biConsumer.accept(this.b[k], k);
        }
    }

    public Map<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<Integer, Long>(this.b.length);
        for (int k = 0; k < this.b.length; ++k) {
            if (this.b[k] == null || !this.b[k].j() || this.b[k].a() <= 0L) continue;
            hashMap.put(k, this.b[k].a());
        }
        return hashMap;
    }
}


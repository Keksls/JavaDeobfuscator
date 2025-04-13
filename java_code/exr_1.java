/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.TestOnly
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from eXr
 */
public abstract class exr_1<ItemType extends exq_1> {
    private static final List<Short> c = new ArrayList<Short>();
    protected static final Logger a = Logger.getLogger(eyo_1.class);
    protected final TIntObjectHashMap<ItemType> b = new TIntObjectHashMap();

    protected exr_1() {
        if (c.size() != 0) {
            return;
        }
        c.add((short)106);
        c.add((short)525);
        c.add((short)631);
        c.add((short)751);
        c.add((short)747);
        c.add((short)746);
        c.add((short)745);
        c.add((short)757);
        c.add((short)630);
        c.add((short)752);
        c.add((short)815);
        c.add((short)707);
        c.add((short)512);
        c.add((short)756);
        c.add((short)738);
        c.add((short)766);
        c.add((short)696);
        c.add((short)743);
        c.add((short)744);
        c.add((short)476);
        c.add((short)710);
        c.add((short)647);
        c.add((short)827);
    }

    public void a(ItemType ItemType) {
        this.b.put((int)((exq_1)ItemType).d(), ItemType);
    }

    public ItemType b(int n) {
        return (ItemType)((exq_1)this.b.get(n));
    }

    public ArrayList<ItemType> d() {
        ArrayList<exq_1> arrayList = new ArrayList<exq_1>(1);
        TIntObjectIterator tIntObjectIterator = this.b.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            exq_1 exq_12 = (exq_1)tIntObjectIterator.value();
            if (this.b(exq_12.e()) != null) continue;
            arrayList.add(exq_12);
        }
        return arrayList;
    }

    public void e() {
        exq_1 exq_12;
        ArrayList<exq_1> arrayList = new ArrayList<exq_1>(1);
        TIntObjectIterator tIntObjectIterator = this.b.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            exq_12 = (exq_1)tIntObjectIterator.value();
            exq_1 exq_13 = this.b(exq_12.e());
            exq_12.a(exq_13);
            if (exq_13 == null) {
                if (c.contains(exq_12.d())) {
                    exq_12.d(false);
                }
                arrayList.add(exq_12);
                continue;
            }
            exq_13.b((exq_1)exq_12);
            if (!c.contains(exq_12.d())) continue;
            exq_12.d(false);
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            exq_12 = (exq_1)arrayList.get(k);
            this.b(exq_12);
        }
    }

    private void b(ItemType ItemType) {
        if (!((exq_1)ItemType).b()) {
            return;
        }
        abc_2 abc_22 = ((exq_1)ItemType).c();
        for (int k = abc_22.a() - 1; k >= 0; --k) {
            exq_1 exq_12 = (exq_1)abc_22.a(k);
            exh_2[] exh_2Array = ((exq_1)ItemType).h();
            exh_2[] exh_2Array2 = exq_12.h();
            if (exh_2Array.length != 0 && exh_2Array2.length == 0) {
                exq_12.a(exh_2Array);
            }
            if (((exq_1)ItemType).j() != null && ((exq_1)ItemType).j().length != 0 && (exq_12.j() == null || exq_12.j().length == 0)) {
                exq_12.b(((exq_1)ItemType).j());
            }
            this.b(exq_12);
        }
    }

    public void f() {
        exq_1 exq_12;
        ArrayList<exq_1> arrayList = new ArrayList<exq_1>(1);
        TIntObjectIterator tIntObjectIterator = this.b.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            exq_12 = (exq_1)tIntObjectIterator.value();
            Object ItemType = exq_12.f();
            if (ItemType != null) continue;
            arrayList.add(exq_12);
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            exq_12 = (exq_1)arrayList.get(k);
            this.c(exq_12);
        }
    }

    private void c(exq_1 exq_12) {
        if (!exq_12.b()) {
            return;
        }
        abc_2 abc_22 = exq_12.c();
        for (int k = abc_22.a() - 1; k >= 0; --k) {
            exq_1 exq_13 = (exq_1)abc_22.a(k);
            this.b(exq_13);
        }
    }

    @TestOnly
    public void g() {
        this.b.clear();
    }
}


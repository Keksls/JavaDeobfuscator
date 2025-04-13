/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eBO
 */
public class ebo_0
implements emy_0 {
    private static final Logger a = Logger.getLogger(ebo_0.class);
    private final fh_2 b = ff_2.h();

    public boolean a(ft_1 ft_12, fk_2 fk_22) {
        Map<Integer, fz_1> map = this.b.d();
        if (!map.containsKey(ft_12.getNumber())) {
            this.b.b(ft_12.getNumber(), fz_1.n().a(fk_22).o());
            return true;
        }
        fz_1 fz_12 = map.get(ft_12.getNumber());
        if (fz_12.b().stream().anyMatch(fk_23 -> fk_23.c() == fk_22.c())) {
            a.warn((Object)"[COSMETICS] Trying to add an already owned cosmetic");
            return false;
        }
        fc_2 fc_22 = fz_12.o().a(fk_22);
        if (ft_12 == ft_1.g) {
            fc_22.g(fk_22.c());
        }
        this.b.b(ft_12.getNumber(), fc_22.o());
        return true;
    }

    public void a(ft_1 ft_12, Collection<fk_2> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        HashMap<Integer, fz_1> hashMap = new HashMap<Integer, fz_1>(this.b.d());
        if (!hashMap.containsKey(ft_12.getNumber())) {
            fz_1 fz_12 = fz_1.n().a(collection).o();
            this.b.b(ft_12.getNumber(), fz_12);
            return;
        }
        fz_1 fz_13 = (fz_1)hashMap.get(ft_12.getNumber());
        fc_2 fc_22 = fz_13.o();
        List<fk_2> list = fc_22.b();
        collection.forEach(fk_22 -> {
            if (list.stream().noneMatch(fk_23 -> fk_23.c() == fk_22.c())) {
                fc_22.a((fk_2)fk_22);
            }
        });
        fz_1 fz_14 = fc_22.o();
        this.b.b(ft_12.getNumber(), fz_14);
    }

    public boolean a(ft_1 ft_12, int n) {
        return this.a(ft_12, this.a(n));
    }

    public boolean a(ft_1 ft_12, Set<Integer> set) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            a.error((Object)String.format("[COSMETICS] Failed to remove new flag of cosmetics with id %s from category %s : the category is empty", new Object[]{set, ft_12}));
            return false;
        }
        boolean bl = fz_12.h().containsAll(set);
        if (!bl) {
            a.error((Object)String.format("[COSMETICS] Failed to to remove new flag of cosmetics with id %s from category %s : at least one item supplied is not inside it", new Object[]{set, ft_12}));
            return false;
        }
        fc_2 fc_22 = fz_12.o();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(fc_22.h());
        arrayList.removeAll(set);
        fc_22.w().b(arrayList);
        this.b.b(ft_12.getNumber(), fc_22.o());
        return true;
    }

    public boolean b(ft_1 ft_12, int n) {
        return this.a(ft_12, Collections.singleton(n));
    }

    public boolean c(ft_1 ft_12, int n) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            a.error((Object)String.format("[COSMETICS] Failed to remove cosmetic with id %d from category %s : the category is empty", new Object[]{n, ft_12}));
            return false;
        }
        boolean bl = fz_12.b().stream().anyMatch(fk_22 -> fk_22.c() == n);
        if (!bl) {
            a.error((Object)String.format("[COSMETICS] Failed to remove cosmetic with id %d from category %s : the item is not inside it", new Object[]{n, ft_12}));
            return false;
        }
        Set set = fz_12.b().stream().filter(fk_22 -> fk_22.c() != n).collect(Collectors.toSet());
        fc_2 fc_22 = fz_1.n().a(set);
        fz_12.l().forEach((l, fv_22) -> {
            List list = fv_22.b().stream().filter(fk_22 -> fk_22.c() != n).collect(Collectors.toList());
            fc_22.b((long)l, fv_2.f().a(list).g());
        });
        ArrayList<Integer> arrayList = new ArrayList<Integer>(fz_12.h());
        arrayList.remove((Object)n);
        fc_22.w().b(arrayList);
        this.b.b(ft_12.getNumber(), fc_22.o());
        return true;
    }

    public boolean a(ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            a.error((Object)String.format("[COSMETICS] Failed to remove all cosmetics from category %s : the category is empty", new Object[]{ft_12}));
            return false;
        }
        this.b.b(ft_12.getNumber(), fz_1.n().o());
        return true;
    }

    public boolean a(long l, ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            a.error((Object)String.format("[COSMETICS] Failed to remove active cosmetic for category %s : the category is empty", new Object[]{ft_12}));
            return false;
        }
        fv_2 fv_22 = fz_12.l().get(l);
        boolean bl = fv_22 != null && fv_22.b().size() > 0;
        this.b.b(ft_12.getNumber(), fz_12.o().f(l).o());
        return bl;
    }

    public void a(long l) {
        this.a(l, true);
        Map<Integer, fz_1> map = this.b.d();
        for (Map.Entry<Integer, fz_1> entry : map.entrySet()) {
            HashMap<Long, fv_2> hashMap;
            fz_1 fz_12 = entry.getValue();
            if (!fz_12.l().containsKey(l) || (hashMap = new HashMap<Long, fv_2>(fz_12.l())).remove(l) == null) continue;
            fz_1 fz_13 = fz_12.o().x().b(hashMap).o();
            this.b.b(entry.getKey(), fz_13);
        }
    }

    public boolean a(long l, ft_1 ft_12, fk_2 fk_22) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            a.error((Object)String.format("[COSMETICS] Failed to remove active cosmetic for category %s : the category is empty", new Object[]{ft_12}));
            return false;
        }
        fv_2 fv_22 = fz_12.l().get(l);
        if (fv_22 == null) {
            return false;
        }
        List<fk_2> list = fv_22.b();
        List list2 = list.stream().filter(fk_23 -> fk_23.c() != fk_22.c()).collect(Collectors.toList());
        if (list2.size() == list.size()) {
            return false;
        }
        fv_2 fv_23 = fv_2.f().a(list2).g();
        fz_1 fz_13 = fz_12.o().b(l, fv_23).o();
        this.b.b(ft_12.getNumber(), fz_13);
        return true;
    }

    public boolean b(ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            a.error((Object)String.format("[COSMETICS] Failed to remove active cosmetic for category %s : the category is empty", new Object[]{ft_12}));
            return false;
        }
        this.b.b(ft_12.getNumber(), fz_12.o().x().o());
        return true;
    }

    public Map<Long, fv_2> c(ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            return Collections.emptyMap();
        }
        return fz_12.l();
    }

    public Optional<fv_2> b(long l, ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(fz_12.l().get(l));
    }

    public Optional<fk_2> c(long l, ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            return Optional.empty();
        }
        fv_2 fv_22 = fz_12.l().get(l);
        if (fv_22 == null) {
            return Optional.empty();
        }
        List<fk_2> list = fv_22.b();
        return list.stream().findAny();
    }

    public boolean b(long l, ft_1 ft_12, fk_2 fk_22) {
        if (fk_22.c() == 0 && !fk_22.f() && !fk_22.d()) {
            if (!ebn_0.a(ft_12)) {
                return this.a(l, ft_12);
            }
            return false;
        }
        if (!ebk_0.a(ft_12, fk_22.c(), this)) {
            a.error((Object)String.format("[COSMETICS] Failed to add active cosmetic for category %s : unowned item %d", new Object[]{ft_12, fk_22.c()}));
            return false;
        }
        @NotNull fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (!ebn_0.a(ft_12) || !fz_12.l().containsKey(l)) {
            fv_2 fv_22 = fv_2.f().a(fk_22).g();
            return this.a(l, ft_12, fv_22);
        }
        @NotNull fv_2 fv_23 = fz_12.l().get(l);
        if (fv_23.b().stream().anyMatch(fk_23 -> fk_22.c() == fk_23.c())) {
            return false;
        }
        fv_2 fv_24 = fv_23.g().a(fk_22).g();
        return this.a(l, ft_12, fv_24);
    }

    public boolean a(long l, ft_1 ft_12, fv_2 fv_22) {
        for (fk_2 object2 : fv_22.b()) {
            if (this.a(ft_12, (long)object2.c())) continue;
            a.error((Object)String.format("[COSMETICS] Failed to set active cosmetics for category %s : unowned item %d", new Object[]{ft_12, object2.c()}));
            return false;
        }
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        fc_2 fc_22 = fz_1.n();
        if (fz_12 != null) {
            fc_22.a(fz_12);
        }
        fz_1 fz_13 = fc_22.b(l, fv_22).o();
        this.b.b(ft_12.getNumber(), fz_13);
        return true;
    }

    public boolean a(ft_1 ft_12, long l) {
        if (l == 0L) {
            return true;
        }
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        return fz_12 != null && fz_12.b().stream().anyMatch(fk_22 -> (long)fk_22.c() == l);
    }

    public Collection<fk_2> d(ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            return Collections.emptyList();
        }
        return fz_12.b();
    }

    public Collection<Integer> e(ft_1 ft_12) {
        fz_1 fz_12 = this.b.d().get(ft_12.getNumber());
        if (fz_12 == null) {
            return Collections.emptyList();
        }
        return fz_12.h();
    }

    public boolean b(long l) {
        return !this.b.e().contains(l);
    }

    public void a(long l, boolean bl) {
        if (!bl && !this.b.e().contains(l)) {
            this.b.a(l);
            return;
        }
        ArrayList<Long> arrayList = new ArrayList<Long>(this.b.e());
        arrayList.remove(l);
        this.b.n().a(arrayList);
    }

    private fk_2 a(int n) {
        return fk_2.i().a(n).j();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        try {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            ff_2 ff_22 = ff_2.a(byArray);
            this.b.l();
            this.b.a(ff_22);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)"[COSMETICS] Failed to deserialize cosmetic inventory account data. Keeping old value.", (Throwable)invalidProtocolBufferException);
        }
    }

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = this.b.i().toByteArray();
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return abx_22.c();
    }

    public String toString() {
        return "CosmeticsAccountData{m_cosmeticInventory=" + this.b + "}";
    }

    @Override
    public end_0 e() {
        return end_0.i;
    }
}


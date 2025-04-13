/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

public class eAU {
    private final LinkedList<exk_2> a = new LinkedList();

    public static eAU a(@NotNull lt_0 lt_02, int n) {
        eAU eAU2 = new eAU();
        eAU2.b(lt_02, n);
        return eAU2;
    }

    public static eAU a(int n) {
        eAU eAU2 = new eAU();
        eAU2.a(new LinkedList<lq_0>(), n);
        return eAU2;
    }

    private eAU() {
    }

    private void b(@NotNull lt_0 lt_02, int n) {
        LinkedList linkedList = lt_02.b().stream().sorted(Comparator.comparingInt(lq_0::f)).collect(Collectors.toCollection(LinkedList::new));
        this.a(linkedList, n);
    }

    private void a(LinkedList<lq_0> linkedList, int n) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        while (linkedList.peek() != null && linkedList.peek().f() < 0) {
            exk_2 exk_22 = eyl_1.a(linkedList.poll().c());
            arrayList.add(exk_22);
        }
        for (int k = 0; k < n; ++k) {
            if (linkedList.peek() == null || linkedList.peek().f() != k) {
                this.a.add(null);
                continue;
            }
            exk_2 exk_23 = eyl_1.a(linkedList.poll().c());
            this.a.add(exk_23);
            while (linkedList.peek() != null && linkedList.peek().f() == k) {
                exk_2 exk_24 = eyl_1.a(linkedList.poll().c());
                arrayList.add(exk_24);
            }
        }
        linkedList.forEach(lq_02 -> {
            exk_2 exk_22 = eyl_1.a(lq_02.c());
            this.a.add(exk_22);
        });
        this.a.addAll(arrayList);
    }

    public List<exk_2> a() {
        return Collections.unmodifiableList(this.a);
    }

    public boolean a(long l) {
        return this.a.stream().anyMatch(exk_22 -> exk_22 != null && exk_22.a() == l);
    }

    public boolean a(@NotNull exk_2 exk_22, int n) {
        if (n < 0 || n >= this.a.size()) {
            return false;
        }
        this.a.set(n, exk_22);
        return true;
    }

    public boolean b(@NotNull exk_2 exk_22, int n) {
        if (n < 0 || n >= this.a.size()) {
            return false;
        }
        if (this.a.get(n) != null) {
            return false;
        }
        int n2 = this.c(exk_22.a());
        if (n2 == -1) {
            return false;
        }
        this.a.set(n, exk_22);
        this.a.set(n2, null);
        return true;
    }

    public boolean b(long l) {
        int n = this.c(l);
        if (n == -1) {
            return false;
        }
        this.a.set(n, null);
        return true;
    }

    public boolean a(long l, short s2) {
        int n = this.c(l);
        exk_2 exk_22 = this.a.get(n);
        if (exk_22 == null) {
            return false;
        }
        if (exk_22.e() - s2 <= 0) {
            this.a.set(n, null);
            return true;
        }
        exk_22.b(-s2);
        return true;
    }

    public int c(long l) {
        for (int k = 0; k < this.a.size(); ++k) {
            if (this.a.get(k) == null || this.a.get(k).a() != l) continue;
            return k;
        }
        return -1;
    }

    public Optional<exk_2> b(int n) {
        if (n < 0 || n >= this.a.size()) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.a.get(n));
    }

    public boolean a(long l, long l2) {
        int n = this.c(l);
        int n2 = this.c(l2);
        if (n < 0) {
            return false;
        }
        if (n2 < 0) {
            return false;
        }
        exk_2 exk_22 = this.a.get(n);
        exk_2 exk_23 = this.a.get(n2);
        this.a.set(n, exk_23);
        this.a.set(n2, exk_22);
        return true;
    }
}


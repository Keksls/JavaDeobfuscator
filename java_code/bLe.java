/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bLe
implements ajh_1,
bHp {
    public static final Comparator<bLe> a = Comparator.comparingInt(bLe::k);
    private static final int h = 2;
    public static final String b = "name";
    public static final String d = "icon";
    public static final String e = "subTypes";
    public static final String f = "collapsed";
    public static final String g = "selected";
    private static final String[] i = new String[]{"name", "icon", "subTypes", "collapsed", "selected"};
    @NotNull
    private final bhg_0 j;
    @Nullable
    private final bLe k;
    private final List<bLe> l;
    private boolean m = true;
    private boolean n = false;

    public bLe(@NotNull bhg_0 bhg_02, @Nullable bLe bLe2) {
        this(bhg_02, bLe2, 1);
    }

    private bLe(@NotNull bhg_0 bhg_02, @Nullable bLe bLe2, int n) {
        this.j = bhg_02;
        this.k = bLe2;
        this.l = new ArrayList<bLe>();
        if (n < 2) {
            LinkedList linkedList = new LinkedList();
            this.j.c().forEach(linkedList::add);
            while (!linkedList.isEmpty()) {
                bhg_0 bhg_03 = (bhg_0)linkedList.remove(0);
                if (bhg_03.k()) {
                    this.l.add(new bLe(bhg_03, this, n + 1));
                    continue;
                }
                bhg_03.c().forEach(linkedList::add);
            }
            this.l.sort(a);
        }
    }

    @Override
    public void a(boolean bl) {
        this.m = bl;
        fis_1.a().a((ajf_1)this, f);
    }

    public void b(boolean bl) {
        this.n = bl;
        fis_1.a().a((ajf_1)this, g);
        if (this.k != null) {
            if (!this.n) {
                this.k.b(false);
            } else if (this.k.b()) {
                this.k.b(true);
            }
        }
    }

    public void c(boolean bl) {
        this.b(bl);
        this.l.forEach(bLe2 -> bLe2.c(bl));
    }

    public boolean b() {
        if (this.l.isEmpty()) {
            return this.n;
        }
        return this.l.stream().allMatch(bLe::b);
    }

    public boolean e() {
        return this.k != null && this.k.n;
    }

    public void a(Consumer<bLe> consumer) {
        bLe bLe2 = this;
        while (bLe2.k != null) {
            bLe2 = bLe2.k;
        }
        bLe.a(bLe2, consumer);
    }

    public void b(Consumer<bLe> consumer) {
        bLe.a(this, consumer);
    }

    private static void a(bLe bLe2, Consumer<bLe> consumer) {
        LinkedList<bLe> linkedList = new LinkedList<bLe>();
        linkedList.add(bLe2);
        while (!linkedList.isEmpty()) {
            bLe bLe3 = (bLe)linkedList.remove(0);
            consumer.accept(bLe3);
            linkedList.addAll(bLe3.l);
        }
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.f();
            }
            case "icon": {
                return this.l();
            }
            case "subTypes": {
                return this.l;
            }
            case "collapsed": {
                return this.m;
            }
            case "selected": {
                return this.n;
            }
        }
        return null;
    }

    public String f() {
        return this.j.a(true);
    }

    private int k() {
        return this.j.o();
    }

    private String l() {
        return azs_0.a().a(this.j.d());
    }

    @Override
    public String[] d() {
        return i;
    }

    public String toString() {
        return "type=" + this.j.a();
    }

    @NotNull
    public bhg_0 g() {
        return this.j;
    }

    @Nullable
    public bLe h() {
        return this.k;
    }

    public List<bLe> i() {
        return this.l;
    }

    @Override
    public boolean a() {
        return this.m;
    }

    public boolean j() {
        return this.n;
    }
}


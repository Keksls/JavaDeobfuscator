/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bqC
implements ajh_1 {
    public static final String a = "compartments";
    public static final String b = "hasAdminRights";
    public static final String[] d = new String[]{"compartments", "hasAdminRights"};
    private final List<bqE> e;
    private List<bqE> f;
    private String g;
    private final boolean h;

    public bqC(List<bqE> list, boolean bl) {
        this.e = new ArrayList<bqE>(list);
        this.h = bl;
        this.g = null;
        this.c();
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return Collections.unmodifiableList(this.f);
        }
        if (b.equals(string)) {
            return this.h;
        }
        return null;
    }

    public Optional<bqE> a(@NotNull String string) {
        return this.e.stream().filter(bqE2 -> string.equalsIgnoreCase(bqE2.j())).findFirst();
    }

    public Optional<bqE> a() {
        return this.e.stream().filter(bqE::e).findFirst();
    }

    public String b() {
        return this.g;
    }

    public void c(String string) {
        this.g = string;
    }

    public final void c() {
        Stream<Object> stream = this.e.stream();
        if (!Cz.f(this.g)) {
            String string = Cz.o(this.g);
            stream = stream.filter(bqE2 -> Cz.o(bqE2.a()).contains(string));
        }
        this.f = stream.collect(Collectors.toList());
        fis_1.a().a((ajf_1)this, a);
    }

    public void e(@NotNull String string) {
        bqE bqE2;
        Optional<bqE> optional = this.a(string);
        if (optional.isEmpty()) {
            return;
        }
        Optional<bqE> optional2 = this.a();
        if (optional2.isPresent()) {
            bqE2 = optional2.get();
            bqE2.a(false);
            fis_1.a().a((ajf_1)bqE2, "selected");
        }
        bqE2 = optional.get();
        bqE2.a(true);
        fis_1.a().a((ajf_1)bqE2, "selected");
    }

    public Optional<bqE> a(bqE bqE2) {
        if (this.e.indexOf(bqE2) == 0) {
            return Optional.empty();
        }
        bqE bqE3 = null;
        for (bqE bqE4 : this.e) {
            if (bqE4 == bqE2) {
                return Optional.ofNullable(bqE3);
            }
            bqE3 = bqE4;
        }
        return Optional.empty();
    }

    public Optional<bqE> b(bqE bqE2) {
        boolean bl = false;
        for (bqE bqE3 : this.e) {
            if (bqE3 == bqE2) {
                bl = true;
                continue;
            }
            if (!bl) continue;
            return Optional.ofNullable(bqE3);
        }
        return Optional.empty();
    }

    public boolean c(bqE bqE2) {
        boolean bl = this.e.remove(bqE2);
        if (bl) {
            this.c();
        }
        return bl;
    }

    public void a(String string, String string2) {
        Optional<bqE> optional = this.a(string);
        Optional<bqE> optional2 = this.a(string2);
        if (optional.isEmpty() || optional2.isEmpty()) {
            return;
        }
        int n = this.e.indexOf(optional.get());
        int n2 = this.e.indexOf(optional2.get());
        this.e.set(n, optional2.get());
        this.e.set(n2, optional.get());
        this.c();
    }

    public void a(String string, int n) {
        Optional<bqE> optional = this.a(string);
        if (optional.isEmpty()) {
            return;
        }
        bqE bqE2 = optional.get();
        bqE2.b(bqE2.g() - n);
        fis_1.a().a((ajf_1)bqE2, "remainingCapacity");
    }
}


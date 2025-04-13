/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public final class aUS {
    private final Map<Long, auq_0> b = new HashMap<Long, auq_0>();
    public static final aUS a = new aUS();

    private aUS() {
    }

    public void a(long l, String string, String string2, String string3) {
        auq_0 auq_02 = this.b.computeIfAbsent(l, auq_0::new);
        auq_02.a(string);
        auq_02.d(string2);
        auq_02.b(string3);
        auq_02.c(aVc.a(l));
    }

    public void a(long l) {
        this.b.remove(l);
    }

    public void a(long l, auu_0 auu_02) {
        auq_0 auq_02 = this.b.computeIfAbsent(l, auq_0::new);
        auq_02.a(auu_02);
    }

    public void a(long l, aut_0 aut_02) {
        auq_0 auq_02 = this.b.computeIfAbsent(l, auq_0::new);
        auq_02.a(aut_02);
    }

    public void a(long l, aur_0 aur_02) {
        auq_0 auq_02 = this.b.computeIfAbsent(l, auq_0::new);
        auq_02.a(aur_02);
    }

    public Optional<String> a(String string) {
        if (Cz.f(string)) {
            return Optional.empty();
        }
        return this.b.values().stream().filter(auq_02 -> string.equalsIgnoreCase(auq_02.f())).map(auq_02 -> aUS.a(auq_02.b(), auq_02.g())).findFirst();
    }

    public static String a(String string, String string2) {
        return string + (String)(Cz.f(string2) ? "" : "#" + string2);
    }

    public List<String> b(String string) {
        if (Cz.f(string)) {
            return Collections.emptyList();
        }
        return this.b.values().stream().filter(auq_02 -> string.equalsIgnoreCase(auq_02.b())).map(auq_0::f).collect(Collectors.toList());
    }

    public Optional<String> b(String string, String string2) {
        if (Cz.f(string)) {
            return Optional.empty();
        }
        return this.b.values().stream().filter(auq_02 -> string.equalsIgnoreCase(auq_02.b())).filter(auq_02 -> string2.equalsIgnoreCase(auq_02.g())).map(auq_0::f).findFirst();
    }

    public List<auq_0> a() {
        return ImmutableList.copyOf(this.b.values());
    }

    public void b() {
        this.b.clear();
    }

    public int b(long l) {
        auq_0 auq_02 = this.b.get(l);
        if (auq_02 != null && auq_02.h() != null) {
            return auq_02.h().b();
        }
        return aur_0.g.b();
    }
}


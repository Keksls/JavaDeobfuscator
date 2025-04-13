/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fiR {
    private static final Logger a = Logger.getLogger(fiR.class);
    private final Map<Integer, fiO> b = new LinkedHashMap<Integer, fiO>();
    private final List<fiS> c = new ArrayList<fiS>();

    public fiR() {
        this.a();
    }

    public final void a() {
        if (!this.b.containsKey(0)) {
            this.b.put(0, new fiO());
        }
    }

    public Optional<Integer> a(fiO fiO2) {
        for (Map.Entry<Integer, fiO> entry : this.b.entrySet()) {
            if (!Objects.equals(entry.getValue(), fiO2)) continue;
            return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    public void a(int n, fiO fiO2) {
        this.b.put(n, fiO2);
        this.b(fiO2);
    }

    public boolean a(int n) {
        return this.b(n) != null;
    }

    @Nullable
    public fiO b(int n) {
        return this.b.get(n);
    }

    @NotNull
    public fiO a(int n, int n2) {
        fiO fiO2 = new fiO();
        fiO2.a(n2);
        this.a(n, fiO2);
        return fiO2;
    }

    public void c(int n) {
        fiO fiO2 = this.b.remove(n);
        if (fiO2 != null) {
            this.d(n);
        }
    }

    @NotNull
    public Map<Integer, fiO> b() {
        return Collections.unmodifiableMap(this.b);
    }

    private void b(fiO fiO2) {
        for (fiS fiS2 : this.c) {
            try {
                fiS2.a(fiO2);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void d(int n) {
        for (fiS fiS2 : this.c) {
            try {
                fiS2.a(n);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void a(fiS fiS2) {
        if (this.c.contains(fiS2)) {
            return;
        }
        this.c.add(fiS2);
    }

    public void b(fiS fiS2) {
        this.c.remove(fiS2);
    }

    public void c() {
        this.d();
        this.f();
    }

    public void d() {
        this.b.clear();
        this.a();
    }

    private void f() {
        this.c.clear();
    }

    public int e() {
        return this.b.size();
    }

    public void a(fiR fiR2) {
        this.d();
        fiR2.b().forEach(this::a);
    }

    public String toString() {
        return "SpellDeckSet{m_spellDecks=" + this.b + "}";
    }
}


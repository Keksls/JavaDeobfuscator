/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from ezM
 */
public class ezm_1 {
    private static final Logger a = Logger.getLogger(ezm_1.class);
    private int b = -1;
    private int c = -2;
    private final Map<Integer, ezj_1> d = new LinkedHashMap<Integer, ezj_1>();
    private final List<ezo_1> e = new ArrayList<ezo_1>();

    @Nullable
    public ezj_1 a(int n) {
        return this.d.get(n);
    }

    @NotNull
    public @Unmodifiable Map<Integer, ezj_1> a() {
        return Collections.unmodifiableMap(this.d);
    }

    public int b(int n) {
        if (!this.d.containsKey(n)) {
            a.error((Object)("[Builds] Cannot set active sheet index to " + n + " because no build has that index"));
            return this.b;
        }
        int n2 = this.b;
        this.b = n;
        this.l();
        return n2;
    }

    public void a(ezj_1 ezj_12) {
        this.d.put(ezj_12.e(), ezj_12);
        this.a(this, ezj_12);
    }

    public int b() {
        int n = 1;
        while (this.d.containsKey(n)) {
            ++n;
        }
        return n;
    }

    public int c() {
        int n = 0;
        for (ezj_1 ezj_12 : this.d.values()) {
            if (ezj_12.f()) continue;
            ++n;
        }
        return n;
    }

    public List<ezi_1> a(short s2) {
        Set set = this.d.values().stream().filter(ezj_1::f).map(ezj_1::c).collect(Collectors.toSet());
        ArrayList<ezi_1> arrayList = new ArrayList<ezi_1>();
        for (ezi_1 ezi_12 : ezi_1.q) {
            if (ezi_12.a() + 1 > s2) break;
            if (set.contains(ezi_12.a())) continue;
            arrayList.add(ezi_12);
        }
        return arrayList;
    }

    public void c(int n) {
        ezj_1 ezj_12 = this.d.remove(n);
        if (ezj_12 != null) {
            this.b(ezj_12);
        }
    }

    @NotNull
    public ezj_1 d() {
        return this.d.get(this.b);
    }

    public int e() {
        return this.b;
    }

    void d(int n) {
        this.c = n;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d.size();
    }

    public void a(int n, ezj_1 ezj_12) {
        this.d.put(n, ezj_12);
    }

    public short h() {
        return (short)this.d().c();
    }

    public Optional<Integer> e(int n) {
        for (Map.Entry<Integer, ezj_1> entry : this.d.entrySet()) {
            ezj_1 ezj_12 = entry.getValue();
            if (!ezj_12.f() || ezj_12.c() != n) continue;
            return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    private void a(ezm_1 ezm_12, ezj_1 ezj_12) {
        for (ezo_1 ezo_12 : this.e) {
            ezo_12.a(ezm_12, ezj_12);
        }
    }

    private void l() {
        for (ezo_1 ezo_12 : this.e) {
            try {
                ezo_12.a(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void b(ezj_1 ezj_12) {
        for (ezo_1 ezo_12 : this.e) {
            try {
                ezo_12.b(this, ezj_12);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public boolean a(ezo_1 ezo_12) {
        return !this.e.contains(ezo_12) && this.e.add(ezo_12);
    }

    public List<ezo_1> i() {
        return this.e;
    }

    public boolean b(ezo_1 ezo_12) {
        return this.e.remove(ezo_12);
    }

    public void j() {
        this.e.clear();
    }

    public void k() {
        this.b = 0;
        this.d.clear();
        this.e.clear();
    }

    public String toString() {
        return "BuildSheetSet{m_activeSheetIndex=" + this.b + ", m_sheets=" + this.d + "}";
    }
}


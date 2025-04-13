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
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from ezy
 */
public class ezy_2 {
    private static final Logger a = Logger.getLogger(ezy_2.class);
    private final Map<Integer, ezx_2> b = new LinkedHashMap<Integer, ezx_2>();
    private final List<ezs_1> c = new ArrayList<ezs_1>();

    public void a(int n, ezx_2 ezx_22) {
        this.b.put(n, ezx_22);
        this.b(ezx_22);
    }

    @Nullable
    public <T extends ezx_2> T a(int n) {
        return (T)this.b.get(n);
    }

    public int a() {
        return this.b.size();
    }

    @NotNull
    public ezx_2 a(int n, int n2) {
        ezu_1 ezu_12 = new ezu_1();
        ezu_12.b((short)n2);
        this.a(n, ezu_12);
        return ezu_12;
    }

    public void b(int n) {
        ezx_2 ezx_22 = this.b.remove(n);
        if (ezx_22 != null) {
            this.a(ezx_22);
        }
    }

    private void a(ezx_2 ezx_22) {
        for (ezs_1 ezs_12 : this.c) {
            try {
                ezs_12.b(ezx_22);
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)("[Builds] Error while running listener when removing aptitude sheet " + ezx_22), (Throwable)runtimeException);
            }
        }
    }

    public boolean c(int n) {
        return this.b.containsKey(n);
    }

    @NotNull
    public @Unmodifiable Map<Integer, ezx_2> b() {
        return Collections.unmodifiableMap(this.b);
    }

    private void b(ezx_2 ezx_22) {
        for (ezs_1 ezs_12 : this.c) {
            try {
                ezs_12.a(ezx_22);
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)("[Builds] Error while running listener when setting aptitude sheet " + ezx_22), (Throwable)runtimeException);
            }
        }
    }

    public void a(ezs_1 ezs_12) {
        if (this.c.contains(ezs_12)) {
            return;
        }
        this.c.add(ezs_12);
    }

    public void b(ezs_1 ezs_12) {
        this.c.remove(ezs_12);
    }

    public void c() {
        this.e();
        this.f();
    }

    public void d() {
        for (ezs_1 ezs_12 : this.c) {
            ezs_12.a(this);
        }
    }

    private void e() {
        this.b.clear();
    }

    private void f() {
        this.c.clear();
    }

    public String toString() {
        return "AptitudeSheetSet{m_aptitudeSheets=" + this.b + "}";
    }
}


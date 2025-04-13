/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bkg
 */
public class bkg_1 {
    public static final bkg_1 a = new bkg_1();
    private final Map<Short, bkf_0> b = new HashMap<Short, bkf_0>();
    private final Map<Byte, bkh_1> c = new HashMap<Byte, bkh_1>();

    private bkg_1() {
    }

    public Optional<bkf_0> a() {
        if (!wc_0.p().l()) {
            return Optional.empty();
        }
        return this.a(wc_0.p().a());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Optional<bkf_0> a(wu_0 wu_02) {
        Map<Short, bkf_0> map = this.b;
        synchronized (map) {
            short s2 = eyw_2.a(wu_02);
            bkf_0 bkf_02 = this.b.get(s2);
            if (bkf_02 != null) {
                return Optional.of(bkf_02);
            }
            this.e(wu_02);
            return Optional.empty();
        }
    }

    public boolean b(wu_0 wu_02) {
        return this.d(wu_02) && this.c(wu_02);
    }

    private void e(wu_0 wu_02) {
        String string = bae.h().f().h();
        btx_1.a().a(string, wu_02);
    }

    public Optional<bkh_1> b() {
        if (!wc_0.p().l()) {
            return Optional.empty();
        }
        wu_0 wu_02 = wc_0.p().a();
        return this.a(wu_02, (byte)wu_02.m());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Optional<bkh_1> a(wu_0 wu_02, byte by) {
        Map<Byte, bkh_1> map = this.c;
        synchronized (map) {
            bkh_1 bkh_12 = this.c.get(by);
            if (bkh_12 != null) {
                return Optional.of(bkh_12);
            }
            this.e(wu_02);
            return Optional.empty();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(wu_0 wu_02) {
        Map<Byte, bkh_1> map = this.c;
        synchronized (map) {
            byte by = (byte)wu_02.m();
            bkh_1 bkh_12 = this.c.get(by);
            return bkh_12 != null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bkh_1 bkh_12, wu_0 wu_02) {
        Map<Byte, bkh_1> map = this.c;
        synchronized (map) {
            byte by = (byte)wu_02.m();
            this.c.put(by, bkh_12);
        }
    }

    public boolean c() {
        if (!wc_0.p().l()) {
            return false;
        }
        return this.d(wc_0.p().a());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(wu_0 wu_02) {
        Map<Short, bkf_0> map = this.b;
        synchronized (map) {
            short s2 = eyw_2.a(wu_02);
            bkf_0 bkf_02 = this.b.get(s2);
            return bkf_02 != null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bkf_0 bkf_02, wu_0 wu_02) {
        Map<Short, bkf_0> map = this.b;
        synchronized (map) {
            short s2 = eyw_2.a(wu_02);
            this.b.put(s2, bkf_02);
        }
    }

    @NotNull
    public String a(@NotNull bkh_1 bkh_12) {
        return bae.h().a("calendar.month." + bkh_12.a(), new Object[0]);
    }
}


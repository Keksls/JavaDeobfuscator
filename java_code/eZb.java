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
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class eZb {
    private static final Logger a = Logger.getLogger(eZb.class);
    private final Map<Integer, eyz_0> b = new LinkedHashMap<Integer, eyz_0>();
    private final long c;
    private final List<eZd> d = new ArrayList<eZd>();

    public eZb(long l) {
        this.c = l;
    }

    public void a(long l) {
        for (Map.Entry<Integer, eyz_0> entry : this.b.entrySet()) {
            byte by = entry.getKey().byteValue();
            eyz_0 eyz_02 = entry.getValue();
            for (eZd eZd2 : this.d) {
                eZd2.a(by, eyz_02, l, this.c);
            }
        }
    }

    public void a(int n, eyz_0 eyz_02) {
        this.b.put(n, eyz_02);
        this.b(n, eyz_02);
    }

    public Optional<eyz_0> a(int n) {
        eyz_0 eyz_02 = this.b.remove(n);
        if (eyz_02 == null) {
            return Optional.empty();
        }
        this.a(this.c, n, eyz_02);
        return Optional.of(eyz_02);
    }

    @NotNull
    public eyz_0 a(int n, int n2) {
        eyz_0 eyz_02 = new eyz_0();
        eyz_02.a((short)n2);
        this.a(n, eyz_02);
        return eyz_02;
    }

    @NotNull
    public Map<Integer, eyz_0> a() {
        return Collections.unmodifiableMap(this.b);
    }

    @Nullable
    public eyz_0 a(byte by) {
        return this.b.get(by);
    }

    public int b() {
        return this.b.size();
    }

    public long c() {
        return this.c;
    }

    public void a(eZd eZd2) {
        if (!this.d.contains(eZd2)) {
            this.d.add(eZd2);
        }
    }

    private void b(int n, eyz_0 eyz_02) {
        for (eZd eZd2 : this.d) {
            try {
                Object t = euw_2.a.d(this.c);
                eZd2.a(n, eyz_02, ((epq_2)t).U_(), this.c);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void a(long l, int n, eyz_0 eyz_02) {
        for (eZd eZd2 : this.d) {
            try {
                eZd2.a(l, n, eyz_02);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public String toString() {
        return "EquipmentSheetSet{m_sheets=" + this.b + ", m_characterId=" + this.c + "}";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.Optional;
import org.apache.log4j.Logger;

public class fii {
    protected static final Logger a = Logger.getLogger(fii.class);
    private final int c;
    private final String d;
    private final int e;
    private final String f;
    private final int[] g;
    private boolean h = true;
    private final boolean i = false;

    public fii(int n, String string, int n2, String string2, int[] nArray) {
        this.c = n;
        this.d = string;
        this.e = n2;
        this.f = string2;
        this.g = nArray;
    }

    public int a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public boolean e() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this.g.length != 0;
    }

    public boolean a(epq_2 epq_22) {
        return !this.g() || this.b(epq_22) != null;
    }

    public exk_2 b(epq_2 epq_22) {
        assert (this.g());
        Long l = epq_22.cG().a(exh_2.r);
        eyt_0 eyt_02 = eyx_0.a.a(epq_22.U_(), epq_22.a_());
        if (eyt_02 == null) {
            return null;
        }
        Optional<exk_2> optional = eyt_02.b(l);
        if (optional.isPresent()) {
            exk_2 exk_22 = optional.get();
            if (this.a(exk_22)) {
                return exk_22;
            }
            for (int n : this.g) {
                exk_2 exk_23 = epq_22.dS().e(n);
                if (exk_23 == null) continue;
                return exk_23;
            }
        }
        return null;
    }

    private boolean a(ts_0 ts_02) {
        if (ts_02 == null) {
            return false;
        }
        for (int n : this.g) {
            if (ts_02.aT_() != n) continue;
            return true;
        }
        return false;
    }

    public int[] h() {
        return (int[])this.g.clone();
    }

    public String toString() {
        return "ActionVisual{m_visualId=" + this.c + ", m_animLink='" + this.d + "', m_mruGfx=" + this.e + ", m_mruLabelKey='" + this.f + "', m_associatedItems=" + Arrays.toString(this.g) + ", m_enabled=" + this.h + ", m_multiCell=false}";
    }
}


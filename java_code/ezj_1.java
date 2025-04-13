/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from ezJ
 */
public class ezj_1 {
    private static final Logger a = Logger.getLogger(ezj_1.class);
    private String b;
    private int c;
    private int d;
    private int e = 1;
    private boolean f;
    private final List<ezk_1> g = new ArrayList<ezk_1>();

    public ezj_1(String string, int n, int n2, boolean bl) {
        this(string, n, n2, ezp_1.b(), bl);
    }

    public ezj_1(String string, int n, int n2, int n3, boolean bl) {
        this.b = string;
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = n2 == 0 || bl;
    }

    public static ezj_1 a() {
        return new ezj_1("", -1, 0, true);
    }

    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
        this.g();
    }

    public int c() {
        return this.c;
    }

    public int a(epq_2 epq_22) {
        return this.c == -1 ? epq_22.dt() : this.c;
    }

    public void a(int n) {
        this.c = n;
        this.h();
    }

    public int d() {
        return this.e;
    }

    public void b(int n) {
        this.e = n;
    }

    public int e() {
        return this.d;
    }

    public void c(int n) {
        this.d = n;
    }

    public boolean f() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = this.d == 0 || bl;
    }

    private void g() {
        for (ezk_1 ezk_12 : this.g) {
            try {
                ezk_12.a(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void h() {
        for (ezk_1 ezk_12 : this.g) {
            try {
                ezk_12.b(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public void a(ezj_1 ezj_12) {
        this.a(ezj_12.b);
        this.a(ezj_12.c);
        this.b(ezj_12.e);
    }

    public boolean a(ezk_1 ezk_12) {
        return !this.g.contains(ezk_12) && this.g.add(ezk_12);
    }

    public boolean b(ezk_1 ezk_12) {
        return this.g.remove(ezk_12);
    }

    public String toString() {
        return "BuildSheetModel{m_name='" + this.b + "', m_level=" + this.c + ", m_index=" + this.d + ", m_iconIndex=" + this.e + "}";
    }
}


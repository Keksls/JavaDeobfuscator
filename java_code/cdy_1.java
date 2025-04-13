/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cdY
 */
public class cdy_1
implements ajf_1 {
    public static final String a = "widthInput";
    public static final String b = "heightInput";
    public static final String d = "textureInput";
    public static final String e = "withStatesInput";
    public static final String f = "gapInput";
    public static final String g = "xWestInput";
    public static final String h = "xCenterInput";
    public static final String i = "xEastInput";
    public static final String j = "yNorthInput";
    public static final String k = "yCenterInput";
    public static final String l = "ySouthInput";
    public static final String m = "westWidthInput";
    public static final String n = "centerWidthInput";
    public static final String o = "eastWidthInput";
    public static final String p = "northHeightInput";
    public static final String q = "centerHeightInput";
    public static final String r = "southHeightInput";
    public static final String s = "width";
    public static final String t = "height";
    public static final String u = "texture";
    public static final String v = "isValid";
    public static final String w = "output";
    public static final String x = "textureList";
    public static final String y = "<pixmapBackground scaled=\"true\">\n";
    public static final String z = "</pixmapBackground>\n";
    public static final String A = "\t<Pixmap texture=\"%s\" position=\"%s\" x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\"/>\n";
    private final List<String> C = new ArrayList<String>(fpm_0.b().g().i());
    private int D;
    private int E;
    private String F;
    private boolean G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private String U;
    public static final String[] B = new String[]{"widthInput", "heightInput", "textureInput", "gapInput", "withStatesInput", "xWestInput", "xCenterInput", "xEastInput", "yNorthInput", "yCenterInput", "ySouthInput", "westWidthInput", "centerWidthInput", "eastWidthInput", "northHeightInput", "centerHeightInput", "southHeightInput", "width", "height", "texture", "isValid", "output", "textureList"};

    public cdy_1() {
        this.C.sort((string, string2) -> {
            boolean bl = string.startsWith("tx");
            boolean bl2 = string2.startsWith("tx");
            if (bl && !bl2) {
                return -1;
            }
            if (!bl && bl2) {
                return 1;
            }
            return string.compareTo((String)string2);
        });
    }

    @Override
    public String[] d() {
        return B;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "width": {
                return this.D;
            }
            case "height": {
                return this.E;
            }
            case "texture": {
                return this.F;
            }
            case "isValid": {
                return this.w();
            }
            case "textureList": {
                return this.C;
            }
            case "output": {
                if (this.U == null) break;
                return this.U.replace("<", "&lt;").replace(">", "&gt;");
            }
        }
        return null;
    }

    private boolean w() {
        if (this.F == null || this.F.isEmpty()) {
            return false;
        }
        return fpm_0.b().g().c(this.F) != null;
    }

    @Override
    public void a(String string, Object object) {
        switch (string) {
            case "widthInput": {
                this.D = cdy_1.a(object);
                fis_1.a().a((ajf_1)this, s);
                break;
            }
            case "heightInput": {
                this.E = cdy_1.a(object);
                fis_1.a().a((ajf_1)this, t);
                break;
            }
            case "textureInput": {
                this.F = object.toString();
                fis_1.a().a((ajf_1)this, u);
                break;
            }
            case "withStatesInput": {
                this.G = Boolean.parseBoolean(object.toString());
                break;
            }
            case "gapInput": {
                this.H = cdy_1.a(object);
                break;
            }
            case "xWestInput": {
                this.I = cdy_1.a(object);
                break;
            }
            case "xCenterInput": {
                this.J = cdy_1.a(object);
                break;
            }
            case "xEastInput": {
                this.K = cdy_1.a(object);
                break;
            }
            case "yNorthInput": {
                this.L = cdy_1.a(object);
                break;
            }
            case "yCenterInput": {
                this.M = cdy_1.a(object);
                break;
            }
            case "ySouthInput": {
                this.N = cdy_1.a(object);
                break;
            }
            case "westWidthInput": {
                this.O = cdy_1.a(object);
                break;
            }
            case "centerWidthInput": {
                this.P = cdy_1.a(object);
                break;
            }
            case "eastWidthInput": {
                this.Q = cdy_1.a(object);
                break;
            }
            case "northHeightInput": {
                this.R = cdy_1.a(object);
                break;
            }
            case "centerHeightInput": {
                this.S = cdy_1.a(object);
                break;
            }
            case "southHeightInput": {
                this.T = cdy_1.a(object);
            }
        }
    }

    private static int a(Object object) {
        if (!(object instanceof String)) {
            return 0;
        }
        String string = (String)object;
        if (Cz.f(string)) {
            return 0;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    @Override
    public void b(String string, Object object) {
    }

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public boolean a_(String string) {
        return string.endsWith("Input");
    }

    public fby_2 a() {
        fby_2 fby_22 = fby_2.checkOut();
        ays_2 ays_22 = null;
        if (!Cz.f(this.F)) {
            ays_22 = fpm_0.b().g().c(this.F);
        }
        if (ays_22 == null) {
            return null;
        }
        fby_22.setPixmaps(new ayo_2(ays_22, this.I, this.L, this.O, this.R), new ayo_2(ays_22, this.J, this.L, this.P, this.R), new ayo_2(ays_22, this.K, this.L, this.Q, this.R), new ayo_2(ays_22, this.I, this.M, this.O, this.S), new ayo_2(ays_22, this.J, this.M, this.P, this.S), new ayo_2(ays_22, this.K, this.M, this.Q, this.S), new ayo_2(ays_22, this.I, this.N, this.O, this.T), new ayo_2(ays_22, this.J, this.N, this.P, this.T), new ayo_2(ays_22, this.K, this.N, this.Q, this.T));
        fby_22.setScaled(true);
        return fby_22;
    }

    public void b() {
        StringBuilder stringBuilder = new StringBuilder();
        fqp_0[] fqp_0Array = new fqp_0[]{fqp_0.a, fqp_0.g, fqp_0.e, fqp_0.c, fqp_0.b, fqp_0.h, fqp_0.f, fqp_0.d};
        if (this.G) {
            int n = 0;
            for (fqp_0 fqp_02 : fqp_0Array) {
                stringBuilder.append("<!-- ").append((Object)fqp_02).append(" -->\n");
                this.a(stringBuilder, n);
                n += this.E + this.H;
            }
        } else {
            stringBuilder.append("<!-- ").append((Object)fqp_0.a.b()).append(" -->\n");
            this.a(stringBuilder, 0);
        }
        this.U = stringBuilder.toString();
        fis_1.a().a((ajf_1)this, w);
    }

    private void a(StringBuilder stringBuilder, int n) {
        stringBuilder.append(y);
        stringBuilder.append(String.format(A, this.F, frs_0.a.name(), this.I, n + this.L, this.O, this.R));
        stringBuilder.append(String.format(A, this.F, frs_0.b.name(), this.J, n + this.L, this.P, this.R));
        stringBuilder.append(String.format(A, this.F, frs_0.c.name(), this.K, n + this.L, this.Q, this.R));
        stringBuilder.append(String.format(A, this.F, frs_0.d.name(), this.I, n + this.M, this.O, this.S));
        stringBuilder.append(String.format(A, this.F, frs_0.e.name(), this.J, n + this.M, this.P, this.S));
        stringBuilder.append(String.format(A, this.F, frs_0.f.name(), this.K, n + this.M, this.Q, this.S));
        stringBuilder.append(String.format(A, this.F, frs_0.g.name(), this.I, n + this.N, this.O, this.T));
        stringBuilder.append(String.format(A, this.F, frs_0.h.name(), this.J, n + this.N, this.P, this.T));
        stringBuilder.append(String.format(A, this.F, frs_0.i.name(), this.K, n + this.N, this.Q, this.T));
        stringBuilder.append(z);
    }

    public List<String> c() {
        return this.C;
    }

    public int e() {
        return this.D;
    }

    public int f() {
        return this.E;
    }

    public String g() {
        return this.F;
    }

    public boolean h() {
        return this.G;
    }

    public int i() {
        return this.H;
    }

    public int j() {
        return this.I;
    }

    public int k() {
        return this.J;
    }

    public int l() {
        return this.K;
    }

    public int m() {
        return this.L;
    }

    public int n() {
        return this.M;
    }

    public int o() {
        return this.N;
    }

    public int p() {
        return this.O;
    }

    public int q() {
        return this.P;
    }

    public int r() {
        return this.Q;
    }

    public int s() {
        return this.R;
    }

    public int t() {
        return this.S;
    }

    public int u() {
        return this.T;
    }

    public String v() {
        return this.U;
    }

    public void a(int n) {
        this.D = n;
    }

    public void b(int n) {
        this.E = n;
    }

    public void a(String string) {
        this.F = string;
    }

    public void a(boolean bl) {
        this.G = bl;
    }

    public void c(int n) {
        this.H = n;
    }

    public void d(int n) {
        this.I = n;
    }

    public void e(int n) {
        this.J = n;
    }

    public void f(int n) {
        this.K = n;
    }

    public void g(int n) {
        this.L = n;
    }

    public void h(int n) {
        this.M = n;
    }

    public void i(int n) {
        this.N = n;
    }

    public void j(int n) {
        this.O = n;
    }

    public void k(int n) {
        this.P = n;
    }

    public void l(int n) {
        this.Q = n;
    }

    public void m(int n) {
        this.R = n;
    }

    public void n(int n) {
        this.S = n;
    }

    public void o(int n) {
        this.T = n;
    }

    public void c(String string) {
        this.U = string;
    }

    public String toString() {
        return "NinePatchFieldProvider(m_width=" + this.e() + ", m_height=" + this.f() + ", m_texture=" + this.g() + ", m_withStates=" + this.h() + ", m_gap=" + this.i() + ", m_xWest=" + this.j() + ", m_xCenter=" + this.k() + ", m_xEast=" + this.l() + ", m_yNorth=" + this.m() + ", m_yCenter=" + this.n() + ", m_ySouth=" + this.o() + ", m_westWidth=" + this.p() + ", m_centerWidth=" + this.q() + ", m_eastWidth=" + this.r() + ", m_northHeight=" + this.s() + ", m_centerHeight=" + this.t() + ", m_southHeight=" + this.u() + ")";
    }
}


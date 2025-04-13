/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XG
 */
public enum xg_0 {
    a(0, new String[]{":)", ":]", ":}", "=)", "=]", ":-)", ":o)"}, "AnimSourire"),
    b(1, new String[]{":(", ":[", ":{", "=(", "=/", ":-(", "._.", "v_v", "\u00e9_\u00e8"}, "AnimTriste"),
    c(2, new String[]{";)", ";]", ";-)", ",-)", "*-)"}, "AnimClinOeil"),
    d(3, new String[]{":D", "=D", "8D", "|D", ":-D"}, "AnimGrosSourire"),
    e(4, new String[]{":/", "X/", "X'(", ":*(", "X_+", "+_X", ":s", ":S", ":x", ":-s", ":-S", "'x'", "(\u00b0~\u00b0)"}, "AnimMalade"),
    f(5, new String[]{"xD", "8D", "X3", "XD"}, "AnimMoqueur"),
    g(6, new String[]{";D", "*o*", "*-*", "*3*", "\u00b03\u00b0", "^3^", "8-)", "8)"}, "AnimAmoureux"),
    h(7, new String[]{"-_-", "-.-", ":-|", ":|", "'-_-", "'_'", "-.-'", "--'"}, "AnimBlaser"),
    i(8, new String[]{":@", "\u00e8_\u00e9", ">(", ">:("}, "AnimColere"),
    j(9, new String[]{":p", ":b", ":P", ":6", ":9", ":-p", ":-b", ":-P"}, "AnimTireLangue"),
    k(10, new String[]{":O", "D:", ":-O", "O.O", "O_O"}, "AnimPeur"),
    l(11, new String[]{":'(", ":'-(", ";_;", "T-T", "T_T", "u_u", "U_U", "q_q", "QQ"}, "AnimPleure"),
    m(12, new String[]{":$", "^^", "^.^", "^_^", "n_n", "(^^)", "(^.^)", "(^_^)", "^^'"}, "AnimRougit"),
    n(13, new String[]{":o", ":0", "^^'", "-_-'", "'_'", "'A'", "'o'", "o_o"}, "AnimSueur"),
    o(14, new String[]{":-E", "\u00e8_\u00e9", "X(", "x(", "x[", "@_@", "OwO", "\u00a4_\u00a4"}, "AnimEnrager"),
    p(15, new String[]{"??", ":?"}, "AnimInterogation"),
    q(16, new String[]{"oo*", "oO*", "OO*", "Oo*"}, "AnimIdee"),
    r(17, new String[]{"{3", ":heart:", "K3|", "K3I"}, "AnimCoeur"),
    s(18, new String[]{"gg", "GG", "Gg", "gg!", "GG!", "GG!!", "GG!!!"}, "AnimGG"),
    t(19, new String[]{"loot", "LOOT", "Loot", "loot!", "LOOT!", "LOOOT", "LOOOOT"}, "AnimLoot");

    private final int u;
    private final String[] v;
    private final String w;
    private final String x;

    private xg_0(int n2, String[] stringArray, String string2) {
        this.u = n2;
        this.v = stringArray;
        this.w = xg_0.a(stringArray);
        this.x = string2;
    }

    public int a() {
        return this.u;
    }

    public String b() {
        return this.w;
    }

    public String c() {
        return this.v[0];
    }

    public String d() {
        return this.x;
    }

    public static int a(int n, int n2) {
        return n2 * 100 + n;
    }

    public static xg_0 a(int n) {
        for (xg_0 xg_02 : xg_0.values()) {
            if (n != xg_02.u) continue;
            return xg_02;
        }
        return null;
    }

    public boolean a(String string) {
        for (String string2 : this.v) {
            if (!string2.equals(string)) continue;
            return true;
        }
        return false;
    }

    private static String a(String[] stringArray) {
        Object object = "";
        for (int k = 0; k < stringArray.length; ++k) {
            String string = stringArray[k];
            object = (String)object + xg_0.b(string);
            if (k >= stringArray.length - 1) continue;
            object = (String)object + " ";
        }
        return object;
    }

    private static String b(String string) {
        return string;
    }
}


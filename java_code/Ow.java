/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum Ow {
    a(0, "fr", "Fran\u00e7ais", "fr", "fr", "fr", true, true, true),
    b(1, "en", "Anglais", "en", "en", "en-us", true, true, true),
    c(2, "es", "Espagnol", "es", "es", "es", true, true, true),
    d(3, "pt", "Portugais", "pt", "pt", "pt-br", true, true, true),
    e(8, "de", "Allemand", "de", "de", "de", true, false, true),
    f(9, "it", "Italien", "it", "it", null, true, false, true),
    g(10, "nl", "Neerlandais", "nl", "nl", null, true, false, true),
    h(11, "jp", "Japonais", "ja", "ja", null, false, false, false),
    i(12, "ja", "Japonais", "ja", "ja", null, false, false, false),
    j(13, "ru", "Russe", "ru", "ru", null, true, false, true),
    k(14, "ko", "Coreen", "ko", "ko", null, false, false, false),
    l(15, "ms", "Malay", "ms", "ms", null, true, false, true),
    m(16, "tl", "Tagalog", "tl", "tl", null, true, false, true);

    public static final byte n = -1;
    public static final Ow o;
    public static final List<Ow> p;
    public static final List<Ow> q;
    public static final int r;
    private static final Logger t;
    public static final String s = ";";
    private final byte u;
    private final Locale v;
    private final Locale w;
    private final String x;
    private final String y;
    private final boolean z;
    private final boolean A;
    private final boolean B;
    private final String C;
    @Nullable
    private final String D;
    private static final Map<String, Ow> E;

    private Ow(byte by, String string2, String string3, String string4, String string5, String string6, boolean bl, boolean bl2, boolean bl3) {
        this.u = by;
        this.C = string5;
        this.v = new Locale(string2);
        this.w = new Locale(string4);
        this.x = string2;
        this.y = string3;
        this.z = bl;
        this.A = bl2;
        this.B = bl3;
        this.D = string6;
    }

    public Locale a() {
        return this.v;
    }

    public Locale b() {
        return this.w;
    }

    @NotNull
    public static Ow a(String string) {
        return Ow.a(string, false);
    }

    public static Ow a(String string, boolean bl) {
        if (string == null) {
            return bl ? null : o;
        }
        Ow ow = E.get(string.toLowerCase());
        if (ow != null || bl) {
            return ow;
        }
        t.warn((Object)("unknown language code: " + string));
        return o;
    }

    public static Ow a(byte by) {
        return Ow.b(by).orElse(o);
    }

    public static Optional<Ow> b(byte by) {
        for (Ow ow : Ow.values()) {
            if (ow.u != by) continue;
            return Optional.of(ow);
        }
        return Optional.empty();
    }

    public static boolean a(Ow[] owArray, Ow ow) {
        if (owArray == null || ow == null) {
            return false;
        }
        for (Ow ow2 : owArray) {
            if (ow2 != ow) continue;
            return true;
        }
        return false;
    }

    public static byte a(Iterable<Ow> iterable) {
        if (iterable == null) {
            return 0;
        }
        int n = 0;
        for (Ow ow : iterable) {
            n |= 1 << ow.u;
        }
        return (byte)n;
    }

    public static List<Ow> c(byte by) {
        ArrayList<Ow> arrayList = new ArrayList<Ow>();
        for (Ow ow : Ow.values()) {
            if ((by & 1 << ow.u) <= 0) continue;
            arrayList.add(ow);
        }
        return arrayList;
    }

    public byte c() {
        return this.u;
    }

    public String d() {
        return this.y;
    }

    public boolean e() {
        return this.z;
    }

    public boolean f() {
        return this.A;
    }

    public boolean g() {
        return this.B;
    }

    public String h() {
        return this.x;
    }

    public String i() {
        return this.C;
    }

    public String j() {
        if (this.D == null) {
            return Ow.o.D;
        }
        return this.D;
    }

    static {
        o = b;
        p = List.of(a, b, c, d);
        q = Arrays.stream(Ow.values()).filter(ow -> ow.A).collect(Collectors.toUnmodifiableList());
        r = q.size();
        t = Logger.getLogger(Ow.class);
        E = new HashMap<String, Ow>();
        for (Ow ow2 : Ow.values()) {
            E.put(ow2.x.toLowerCase(), ow2);
        }
    }
}


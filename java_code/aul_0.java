/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from aUl
 */
public class aul_0 {
    private static final Pattern a = Pattern.compile("<[^<>]*>");
    private static final Logger b = Logger.getLogger(aul_0.class);
    private static final Logger c = Logger.getLogger((String)"chat");
    private static final aul_0 d = new aul_0();
    private aVn e;
    private aum_0 f;
    private EnumMap<aup_0, aUn> g;
    private final LinkedList<String> h = new LinkedList();
    private final LinkedList<String> i = new LinkedList();
    private boolean j = false;

    public static aul_0 a() {
        return d;
    }

    public void a(avt_0 avt_02, URL uRL, aum_0 aum_02) {
        this.e = new aVn();
        this.e.b(false);
        this.e.a(false);
        this.e.a(avt_02);
        if (uRL != null) {
            this.e.a(uRL);
        } else {
            b.error((Object)"Impossible de charger les commandes de chat !");
        }
        this.f = aum_02;
    }

    public aVn b() {
        return this.e;
    }

    public aUn a(aup_0 aup_02) {
        return this.a(new aVf(aup_02));
    }

    public aUn b(aup_0 aup_02) {
        return this.a(new aVd(aup_02));
    }

    public aUn c(aup_0 aup_02) {
        return this.a(new aVe(aup_02));
    }

    private aUn a(aUn aUn2) {
        if (this.g == null) {
            this.g = new EnumMap(aup_0.class);
        }
        this.g.put(aUn2.a(), aUn2);
        return aUn2;
    }

    public aUn d(aup_0 aup_02) {
        return this.g.get((Object)aup_02);
    }

    public aUn a(String string) {
        for (aUn aUn2 : this.g.values()) {
            if (!aUn2.e().equals(string)) continue;
            return aUn2;
        }
        return null;
    }

    public void a(String string, aup_0 aup_02) {
        aUm aUm2 = new aUm(string);
        aUm2.a(aup_02);
        this.b(aUm2);
        aUn aUn2 = this.g.get((Object)aUm2.a());
        if (aUn2 instanceof aVd) {
            b.warn((Object)"Wrong function used for a bubble pipe, use pushChatMessage() instead");
        }
        aUn2.a(aUm2);
    }

    public void b(String string) {
        this.a(string, aup_0.d);
    }

    public void c(String string) {
        this.a(string, aup_0.e);
    }

    public void d(String string) {
        if (string.contains("color=")) {
            this.a(string, aup_0.e);
            return;
        }
        String string2 = new ani_2().i().a(aug_0.f).a((CharSequence)string).j().r();
        this.a(string2, aup_0.e);
    }

    public void e(String string) {
        this.a(string, aup_0.i);
    }

    public void a(aUm aUm2, String string, boolean bl) {
        this.a(aUm2, bl);
        aUn aUn2 = this.g.get((Object)aUm2.a());
        aUn2.a(aUm2, string);
    }

    public void a(aUm aUm2) {
        this.b(aUm2);
        aUn aUn2 = this.g.get((Object)aUm2.a());
        aUn2.a(aUm2);
    }

    private void b(aUm aUm2) {
        String string = this.g.get((Object)aUm2.a()).e();
        String string2 = aUm2.d();
        String string3 = aUm2.e();
        c.info((Object)("[" + string + "] " + (String)(string2 == null ? "" : string2 + " : ") + aul_0.g(string3)));
    }

    private void a(aUm aUm2, boolean bl) {
        String string = this.g.get((Object)aUm2.a()).e();
        String string2 = aUm2.d();
        String string3 = aUm2.e();
        String string4 = string2 == null ? "[" + string + "] " + aul_0.g(string3) : (bl ? "[" + string + "] TO \"" + string2 + "\" : " + aul_0.g(string3) : "[" + string + "] FROM \"" + string2 + "\" : " + aul_0.g(string3));
        c.info((Object)string4);
    }

    private static String g(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = string.trim();
        Matcher matcher = a.matcher(string2);
        int n = 0;
        while (matcher.find()) {
            stringBuilder.append(string2, n, matcher.start());
            n = matcher.end();
        }
        stringBuilder.append(string2, n, string2.length());
        return stringBuilder.toString();
    }

    public String a(boolean bl) {
        String string;
        if (this.h.isEmpty()) {
            return null;
        }
        if (bl) {
            string = this.h.removeFirst();
            this.h.addLast(string);
        } else {
            string = this.h.removeLast();
            this.h.addFirst(string);
        }
        return string;
    }

    public void f(String string) {
        if (this.h.contains(string)) {
            this.h.remove(string);
            this.h.addLast(string);
        } else {
            this.h.add(string);
        }
        if (!this.i.contains(string)) {
            this.i.add(string);
        }
        if (this.i.size() > 10 || this.h.size() > 10) {
            String string2 = this.i.removeFirst();
            this.h.remove(string2);
        }
    }

    public void c() {
        this.h.clear();
        this.i.clear();
        for (aUn aUn2 : this.g.values()) {
            aUn2.m();
        }
    }

    public Collection<aUn> d() {
        return this.g.values();
    }

    public aum_0 e() {
        return this.f;
    }

    public boolean f() {
        return this.j;
    }

    public void b(boolean bl) {
        this.j = bl;
    }
}


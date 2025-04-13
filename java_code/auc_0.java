/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Renamed from aUc
 */
public abstract class auc_0
implements ajf_1,
aUo {
    public static final String a = "chat.dialogView";
    public static final String b = "input";
    public static final String d = "history";
    public static final String e = "channelsList";
    public static final String f = "currentChannel";
    public static final String g = "privateName";
    public static final String h = "currentChannelName";
    public static final String i = "isPaused";
    public static final String[] j = new String[]{"history", "input", "channelsList", "currentChannel", "privateName", "currentChannelName", "isPaused"};
    private final List<aup_0> k;
    private ArrayList<aup_0> l;
    private String m = "";
    private String n = "";
    private static final int o = 100;
    private final EnumMap<aup_0, ArrayList<aUY>> p = new EnumMap(aup_0.class);
    private int q;
    private aUY r = null;
    private String s = "";
    private boolean t;
    private String u = "";

    protected auc_0(int n, List<aup_0> list) {
        this.q = n;
        this.k = List.copyOf(list);
        this.l = new ArrayList<aup_0>(list);
    }

    public void a() {
        ArrayList<aUm> arrayList = new ArrayList<aUm>();
        for (ArrayList<aUY> arrayList2 : this.p.values()) {
            for (aUY aUY2 : arrayList2) {
                if (!this.a(aUY2.b().a())) continue;
                auc_0.a(arrayList, aUY2.b());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        arrayList.stream().distinct().sorted().forEach(aUm2 -> stringBuilder.append(this.a((aUm)aUm2)));
        this.n = this.c(stringBuilder.toString());
        ajg_1.a().a((ajf_1)this, d);
    }

    private static void a(ArrayList<aUm> arrayList, aUn aUn2) {
        if (aUn2 == null) {
            return;
        }
        if (aUn2.i() != null) {
            arrayList.addAll(aUn2.i());
        }
        if (aUn2.l() != null) {
            for (aUn aUn3 : aUn2.l().values()) {
                auc_0.a(arrayList, aUn3);
            }
        }
    }

    protected abstract String a(aUm var1);

    public List<auxx_0> b() {
        ArrayList<auxx_0> arrayList = new ArrayList<auxx_0>();
        for (aup_0 aup_02 : this.k) {
            aUn aUn2 = aul_0.a().d(aup_02);
            if (!this.a(aUn2)) continue;
            arrayList.add(new auxx_0(aUn2, this.a(aup_02)));
        }
        Optional<Integer> optional = this.n();
        int n = optional.isPresent() && (Integer)optional.get() > 62 ? ((Integer)optional.get() - 62) / 13 : arrayList.size();
        return arrayList.stream().sorted(Comparator.comparingInt(auxx_0::e)).limit(n).collect(Collectors.toList());
    }

    private Optional<Integer> n() {
        aUv aUv2 = aUxx.a().d(this.q);
        if (aUv2 == null) {
            return Optional.empty();
        }
        fyy_0 fyy_02 = fpm_0.b().h().d(dey.a(aUv2.a()));
        if (fyy_02 == null) {
            return Optional.empty();
        }
        fyb_0 fyb_02 = fyy_02.a("chatWindow");
        if (!(fyb_02 instanceof fvk_0)) {
            return Optional.empty();
        }
        return Optional.of(((fvk_0)fyb_02).getSize().height);
    }

    public boolean a(aUn aUn2) {
        return aUn2.f() && ((bvx_0)ans_0.D().h()).b(aUn2.h());
    }

    public boolean a(aup_0 aup_02) {
        return this.l.contains((Object)aup_02);
    }

    public boolean a(aup_0 aup_02, boolean bl) {
        if (bl) {
            if (this.a(aup_02)) {
                return false;
            }
            this.l.add(aup_02);
            aUn aUn3 = aul_0.a().d(aup_02);
            this.a(aUn3, aud_0.a);
            if (!this.l()) {
                aUn3.l().values().forEach(aUn2 -> this.a((aUn)aUn2, aud_0.a));
            }
        } else {
            if (!this.a(aup_02)) {
                return false;
            }
            this.l.remove((Object)aup_02);
            this.d(aup_02);
        }
        return true;
    }

    public aUY a(aUn aUn2, aud_0 aud_02) {
        return this.a(aUn2, aud_02, null);
    }

    public aUY a(aUn aUn2, aud_0 aud_02, auv_0 auv_02) {
        aUY aUY2;
        ArrayList<aUY> arrayList;
        if (aud_02 == aud_0.a) {
            aUn2.a(this);
        }
        if ((arrayList = this.p.get((Object)aUn2.a())) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(aUY2 = new aUY(aUn2, aUn2.e(), aud_02, auv_02))) {
            return null;
        }
        aUY2.a(aUn2.f());
        arrayList.add(aUY2);
        this.p.put(aUn2.a(), arrayList);
        this.b(aUY2);
        return aUY2;
    }

    public boolean b(aup_0 aup_02) {
        ArrayList<aUY> arrayList = this.p.get((Object)aup_02);
        if (arrayList == null) {
            return false;
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            aUY aUY2 = arrayList.get(k);
            if (aUY2.e() == aud_0.a) continue;
            return true;
        }
        return false;
    }

    public void c(aup_0 aup_02) {
        ArrayList<aUY> arrayList = this.p.get((Object)aup_02);
        if (arrayList == null) {
            return;
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            aUY aUY2 = arrayList.get(k);
            if (aUY2.e() == aud_0.a) continue;
            arrayList.remove(k);
        }
    }

    protected void d(aup_0 aup_02) {
        ArrayList<aUY> arrayList = this.p.get((Object)aup_02);
        if (arrayList == null) {
            return;
        }
        for (aUY aUY2 : arrayList) {
            aUn aUn2 = aUY2.b();
            aUn2.b(this);
            for (aUn aUn3 : aUn2.l().values()) {
                aUn3.b(this);
            }
        }
    }

    public List<aUY> c() {
        ArrayList<aUY> arrayList = new ArrayList<aUY>();
        for (ArrayList<aUY> arrayList2 : this.p.values()) {
            for (aUY aUY2 : arrayList2) {
                if (!aUY2.i()) continue;
                arrayList.add(aUY2);
            }
        }
        arrayList.sort(Comparator.comparingInt(aUY::g).reversed());
        return arrayList;
    }

    public aUY a(aUW aUW2, boolean bl) {
        ArrayList<aUY> arrayList = new ArrayList<aUY>();
        for (ArrayList<aUY> object2 : this.p.values()) {
            for (aUY aUY3 : object2) {
                if (aUW2 != aUY3.a() || aUY3.e() == aud_0.a) continue;
                arrayList.add(aUY3);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Optional<aUY> optional = arrayList.stream().min(Comparator.comparing(aUY2 -> aUY2.b().l().size()));
        aUY aUY4 = (aUY)optional.get();
        this.a(aUY4);
        return aUY4;
    }

    private void a(aUY aUY2) {
        if (aUY2 != this.r && (aUY2 == null || aUY2.e() != aud_0.a)) {
            this.r = aUY2;
            ajg_1.a().a((ajf_1)this.r, aUY.h);
            ajg_1.a().a((ajf_1)this, f, h);
        }
    }

    public aUY e() {
        return this.r;
    }

    private void b(aUY aUY2) {
        if (aUY2.e() != aud_0.a) {
            ajg_1.a().a((ajf_1)this, e);
        }
    }

    @Override
    public void b(aUm aUm2) {
        String string = this.a(aUm2);
        this.c(d, string);
        ajg_1.a().a((ajf_1)this, d);
    }

    @Override
    public void b(aUn aUn2, aud_0 aud_02) {
        if (!this.l()) {
            this.a(aUn2, aud_02);
        }
    }

    @Override
    public String[] d() {
        return j;
    }

    public int f() {
        return this.q;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.m;
        }
        if (string.equals(d)) {
            return this.n;
        }
        if (string.equals(e)) {
            return this.c();
        }
        if (string.equals(g)) {
            return this.g();
        }
        if (string.equals(i)) {
            return this.t;
        }
        if (string.equals(f)) {
            return this.r;
        }
        if (string.equals(h)) {
            String string2 = this.g();
            return string2 != null ? string2 : (this.r != null ? this.r.c() : null);
        }
        return null;
    }

    public String g() {
        if (this.s == null) {
            return null;
        }
        int n = this.s.indexOf(32) + 1;
        if (n == 0 || n > this.s.length() - 1) {
            return null;
        }
        return this.s.substring(n).replaceAll("\"", "");
    }

    @Override
    public void a(String string, Object object) {
        if (string.equals(b)) {
            this.m = (String)object;
        } else if (string.equals(d)) {
            this.n = this.c((String)object);
        }
    }

    @Override
    public void b(String string, Object object) {
        if (string.equals(b)) {
            this.m = this.m == null ? (String)object : object + this.m;
        }
    }

    @Override
    public void c(String string, Object object) {
        if (string.equals(d)) {
            if (this.t) {
                this.u = this.u.length() == 0 ? this.c(this.n + object) : this.c(this.u + object);
            } else if (this.u.length() == 0) {
                this.n = this.c(this.n + object);
            } else {
                this.n = this.u;
                this.u = "";
            }
        } else if (string.equals(b)) {
            this.m = this.m == null ? (String)object : this.m + object;
        }
    }

    private String c(String string) {
        String[] stringArray = Cz.a(string, '\n');
        int n = 0;
        int n2 = stringArray.length;
        if (n2 > 100) {
            for (int k = 0; k < n2 - 100; ++k) {
                n += stringArray[k].length() + 1;
            }
        }
        return string.substring(n);
    }

    @Override
    public boolean a_(String string) {
        return string.equals(b);
    }

    public void h() {
        this.n = "";
        this.u = "";
        this.m = "";
        ajg_1.a().a((ajf_1)this, d, b);
    }

    public String i() {
        return this.s;
    }

    public final void a(String string) {
        this.s = string;
        ajg_1.a().a((ajf_1)this, h, g);
    }

    public void a(int n) {
        this.q = n;
    }

    public void a(boolean bl) {
        this.t = bl;
        if (!this.t) {
            this.c(d, this.u);
        }
        ajg_1.a().a((ajf_1)this, d, i);
    }

    public boolean j() {
        return this.t;
    }

    public void k() {
        for (ArrayList<aUY> arrayList : this.p.values()) {
            for (aUY aUY2 : arrayList) {
                aUn aUn2 = aUY2.b();
                aUn2.b(this);
                Map<String, aUn> map = aUn2.l();
                ArrayList arrayList2 = Lists.newArrayList(map.values());
                for (aUn aUn3 : arrayList2) {
                    aUn3.b(this);
                    if (!aUn3.k()) continue;
                    aUn2.a(aUn3);
                }
            }
        }
        this.p.clear();
    }

    public boolean l() {
        return false;
    }

    public ArrayList<aup_0> m() {
        return this.l;
    }

    public void a(List<aup_0> list) {
        this.l = new ArrayList<aup_0>(list);
    }

    public void a(long l, String string) {
        for (ArrayList<aUY> arrayList : this.p.values()) {
            for (aUY aUY2 : arrayList) {
                if (aUY2.e() != aud_0.a || !aUY2.b().n()) continue;
                auc_0.a(aUY2.b(), l, string);
            }
        }
    }

    private static void a(aUn aUn2, long l, String string) {
        if (aUn2 == null) {
            return;
        }
        if (aUn2.i() != null) {
            for (aUm object : aUn2.i()) {
                if (l != object.c() && !string.equals(object.d())) continue;
                object.j();
            }
        }
        if (aUn2.l() != null) {
            for (aUn aUn3 : aUn2.l().values()) {
                auc_0.a(aUn3, l, string);
            }
        }
    }
}


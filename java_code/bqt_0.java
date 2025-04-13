/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bQT
 */
public class bqt_0
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bqt_0.class);
    public static final String b = "currentName";
    public static final String d = "linksByIsland";
    public static final String e = "iconUrl";
    public static final String f = "transportType";
    private final Map<Integer, bqp_0> h = new HashMap<Integer, bqp_0>();
    private long i;
    private int j;
    private boolean k;
    public static String g;
    private static final Pattern l;
    private static final List<Integer> m;
    private static final bqq_0 n;

    public boolean a(long l, boolean bl) {
        List<Long> list = enp_2.a.h(ens_2.h);
        this.k = bl;
        this.h.clear();
        bqt_0.n.e();
        this.i = l;
        if (this.k) {
            this.j = -1;
        } else {
            Object Info = fjs.a.a(fjv.a, this.i);
            this.j = ((fjB)Info).g();
        }
        long l2 = azu_0.j().n().u();
        bmr_1 bmr_12 = azu_0.j().k();
        Set<Integer> set = fjq_0.a(l2, ay_0.a);
        set.addAll(fjs.a.c());
        set.forEach(n -> {
            bqs_0 bqs_02;
            fjE fjE2 = (fjE)fjs.a.a(fjv.a, (long)n.intValue());
            if (fjE2 == null || fjE2.e() == l || !fjE2.a(bmr_12)) {
                return;
            }
            if (list.contains(fjE2.c())) {
                return;
            }
            int n2 = fjE2.k();
            bqp_0 bqp_02 = this.h.getOrDefault(n2, new bqp_0(fjs.a.c(n2)));
            this.h.putIfAbsent(n2, bqp_02);
            fjF fjF2 = bl ? new fjF(0L, (int)l, (int)fjE2.e()) : fjs.a.b(l, fjE2.e());
            boolean bl2 = true;
            TByteHashSet tByteHashSet = new TByteHashSet();
            emg_0 emg_02 = bmr_12.N_();
            eny_0 eny_02 = enz_0.a.a(fjE2.c(), emg_02.c());
            if (eny_02 == eny_0.d && !emg_02.a(enw_0.t)) {
                bl2 = false;
                tByteHashSet.add((byte)1);
            }
            if (m.contains((int)(bqs_02 = new bqs_0(fjF2, this.i, fjE2.j(), bl2, tByteHashSet)).a())) {
                bqs_02.a(true);
                bqt_0.n.a(bqs_02);
            }
            bqp_02.a(bqs_02);
        });
        return true;
    }

    @Override
    public String[] d() {
        return null;
    }

    public List<bqp_0> a() {
        ArrayList<bqp_0> arrayList = new ArrayList<bqp_0>();
        for (bqp_0 bqp_02 : this.h.values()) {
            if (bqp_02.c().isEmpty()) continue;
            arrayList.add(bqp_02);
        }
        if (!n.c().isEmpty()) {
            arrayList.add(n);
        }
        arrayList.sort(bqu_0.a);
        return arrayList;
    }

    public void a(String string) {
        g = string;
        fis_1.a().a((ajf_1)this, d);
    }

    public void a(long l) {
        for (bqp_0 bqp_02 : this.h.values()) {
            bqs_0 bqs_02 = bqp_02.a(l);
            if (bqs_02 == null) continue;
            bqs_02.a(!bqs_02.f());
            Integer n = (int)l;
            boolean bl = m.contains(n);
            if (bqs_02.f() && !bl) {
                m.add(n);
                bqt_0.n.a(bqs_02);
                this.c();
            } else if (!bqs_02.f() && bl) {
                m.remove(n);
                bqt_0.n.b(bqs_02);
                this.c();
            }
            fis_1.a().a((ajf_1)this, d);
            return;
        }
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            return this.h.isEmpty() ? null : this.a();
        }
        if (string.equals(b)) {
            return this.k ? bae.h().a("haven.world.zaap.name", new Object[0]) : bae.h().a(36, (long)((int)this.i), new Object[0]);
        }
        if (string.equals(e)) {
            return azs_0.a().a("zaapTypeIconPath", "defaultIconPath", this.j == -1 ? bqn_0.a.a() : this.j);
        }
        if (string.equals(f)) {
            return bqn_0.a.a();
        }
        return null;
    }

    private static List<Integer> b() {
        a.info((Object)"Loading list of favourite zaaps");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String string = azr_0.a().a((byte)1, bWe.aH.b());
        if (Strings.isNullOrEmpty((String)string)) {
            return arrayList;
        }
        Matcher matcher = l.matcher(string);
        while (matcher.find()) {
            String string2 = matcher.group(1);
            try {
                arrayList.add(Integer.valueOf(string2));
            }
            catch (NumberFormatException numberFormatException) {
                a.error((Object)("An error was thrown while parsing favourite zaaps: could not cast value to long. Value: " + string2));
            }
        }
        return arrayList;
    }

    private void c() {
        a.info((Object)"Saving favourite zaaps");
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer n : m) {
            stringBuilder.append(n).append(';');
        }
        azr_0.a().a((byte)1, bWe.aH.b(), stringBuilder.toString());
    }

    static {
        l = Pattern.compile("([0-9]+);?");
        m = bqt_0.b();
        n = new bqq_0();
    }
}


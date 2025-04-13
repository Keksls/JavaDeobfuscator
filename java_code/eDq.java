/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class eDq<EC extends Sm<efh_0>>
implements eDl {
    private static final Logger k = Logger.getLogger(eDq.class);
    protected final EC a;
    protected final int b;
    protected final short c;
    protected final boolean d;
    protected final ArrayList<String> e;
    protected final ArrayList<String> f;
    protected final eDk g;
    protected final int h;
    protected boolean i;
    protected boolean j;
    private boolean l;

    public eDq(EC EC, int n, short s2) {
        this.a = EC;
        this.b = n;
        this.c = s2;
        this.d = true;
        this.f = null;
        this.e = null;
        this.g = eDk.b;
        this.h = 0;
        this.i = false;
        this.j = false;
    }

    public eDq(EC EC, int n, short s2, boolean bl, ArrayList<String> arrayList, ArrayList<String> arrayList2, eDk eDk2, int n2) {
        this.a = EC;
        this.b = n;
        this.c = s2;
        this.d = bl;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = eDk2;
        this.h = n2;
        this.i = false;
        this.j = false;
    }

    @Override
    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<String>();
        short s2 = this.c;
        eDk eDk2 = this.g;
        int n = this.h;
        int n2 = this.b;
        this.a(arrayList);
        if (this.d) {
            Object object = this.a;
            if (object != null) {
                boolean bl = true;
                boolean bl2 = true;
                edl_0 edl_02 = new edl_0();
                int n3 = -1;
                Object object2 = this.a(object).iterator();
                while (object2.hasNext()) {
                    eDp eDp2;
                    int n4;
                    efh_0 efh_02 = object2.next();
                    if (efh_02 == null) {
                        k.error((Object)"Effet null", (Throwable)new Exception());
                        continue;
                    }
                    float f2 = efh_02.b(s2);
                    if (f2 < 0.0f || s2 > efh_02.P() || s2 < efh_02.O() || efh_02.a(1L) && eDk2.equals((Object)eDk.b) || !efh_02.a(1L) && eDk2.equals((Object)eDk.c)) continue;
                    ani_2 ani_22 = eDi.aq.a();
                    int n5 = efh_02.j();
                    Optional<Integer> optional = eDi.ar.j(n5);
                    if (optional.isPresent()) {
                        ani_22.a((CharSequence)"[").a(optional.get()).a((CharSequence)"]");
                    }
                    if (efh_02.a(1L) && bl2) {
                        bl2 = false;
                        if (eDk2.equals((Object)eDk.a)) {
                            arrayList.add(eDi.aq.a().a().a((CharSequence)eDi.ap.a(eDi.as, new Object[0])).b().r());
                        }
                    }
                    if ((n4 = this.a(efh_02, ani_22, eDp2 = eDi.e(n5))) == -1) continue;
                    bl = false;
                    String string = this.a(ani_22.r(), efh_02);
                    if ((string = eDq.a(string)).isEmpty()) continue;
                    String[] stringArray = string.split("\n");
                    if (edl_02.a(efh_02.j())) {
                        if (n3 == -1) {
                            n3 = arrayList.size();
                        }
                        edl_02.a(efh_02, stringArray[0], s2);
                        continue;
                    }
                    Collections.addAll(arrayList, stringArray);
                }
                if (n3 != -1) {
                    arrayList.addAll(n3, edl_02.a(eDi.ap));
                }
                if (bl) {
                    return arrayList;
                }
                if (eDi.ap.a(n, (long)n2) && !((String)(object2 = eDi.ap.a(n, (long)n2, new Object[0]))).isEmpty()) {
                    arrayList.add((String)object2);
                }
            }
        } else if (eDi.ap.a(n, (long)n2)) {
            arrayList.add(eDi.ap.a(n, (long)n2, new Object[0]));
        }
        if ((this.e != null || this.f != null) && !arrayList.isEmpty() && eDk2.equals((Object)eDk.a)) {
            arrayList.add(eDi.aq.a().a().a((CharSequence)eDi.ap.a(eDi.at, new Object[0])).b().r());
            if (this.e != null) {
                arrayList.addAll(this.e);
            }
            if (this.f != null) {
                for (String string : this.f) {
                    arrayList.add(eDi.ar.a(eDi.aq.a(), string).r());
                }
            }
        }
        this.b(arrayList);
        return arrayList;
    }

    private <EC extends Sm<efh_0>> List<efh_0> a(EC EC) {
        ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
        ArrayList<efh_0> arrayList2 = new ArrayList<efh_0>();
        for (efh_0 efh_02 : EC) {
            if (efh_02.a(1L)) {
                arrayList2.add(efh_02);
                continue;
            }
            arrayList.add(efh_02);
        }
        if (this.g == eDk.b) {
            return arrayList;
        }
        if (this.g == eDk.c) {
            return arrayList2;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    protected int a(efh_0 efh_02, ani_2 ani_22, eDp eDp2) {
        return eDp2.a(ani_22, efh_02, this);
    }

    public static String a(String string) {
        ani_2 ani_22 = eDi.aq.a();
        int n = 0;
        Matcher matcher = eDi.Z.matcher(string);
        try {
            while (matcher.find()) {
                int n2 = 0;
                String string2 = matcher.group(1);
                if (matcher.groupCount() == 4 && string2 != null) {
                    n2 = Co.c(Character.valueOf(string2.charAt(0)));
                }
                Number number = NumberFormat.getInstance(eDi.ap.f().a()).parse(matcher.group(2));
                float f2 = number.floatValue();
                String string3 = matcher.group(4);
                Matcher matcher2 = eDi.Y.matcher(string3);
                while (matcher2.find()) {
                    char c2 = matcher2.group(1).charAt(0);
                    float f3 = Float.parseFloat(matcher2.group(2));
                    switch (c2) {
                        case '+': {
                            f2 += f3;
                            break;
                        }
                        case '-': {
                            f2 -= f3;
                            break;
                        }
                        case '*': {
                            f2 *= f3;
                            break;
                        }
                        case '/': {
                            f2 /= f3;
                        }
                    }
                }
                ani_22.a(string, n, matcher.start());
                if (n2 == 0) {
                    ani_22.d(Hw.b(f2));
                } else if (n2 > 0) {
                    ani_22.a(Hw.a(f2, n2));
                }
                n = matcher.end();
            }
        }
        catch (Exception exception) {
            return "Error";
        }
        ani_22.a(string, n, string.length());
        return ani_22.toString();
    }

    @Override
    public void a(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public void b(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public String a(@NotNull String string, @NotNull efh_0 efh_02) {
        return string;
    }

    @Override
    public int b() {
        return this.b;
    }

    public EC c() {
        return this.a;
    }

    @Override
    public short d() {
        return this.c;
    }

    @Override
    public boolean e() {
        return this.d;
    }

    @Override
    public boolean a(efh_0 efh_02) {
        return (efh_02.Y() || eDi.ar.e()) && efh_02.O() <= this.c && efh_02.P() >= this.c;
    }

    @Override
    public ArrayList<String> g() {
        return this.e;
    }

    @Override
    public ArrayList<String> h() {
        return this.f;
    }

    @Override
    public eDk i() {
        return this.g;
    }

    @Override
    public int j() {
        return this.h;
    }

    @Override
    public void a(boolean bl) {
        this.i = bl;
    }

    @Override
    public boolean f() {
        return this.i;
    }

    @Override
    public boolean k() {
        return this.j;
    }

    @Override
    public void b(boolean bl) {
        this.j = bl;
    }

    @Override
    public boolean l() {
        return this.l;
    }

    @Override
    public void c(boolean bl) {
        this.l = bl;
    }
}

